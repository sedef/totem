//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.03.28 at 12:33:07 CET 
//


package be.ac.ulg.montefiore.run.totem.scenario.model.jaxb;


/**
 * Java content class for chartSave element declaration.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/hakan/svn-totem/totem/trunk/run-totem/src/resources/scenario/Scenario-v1_3.xsd line 726)
 * <p>
 * <pre>
 * &lt;element name="chartSave">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;extension base="{http://jaxb.model.scenario.totem.run.montefiore.ulg.ac.be}eventType">
 *         &lt;sequence>
 *           &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="xAxisTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="yAxisTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;element name="plotter">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element ref="{http://jaxb.model.scenario.totem.run.montefiore.ulg.ac.be}param" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                   &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *         &lt;attribute name="chartId" use="required" type="{http://jaxb.model.scenario.totem.run.montefiore.ulg.ac.be}chartIdType" />
 *         &lt;attribute name="file" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="format" use="required" type="{http://jaxb.model.scenario.totem.run.montefiore.ulg.ac.be}chartFormatType" />
 *       &lt;/extension>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 */
public interface ChartSave
    extends javax.xml.bind.Element, be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.ChartSaveType
{


}