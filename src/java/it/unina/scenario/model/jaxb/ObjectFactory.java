//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.12.04 at 05:47:18 CET 
//


package it.unina.scenario.model.jaxb;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.unina.scenario.model.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
public class ObjectFactory
    extends be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.DefaultJAXBContextImpl
{

    private static java.util.HashMap defaultImplementations = new java.util.HashMap(16, 0.75F);
    private static java.util.HashMap rootTagMap = new java.util.HashMap();
    public final static be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.GrammarInfo grammarInfo = new be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.GrammarInfoImpl(rootTagMap, defaultImplementations, (it.unina.scenario.model.jaxb.ObjectFactory.class));
    public final static java.lang.Class version = (it.unina.scenario.model.jaxb.impl.JAXBVersion.class);

    static {
        defaultImplementations.put((it.unina.scenario.model.jaxb.SendLinkWeightsType.class), "it.unina.scenario.model.jaxb.impl.SendLinkWeightsTypeImpl");
        defaultImplementations.put((it.unina.scenario.model.jaxb.GenerateTrafficType.class), "it.unina.scenario.model.jaxb.impl.GenerateTrafficTypeImpl");
        defaultImplementations.put((it.unina.scenario.model.jaxb.SendLinkWeights.class), "it.unina.scenario.model.SendLinkWeights");
        defaultImplementations.put((it.unina.scenario.model.jaxb.GenerateTraffic.class), "it.unina.scenario.model.GenerateTraffic");
        rootTagMap.put(new javax.xml.namespace.QName("http://jaxb.model.scenario.unina.it", "sendLinkWeights"), (it.unina.scenario.model.jaxb.SendLinkWeights.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://jaxb.model.scenario.unina.it", "generateTraffic"), (it.unina.scenario.model.jaxb.GenerateTraffic.class));
    }

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.unina.scenario.model.jaxb
     * 
     */
    public ObjectFactory() {
        super(grammarInfo);
    }

    /**
     * Create an instance of the specified Java content interface.
     * 
     * @param javaContentInterface
     *     the Class object of the javacontent interface to instantiate
     * @return
     *     a new instance
     * @throws JAXBException
     *     if an error occurs
     */
    public java.lang.Object newInstance(java.lang.Class javaContentInterface)
        throws javax.xml.bind.JAXBException
    {
        return super.newInstance(javaContentInterface);
    }

    /**
     * Get the specified property. This method can only be
     * used to get provider specific properties.
     * Attempting to get an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param name
     *     the name of the property to retrieve
     * @return
     *     the value of the requested property
     * @throws PropertyException
     *     when there is an error retrieving the given property or value
     */
    public java.lang.Object getProperty(java.lang.String name)
        throws javax.xml.bind.PropertyException
    {
        return super.getProperty(name);
    }

    /**
     * Set the specified property. This method can only be
     * used to set provider specific properties.
     * Attempting to set an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param value
     *     the value of the property to be set
     * @param name
     *     the name of the property to retrieve
     * @throws PropertyException
     *     when there is an error processing the given property or value
     */
    public void setProperty(java.lang.String name, java.lang.Object value)
        throws javax.xml.bind.PropertyException
    {
        super.setProperty(name, value);
    }

    /**
     * Create an instance of SendLinkWeightsType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public it.unina.scenario.model.jaxb.SendLinkWeightsType createSendLinkWeightsType()
        throws javax.xml.bind.JAXBException
    {
        return new it.unina.scenario.model.jaxb.impl.SendLinkWeightsTypeImpl();
    }

    /**
     * Create an instance of GenerateTrafficType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public it.unina.scenario.model.jaxb.GenerateTrafficType createGenerateTrafficType()
        throws javax.xml.bind.JAXBException
    {
        return new it.unina.scenario.model.jaxb.impl.GenerateTrafficTypeImpl();
    }

    /**
     * Create an instance of SendLinkWeights
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public it.unina.scenario.model.jaxb.SendLinkWeights createSendLinkWeights()
        throws javax.xml.bind.JAXBException
    {
        return new it.unina.scenario.model.SendLinkWeights();
    }

    /**
     * Create an instance of GenerateTraffic
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public it.unina.scenario.model.jaxb.GenerateTraffic createGenerateTraffic()
        throws javax.xml.bind.JAXBException
    {
        return new it.unina.scenario.model.GenerateTraffic();
    }

}
