//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.03.16 at 03:54:53 CET 
//


package be.ac.ucl.ingi.totem.measurementRequest.model.jaxb;


/**
 * Java content class for anonymous complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/biom/biom1/tdekens/workspace/rtt/xml/measurementRequest.xsd line 14)
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestList" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="subnetDNS" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="subnet" type="{}subnet"/>
 *                             &lt;element name="dnsServer" type="{}dnsServer" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="request" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="poissonParameters">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="poissonDistribution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                       &lt;element name="numberOfObservations" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                                       &lt;element name="lambda" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                       &lt;element name="timingUnits" type="{}delayUnits"/>
 *                                       &lt;element name="takeFirstMeasureDirectly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="measurementMethod" type="{}rttMeasurementMethod"/>
 *                             &lt;element name="numberOfQueries" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                             &lt;element name="randomizeDnsInList" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                           &lt;/sequence>
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
public interface RttMeasurementRequestType {


    /**
     * Gets the value of the RequestList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the RequestList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link be.ac.ucl.ingi.totem.measurementRequest.model.jaxb.RttMeasurementRequestType.RequestListType}
     * 
     */
    java.util.List getRequestList();


    /**
     * Java content class for anonymous complex type.
     * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/biom/biom1/tdekens/workspace/rtt/xml/measurementRequest.xsd line 17)
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="subnetDNS" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="subnet" type="{}subnet"/>
     *                   &lt;element name="dnsServer" type="{}dnsServer" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="request" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="poissonParameters">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="poissonDistribution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                             &lt;element name="numberOfObservations" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                             &lt;element name="lambda" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                             &lt;element name="timingUnits" type="{}delayUnits"/>
     *                             &lt;element name="takeFirstMeasureDirectly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="measurementMethod" type="{}rttMeasurementMethod"/>
     *                   &lt;element name="numberOfQueries" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *                   &lt;element name="randomizeDnsInList" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    public interface RequestListType {


        /**
         * Gets the value of the SubnetDNS property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the SubnetDNS property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubnetDNS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link be.ac.ucl.ingi.totem.measurementRequest.model.jaxb.RttMeasurementRequestType.RequestListType.SubnetDNSType}
         * 
         */
        java.util.List getSubnetDNS();

        /**
         * Gets the value of the Request property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the Request property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRequest().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link be.ac.ucl.ingi.totem.measurementRequest.model.jaxb.RttMeasurementRequestType.RequestListType.RequestType}
         * 
         */
        java.util.List getRequest();


        /**
         * Java content class for anonymous complex type.
         * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/biom/biom1/tdekens/workspace/rtt/xml/measurementRequest.xsd line 28)
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="poissonParameters">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="poissonDistribution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                   &lt;element name="numberOfObservations" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *                   &lt;element name="lambda" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *                   &lt;element name="timingUnits" type="{}delayUnits"/>
         *                   &lt;element name="takeFirstMeasureDirectly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="measurementMethod" type="{}rttMeasurementMethod"/>
         *         &lt;element name="numberOfQueries" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
         *         &lt;element name="randomizeDnsInList" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         */
        public interface RequestType {


            /**
             * Gets the value of the startTime property.
             * 
             * @return
             *     possible object is
             *     {@link java.util.Calendar}
             */
            java.util.Calendar getStartTime();

            /**
             * Sets the value of the startTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link java.util.Calendar}
             */
            void setStartTime(java.util.Calendar value);

            /**
             * Gets the value of the poissonParameters property.
             * 
             * @return
             *     possible object is
             *     {@link be.ac.ucl.ingi.totem.measurementRequest.model.jaxb.RttMeasurementRequestType.RequestListType.RequestType.PoissonParametersType}
             */
            be.ac.ucl.ingi.totem.measurementRequest.model.jaxb.RttMeasurementRequestType.RequestListType.RequestType.PoissonParametersType getPoissonParameters();

            /**
             * Sets the value of the poissonParameters property.
             * 
             * @param value
             *     allowed object is
             *     {@link be.ac.ucl.ingi.totem.measurementRequest.model.jaxb.RttMeasurementRequestType.RequestListType.RequestType.PoissonParametersType}
             */
            void setPoissonParameters(be.ac.ucl.ingi.totem.measurementRequest.model.jaxb.RttMeasurementRequestType.RequestListType.RequestType.PoissonParametersType value);

            /**
             * Gets the value of the measurementMethod property.
             * 
             * @return
             *     possible object is
             *     {@link java.lang.String}
             */
            java.lang.String getMeasurementMethod();

            /**
             * Sets the value of the measurementMethod property.
             * 
             * @param value
             *     allowed object is
             *     {@link java.lang.String}
             */
            void setMeasurementMethod(java.lang.String value);

            /**
             * Gets the value of the numberOfQueries property.
             * 
             * @return
             *     possible object is
             *     {@link java.math.BigInteger}
             */
            java.math.BigInteger getNumberOfQueries();

            /**
             * Sets the value of the numberOfQueries property.
             * 
             * @param value
             *     allowed object is
             *     {@link java.math.BigInteger}
             */
            void setNumberOfQueries(java.math.BigInteger value);

            /**
             * Gets the value of the randomizeDnsInList property.
             * 
             */
            boolean isRandomizeDnsInList();

            /**
             * Sets the value of the randomizeDnsInList property.
             * 
             */
            void setRandomizeDnsInList(boolean value);


            /**
             * Java content class for anonymous complex type.
             * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/biom/biom1/tdekens/workspace/rtt/xml/measurementRequest.xsd line 32)
             * <p>
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="poissonDistribution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *         &lt;element name="numberOfObservations" type="{http://www.w3.org/2001/XMLSchema}integer"/>
             *         &lt;element name="lambda" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
             *         &lt;element name="timingUnits" type="{}delayUnits"/>
             *         &lt;element name="takeFirstMeasureDirectly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             */
            public interface PoissonParametersType {


                /**
                 * Gets the value of the takeFirstMeasureDirectly property.
                 * 
                 */
                boolean isTakeFirstMeasureDirectly();

                /**
                 * Sets the value of the takeFirstMeasureDirectly property.
                 * 
                 */
                void setTakeFirstMeasureDirectly(boolean value);

                /**
                 * Gets the value of the timingUnits property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link java.lang.String}
                 */
                java.lang.String getTimingUnits();

                /**
                 * Sets the value of the timingUnits property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link java.lang.String}
                 */
                void setTimingUnits(java.lang.String value);

                /**
                 * Gets the value of the numberOfObservations property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link java.math.BigInteger}
                 */
                java.math.BigInteger getNumberOfObservations();

                /**
                 * Sets the value of the numberOfObservations property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link java.math.BigInteger}
                 */
                void setNumberOfObservations(java.math.BigInteger value);

                /**
                 * Gets the value of the lambda property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link java.math.BigDecimal}
                 */
                java.math.BigDecimal getLambda();

                /**
                 * Sets the value of the lambda property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link java.math.BigDecimal}
                 */
                void setLambda(java.math.BigDecimal value);

                /**
                 * Gets the value of the poissonDistribution property.
                 * 
                 */
                boolean isPoissonDistribution();

                /**
                 * Sets the value of the poissonDistribution property.
                 * 
                 */
                void setPoissonDistribution(boolean value);

            }

        }


        /**
         * Java content class for anonymous complex type.
         * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/biom/biom1/tdekens/workspace/rtt/xml/measurementRequest.xsd line 20)
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="subnet" type="{}subnet"/>
         *         &lt;element name="dnsServer" type="{}dnsServer" maxOccurs="unbounded"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         */
        public interface SubnetDNSType {


            /**
             * Gets the value of the DnsServer property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the DnsServer property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDnsServer().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link be.ac.ucl.ingi.totem.measurementRequest.model.jaxb.DnsServer}
             * 
             */
            java.util.List getDnsServer();

            /**
             * Gets the value of the subnet property.
             * 
             * @return
             *     possible object is
             *     {@link be.ac.ucl.ingi.totem.measurementRequest.model.jaxb.Subnet}
             */
            be.ac.ucl.ingi.totem.measurementRequest.model.jaxb.Subnet getSubnet();

            /**
             * Sets the value of the subnet property.
             * 
             * @param value
             *     allowed object is
             *     {@link be.ac.ucl.ingi.totem.measurementRequest.model.jaxb.Subnet}
             */
            void setSubnet(be.ac.ucl.ingi.totem.measurementRequest.model.jaxb.Subnet value);

        }

    }

}
