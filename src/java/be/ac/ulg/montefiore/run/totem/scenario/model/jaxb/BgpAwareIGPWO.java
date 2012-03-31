//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.03.28 at 12:33:07 CET 
//


package be.ac.ulg.montefiore.run.totem.scenario.model.jaxb;


/**
 * Java content class for bgpAwareIGPWO element declaration.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/hakan/svn-totem/totem/trunk/run-totem/src/resources/scenario/Scenario-v1_3.xsd line 438)
 * <p>
 * <pre>
 * &lt;element name="bgpAwareIGPWO">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;extension base="{http://jaxb.model.scenario.totem.run.montefiore.ulg.ac.be}ASEventType">
 *         &lt;sequence>
 *           &lt;element name="samplingRate" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="initial" type="{http://www.w3.org/2001/XMLSchema}float" default="0.2" />
 *                   &lt;attribute name="max" type="{http://www.w3.org/2001/XMLSchema}float" default="0.4" />
 *                   &lt;attribute name="min" type="{http://www.w3.org/2001/XMLSchema}float" default="0.01" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="trafficMatrix" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="TMID" use="required" type="{http://jaxb.model.scenario.totem.run.montefiore.ulg.ac.be}TMIdType" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *         &lt;attribute name="initialWeightArray" type="{http://jaxb.model.scenario.totem.run.montefiore.ulg.ac.be}igpwoInitialWeightArrayType" default="RANDOM" />
 *         &lt;attribute name="interdomainTE" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *         &lt;attribute name="maxPossibleWeight" type="{http://www.w3.org/2001/XMLSchema}int" default="50" />
 *         &lt;attribute name="nbIter" type="{http://www.w3.org/2001/XMLSchema}int" default="150" />
 *         &lt;attribute name="seed" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;/extension>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 */
public interface BgpAwareIGPWO
    extends javax.xml.bind.Element, be.ac.ulg.montefiore.run.totem.scenario.model.jaxb.BgpAwareIGPWOType
{


}
