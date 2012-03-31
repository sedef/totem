//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v@@BUILD_VERSION@@ 
// 	See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 	Any modifications to this file will be lost upon recompilation of the source schema. 
// 	Generated on: 2005.11.16 � 06:31:14 CET 
//


package be.ac.ulg.montefiore.run.totem.trafficMatrix.model.jaxb;


/**
 * Java content class for information complex type.
 * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/lepropre/projects/run-totem/src/resources/trafficMatrix/TrafficMatrix-v1_2.xsd line 44)
 * <p>
 * <pre>
 * &lt;complexType name="information">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="units" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="unit">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="bandwidth" />
 *                           &lt;attribute name="value" use="required" type="{}bandwidthUnits" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface Information {


    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getDescription();

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setDescription(java.lang.String value);

    boolean isSetDescription();

    void unsetDescription();

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Calendar}
     */
    java.util.Calendar getDate();

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Calendar}
     */
    void setDate(java.util.Calendar value);

    boolean isSetDate();

    void unsetDate();

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getAuthor();

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setAuthor(java.lang.String value);

    boolean isSetAuthor();

    void unsetAuthor();

    /**
     * Gets the value of the duration property.
     * 
     */
    double getDuration();

    /**
     * Sets the value of the duration property.
     * 
     */
    void setDuration(double value);

    boolean isSetDuration();

    void unsetDuration();

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getTitle();

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setTitle(java.lang.String value);

    boolean isSetTitle();

    void unsetTitle();

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link be.ac.ulg.montefiore.run.totem.trafficMatrix.model.jaxb.Information.UnitsType}
     */
    be.ac.ulg.montefiore.run.totem.trafficMatrix.model.jaxb.Information.UnitsType getUnits();

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link be.ac.ulg.montefiore.run.totem.trafficMatrix.model.jaxb.Information.UnitsType}
     */
    void setUnits(be.ac.ulg.montefiore.run.totem.trafficMatrix.model.jaxb.Information.UnitsType value);

    boolean isSetUnits();

    void unsetUnits();


    /**
     * Java content class for anonymous complex type.
     * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/lepropre/projects/run-totem/src/resources/trafficMatrix/TrafficMatrix-v1_2.xsd line 53)
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="unit">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="bandwidth" />
     *                 &lt;attribute name="value" use="required" type="{}bandwidthUnits" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     */
    public interface UnitsType {


        /**
         * Gets the value of the unit property.
         * 
         * @return
         *     possible object is
         *     {@link be.ac.ulg.montefiore.run.totem.trafficMatrix.model.jaxb.Information.UnitsType.UnitType}
         */
        be.ac.ulg.montefiore.run.totem.trafficMatrix.model.jaxb.Information.UnitsType.UnitType getUnit();

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link be.ac.ulg.montefiore.run.totem.trafficMatrix.model.jaxb.Information.UnitsType.UnitType}
         */
        void setUnit(be.ac.ulg.montefiore.run.totem.trafficMatrix.model.jaxb.Information.UnitsType.UnitType value);

        boolean isSetUnit();

        void unsetUnit();


        /**
         * Java content class for anonymous complex type.
         * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/lepropre/projects/run-totem/src/resources/trafficMatrix/TrafficMatrix-v1_2.xsd line 56)
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="bandwidth" />
         *       &lt;attribute name="value" use="required" type="{}bandwidthUnits" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         */
        public interface UnitType {


            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link java.lang.String}
             *     {@link java.lang.String}
             */
            java.lang.String getType();

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link java.lang.String}
             *     {@link java.lang.String}
             */
            void setType(java.lang.String value);

            boolean isSetType();

            void unsetType();

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link be.ac.ulg.montefiore.run.totem.trafficMatrix.model.jaxb.BandwidthUnits}
             */
            be.ac.ulg.montefiore.run.totem.trafficMatrix.model.jaxb.BandwidthUnits getValue();

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link be.ac.ulg.montefiore.run.totem.trafficMatrix.model.jaxb.BandwidthUnits}
             */
            void setValue(be.ac.ulg.montefiore.run.totem.trafficMatrix.model.jaxb.BandwidthUnits value);

            boolean isSetValue();

            void unsetValue();

        }

    }

}
