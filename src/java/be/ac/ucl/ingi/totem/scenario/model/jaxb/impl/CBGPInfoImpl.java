//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v@@BUILD_VERSION@@ 
// 	See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 	Any modifications to this file will be lost upon recompilation of the source schema. 
// 	Generated on: 2005.06.24 � 02:45:37 CEST 
//


package be.ac.ucl.ingi.totem.scenario.model.jaxb.impl;

public class CBGPInfoImpl
    extends be.ac.ucl.ingi.totem.scenario.model.jaxb.impl.CBGPInfoTypeImpl
    implements be.ac.ucl.ingi.totem.scenario.model.jaxb.CBGPInfo, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallableObject, be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.XMLSerializable, be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.ValidatableObject
{

    public final static java.lang.Class version = (be.ac.ucl.ingi.totem.scenario.model.jaxb.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (be.ac.ucl.ingi.totem.scenario.model.jaxb.CBGPInfo.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://jaxb.model.scenario.totem.ingi.ucl.ac.be";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "CBGPInfo";
    }

    public be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallingEventHandler createUnmarshaller(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallingContext context) {
        return new be.ac.ucl.ingi.totem.scenario.model.jaxb.impl.CBGPInfoImpl.Unmarshaller(context);
    }

    public void serializeBody(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://jaxb.model.scenario.totem.ingi.ucl.ac.be", "CBGPInfo");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeBody(context);
        context.endElement();
    }

    public void serializeAttributes(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (be.ac.ucl.ingi.totem.scenario.model.jaxb.CBGPInfo.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Lj"
+"ava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xppp\u0000sr\u0000\u001fcom.sun.msv.gra"
+"mmar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.BinaryExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007pps"
+"q\u0000~\u0000\u0007ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bpps"
+"q\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000"
+"~\u0000\u0004sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.m"
+"sv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~"
+"\u0000\u0001xq\u0000~\u0000\u0004q\u0000~\u0000\u0015psr\u00002com.sun.msv.grammar.Expression$AnyStringEx"
+"pression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~\u0000\u0014\u0001q\u0000~\u0000\u0019sr\u0000 com.sun.msv.grammar"
+".AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpressi"
+"on\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u001aq\u0000~\u0000\u001fsr\u0000#com.sun.msv.grammar.SimpleN"
+"ameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnames"
+"paceURIq\u0000~\u0000!xq\u0000~\u0000\u001ct\u00008be.ac.ulg.montefiore.run.totem.scenario"
+".model.jaxb.Paramt\u0000+http://java.sun.com/jaxb/xjc/dummy-eleme"
+"ntssq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\u0011q\u0000~\u0000\u0015psq\u0000~\u0000\u0016q\u0000~\u0000\u0015"
+"pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000<be.ac.ulg.montefiore.run.totem.scen"
+"ario.model.jaxb.ParamTypeq\u0000~\u0000$sq\u0000~\u0000\rppsq\u0000~\u0000\u0016q\u0000~\u0000\u0015psr\u0000\u001bcom.su"
+"n.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatyp"
+"e/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringP"
+"air;xq\u0000~\u0000\u0004ppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr"
+"\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.su"
+"n.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq"
+"\u0000~\u0000!L\u0000\btypeNameq\u0000~\u0000!L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xs"
+"d/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat"
+"\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Coll"
+"apse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProces"
+"sor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullSetEx"
+"pression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004ppsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t"
+"\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000!L\u0000\fnamespaceURIq\u0000~\u0000!xpq\u0000~\u0000:q\u0000~\u00009sq"
+"\u0000~\u0000 t\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000\u001f"
+"sq\u0000~\u0000 t\u0000\u0005paramt\u00009http://jaxb.model.scenario.totem.run.montef"
+"iore.ulg.ac.besq\u0000~\u0000\rppsq\u0000~\u0000\u0007q\u0000~\u0000\u0015psq\u0000~\u0000\rq\u0000~\u0000\u0015psq\u0000~\u0000\u0000q\u0000~\u0000\u0015p\u0000s"
+"q\u0000~\u0000\rppsq\u0000~\u0000\u0011q\u0000~\u0000\u0015psq\u0000~\u0000\u0016q\u0000~\u0000\u0015pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000#q\u0000~"
+"\u0000$sq\u0000~\u0000\u0000q\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\u0011q\u0000~\u0000\u0015psq\u0000~\u0000\u0016q\u0000"
+"~\u0000\u0015pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000,q\u0000~\u0000$sq\u0000~\u0000\rppsq\u0000~\u0000\u0016q\u0000~\u0000\u0015pq\u0000~\u00002"
+"q\u0000~\u0000Bq\u0000~\u0000\u001fq\u0000~\u0000Esq\u0000~\u0000\rppsq\u0000~\u0000\u0007q\u0000~\u0000\u0015psq\u0000~\u0000\rq\u0000~\u0000\u0015psq\u0000~\u0000\u0000q\u0000~\u0000\u0015p\u0000"
+"sq\u0000~\u0000\rppsq\u0000~\u0000\u0011q\u0000~\u0000\u0015psq\u0000~\u0000\u0016q\u0000~\u0000\u0015pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000#q\u0000"
+"~\u0000$sq\u0000~\u0000\u0000q\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\u0011q\u0000~\u0000\u0015psq\u0000~\u0000\u0016q"
+"\u0000~\u0000\u0015pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000,q\u0000~\u0000$sq\u0000~\u0000\rppsq\u0000~\u0000\u0016q\u0000~\u0000\u0015pq\u0000~\u0000"
+"2q\u0000~\u0000Bq\u0000~\u0000\u001fq\u0000~\u0000Esq\u0000~\u0000\rppsq\u0000~\u0000\rq\u0000~\u0000\u0015psq\u0000~\u0000\u0000q\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\rppsq\u0000"
+"~\u0000\u0011q\u0000~\u0000\u0015psq\u0000~\u0000\u0016q\u0000~\u0000\u0015pq\u0000~\u0000\u0019q\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000#q\u0000~\u0000$sq\u0000~\u0000\u0000q\u0000"
+"~\u0000\u0015p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\rppsq\u0000~\u0000\u0011q\u0000~\u0000\u0015psq\u0000~\u0000\u0016q\u0000~\u0000\u0015pq\u0000~\u0000\u0019q"
+"\u0000~\u0000\u001dq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000,q\u0000~\u0000$sq\u0000~\u0000\rppsq\u0000~\u0000\u0016q\u0000~\u0000\u0015pq\u0000~\u00002q\u0000~\u0000Bq\u0000~\u0000\u001f"
+"q\u0000~\u0000Eq\u0000~\u0000\u001fq\u0000~\u0000\u001fq\u0000~\u0000\u001fsq\u0000~\u0000\rppsq\u0000~\u0000\u0016q\u0000~\u0000\u0015psq\u0000~\u0000/ppsr\u0000!com.sun."
+"msv.datatype.xsd.TimeType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000)com.sun.msv.datatype"
+".xsd.DateTimeBaseType\u0014W\u001a@3\u00a5\u00b4\u00e5\u0002\u0000\u0000xq\u0000~\u00004q\u0000~\u00009t\u0000\u0004timeq\u0000~\u0000=q\u0000~\u0000?"
+"sq\u0000~\u0000@q\u0000~\u0000\u0080q\u0000~\u00009sq\u0000~\u0000 t\u0000\u0004timet\u0000\u0000q\u0000~\u0000\u001fsq\u0000~\u0000\u0016ppsq\u0000~\u0000/ppsr\u0000#com"
+".sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidx"
+"q\u0000~\u00004q\u0000~\u00009t\u0000\u0006stringsr\u00005com.sun.msv.datatype.xsd.WhiteSpacePr"
+"ocessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000<\u0001q\u0000~\u0000?sq\u0000~\u0000@q\u0000~\u0000\u0089q\u0000~\u00009sq\u0000~\u0000"
+" t\u0000\u0004infoq\u0000~\u0000\u0084sq\u0000~\u0000\rppsq\u0000~\u0000\u0016q\u0000~\u0000\u0015pq\u0000~\u00002q\u0000~\u0000Bq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\bCBG"
+"PInfot\u0000/http://jaxb.model.scenario.totem.ingi.ucl.ac.besr\u0000\"c"
+"om.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lc"
+"om/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.m"
+"sv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rst"
+"reamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/ExpressionPool;x"
+"p\u0000\u0000\u0000\'\u0001pq\u0000~\u0000zq\u0000~\u0000\u0010q\u0000~\u0000(q\u0000~\u0000Lq\u0000~\u0000Sq\u0000~\u0000]q\u0000~\u0000dq\u0000~\u0000mq\u0000~\u0000tq\u0000~\u0000\tq\u0000~"
+"\u0000Iq\u0000~\u0000\u0013q\u0000~\u0000)q\u0000~\u0000Mq\u0000~\u0000Tq\u0000~\u0000^q\u0000~\u0000eq\u0000~\u0000nq\u0000~\u0000uq\u0000~\u0000\u000eq\u0000~\u0000Jq\u0000~\u0000[q\u0000~"
+"\u0000kq\u0000~\u0000jq\u0000~\u0000\fq\u0000~\u0000Hq\u0000~\u0000&q\u0000~\u0000Qq\u0000~\u0000bq\u0000~\u0000rq\u0000~\u0000Zq\u0000~\u0000\u000bq\u0000~\u0000-q\u0000~\u0000Wq\u0000~"
+"\u0000hq\u0000~\u0000xq\u0000~\u0000Yq\u0000~\u0000\u008fq\u0000~\u0000\nx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(be.ac.ulg.montefiore.run.totem.util.jaxb.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return be.ac.ucl.ingi.totem.scenario.model.jaxb.impl.CBGPInfoImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (("CBGPInfo" == ___local)&&("http://jaxb.model.scenario.totem.ingi.ucl.ac.be" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "info");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  2 :
                        if (("CBGPInfo" == ___local)&&("http://jaxb.model.scenario.totem.ingi.ucl.ac.be" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "info");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        if (("info" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((be.ac.ucl.ingi.totem.scenario.model.jaxb.impl.CBGPInfoTypeImpl)be.ac.ucl.ingi.totem.scenario.model.jaxb.impl.CBGPInfoImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "info");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            attIdx = context.getAttribute("", "info");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
