//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.02.29 at 02:59:16 CET 
//


package be.ac.ulg.montefiore.run.totem.domain.model.jaxb;


/**
 * Java content class for lspBackupType.
 *  <p>The following schema fragment specifies the expected content contained within this java content object.
 * <p>
 * <pre>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *   &lt;enumeration value="DETOUR_LOCAL"/>
 *   &lt;enumeration value="DETOUR_E2E"/>
 *   &lt;enumeration value="BYPASS"/>
 * &lt;/restriction>
 * </pre>
 * 
 */
public class LspBackupType {

    private final static java.util.Map valueMap = new java.util.HashMap();
    public final static java.lang.String _DETOUR_LOCAL = com.sun.xml.bind.DatatypeConverterImpl.installHook("DETOUR_LOCAL");
    public final static be.ac.ulg.montefiore.run.totem.domain.model.jaxb.LspBackupType DETOUR_LOCAL = new be.ac.ulg.montefiore.run.totem.domain.model.jaxb.LspBackupType(_DETOUR_LOCAL);
    public final static java.lang.String _DETOUR_E_2_E = com.sun.xml.bind.DatatypeConverterImpl.installHook("DETOUR_E2E");
    public final static be.ac.ulg.montefiore.run.totem.domain.model.jaxb.LspBackupType DETOUR_E_2_E = new be.ac.ulg.montefiore.run.totem.domain.model.jaxb.LspBackupType(_DETOUR_E_2_E);
    public final static java.lang.String _BYPASS = com.sun.xml.bind.DatatypeConverterImpl.installHook("BYPASS");
    public final static be.ac.ulg.montefiore.run.totem.domain.model.jaxb.LspBackupType BYPASS = new be.ac.ulg.montefiore.run.totem.domain.model.jaxb.LspBackupType(_BYPASS);
    private final java.lang.String lexicalValue;
    private final java.lang.String value;

    protected LspBackupType(java.lang.String v) {
        value = v;
        lexicalValue = v;
        valueMap.put(v, this);
    }

    public java.lang.String toString() {
        return lexicalValue;
    }

    public java.lang.String getValue() {
        return value;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean equals(java.lang.Object o) {
        return super.equals(o);
    }

    public static be.ac.ulg.montefiore.run.totem.domain.model.jaxb.LspBackupType fromValue(java.lang.String value) {
        be.ac.ulg.montefiore.run.totem.domain.model.jaxb.LspBackupType t = ((be.ac.ulg.montefiore.run.totem.domain.model.jaxb.LspBackupType) valueMap.get(value));
        if (t == null) {
            throw new java.lang.IllegalArgumentException();
        } else {
            return t;
        }
    }

    public static be.ac.ulg.montefiore.run.totem.domain.model.jaxb.LspBackupType fromString(java.lang.String str) {
        return fromValue(str);
    }

}
