/* TOTEM-v3.2 June 18 2008*/

/*
  * ===========================================================
 * TOTEM : A TOolbox for Traffic Engineering Methods
 * ===========================================================
 *
 * (C) Copyright 2004-2006, by Research Unit in Networking RUN, University of Liege. All Rights Reserved.
 *
 * Project Info:  http://totem.run.montefiore.ulg.ac.be
 *
 * This library is free software; you can redistribute it and/or modify it under the terms
 * of the GNU General Public License version 2.0 as published by the Free Software Foundation;
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this
 * library; if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA 02111-1307, USA.
 *
 * [Java is a trademark or registered trademark of Sun Microsystems, Inc.
 * in the United States and other countries.]
*/
package be.ac.ulg.montefiore.run.totem.util;

import be.ac.ulg.montefiore.run.totem.util.PriorityQueueObjectInt;

import java.util.HashMap;

/*
 * Changes:
 * --------
 *  14-Oct-2005: Fix update() method which worked only when decreasing cost, fix number of key comparisons counter. (GMO)
 */

/**
 * Priority queue with integers
 *
 * <p>Creation date: 22-Jun.-2004
 *
 * @author  Olivier Delcourt (delcourt@run.montefiore.ulg.ac.be)
 */
public class PriorityQueue implements PriorityQueueIFInt {

    protected PriorityQueueObjectInt heap[]; /* Priority Queue indexed with item's key*/
    protected HashMap pos; /* hash table of the elems indexed by item's id */
    protected int size; /* Size of the priority queue*/
    protected long keyComps; /* Number of key comparisons for performance monitoring */

    /**
     * Constructor
     *
     * @param capacity the maximum queue capacity
     */
    public PriorityQueue(int capacity) {
        pos = new HashMap(capacity);
        heap = new PriorityQueueObjectInt[capacity+1];
        //heap[0] = new CBFElem(0,0,0);
        size = 0;
        keyComps = 0;
    }

    /**
     * Get the object with the minimum key in the queue
     *
     * @return the object with the minimum key
     */
    public PriorityQueueObjectInt next() {
        return heap[1];
    }

    /**
     * Adds an object to the queue.
     *
     * @param elem the object to add
     */
    public void add(PriorityQueueObjectInt elem) {
        /* i - insertion point
        * j - parent of i
        * y - parent's entry in the heap.
        */
        int i, j;
        PriorityQueueObjectInt y;

        /* i initially indexes the new entry at the bottom of the heap. */
        i = ++(size);

        /* Stop if the insertion point reaches the top of the heap. */
        while(i >= 2) {
            /* j indexes the parent of i.  y is the parent's entry. */
            j = i / 2;
            y = heap[j];

            /* We have the correct insertion point when the items key is >= parent
            * Otherwise we move the parent down and insertion point up.
            */
            keyComps++;
            if (elem.getKey() >= y.getKey()) break;

            heap[i] = y;
            pos.put(new Integer(y.getId()),new Integer(i));
            i = j;
        }

        /* Insert the new item at the insertion point found. */
        heap[i] = elem;
        pos.put(new Integer(elem.getId()),new Integer(i));

    }

    /**
     * Removes and returns the next object from the queue
     *
     * @return The object removed from the queue
     */
    public PriorityQueueObjectInt removeNext() {
        PriorityQueueObjectInt v;
        v = next();
        remove(v);
        return v;
    }

    /**
     * Updates the Object with the same id in the queue
     *
     * Decreases the value of elem's key and then performs
     * sift-down until elem has been relocated to the correct position in the
     * binary heap.
     *
     * @param elem The object to update in the queue
     */
    public void update(PriorityQueueObjectInt elem) {
        int n, p;
        n = size;
        size = ((Integer) pos.get(new Integer(elem.getId()))).intValue() - 1;
        add(elem);
        p = size;
        size = n;
        siftup(p, n);
    }

    /**
     * Get the size of the queue
     *
     * @return size of the queue
     */
    public int size() {
        return size;
    }

    private void remove(int elemId) {
        int n;
        int p;

        /* Decrease the number of entries in the heap and record the position of
        * the item to be deleted.
        */
        n = --(size);
        p = ((Integer) pos.get(new Integer(elemId))).intValue();

        /* Heap needs adjusting if the position of the deleted item was not at the
        * end of the heap.
        */
        if(p <= n) {
            /* We put the item at the end of the heap in the place of the deleted
            * item and sift-up or sift-down to relocate it in the correct place in
            * the heap.
            */
            keyComps++;
            if(heap[p].getKey() <= heap[n+1].getKey()) {
                heap[p] = heap[n + 1];
                pos.put(new Integer(heap[p].getId()),new Integer(p));
                siftup(p, n);
            } else {
                /* Use insert to sift-down, temporarily adjusting the size of the
                * heap for the call to insert.
                */
                size = p - 1;
                add(heap[n + 1]);
                size = n;
            }
        }
    }

    /* deletes an item from the binary heap  */
    protected void remove(PriorityQueueObjectInt elem) {
        remove(elem.getId());
    }

    /* siftup considers the sub-tree rooted at p that ends at q and moves
    * the root down, sifting up the minimum child until it is located in the
    * correct part of the binary heap.
    */
    protected void siftup(int p, int q) {
        /* y - the heap entry of the root.
        * j - the current insertion point for the root.
        * k - the child of the insertion point.
        * z - heap entry of the child of the insertion point.
        */
        int j, k;
        PriorityQueueObjectInt y, z;

        /* Get the value of the root and initialize the insertion point and child.
        */
        y = heap[p];
        j = p;
        k = 2 * p;

        /* sift-up only if there is a child of the insertion point. */
        while(k <= q) {

            /* Choose the minimum child unless there is only one. */
            z = heap[k];
            if(k < q) {
                keyComps++;
                if(z.getKey() > heap[k + 1].getKey()) z = heap[++k];
            }

            /* We stop if the insertion point for the root is in the correct place.
            * Otherwise the child goes up and the root goes down.  (i.e. swap)
            */
            keyComps++;
            if(y.getKey() <= z.getKey()) break;
            heap[j] = z;
            pos.put(new Integer(z.getId()),new Integer(j));
            j = k;
            k = 2 * j;
        }

        /* Inserts the root in the correct place in the heap. */
        heap[j] = y;
        pos.put(new Integer(y.getId()),new Integer(j));
    }

    /* DEBUG */

    public void display() {
        System.out.println("Print heap");
        for(int i=1;i < size+1; i++) {
            System.out.println(i + " item " + heap[i].getId() + " key " + heap[i].getKey());
        }
        /*
        System.out.println("Print pos");
        for(int i=0;i < pos.length; i++) {
        System.out.println("pos["+i+"] : " + pos[i]);
        }
        */
    }

    public long getKeyComps() {
        return keyComps;
    }

}





