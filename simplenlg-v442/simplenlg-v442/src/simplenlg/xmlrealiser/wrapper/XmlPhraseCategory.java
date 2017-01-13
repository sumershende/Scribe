//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.10.04 at 10:45:24 PM CEST 
//


package simplenlg.xmlrealiser.wrapper;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for phraseCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="phraseCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLAUSE"/>
 *     &lt;enumeration value="ADJECTIVE_PHRASE"/>
 *     &lt;enumeration value="ADVERB_PHRASE"/>
 *     &lt;enumeration value="NOUN_PHRASE"/>
 *     &lt;enumeration value="PREPOSITIONAL_PHRASE"/>
 *     &lt;enumeration value="VERB_PHRASE"/>
 *     &lt;enumeration value="CANNED_TEXT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "phraseCategory")
@XmlEnum
public enum XmlPhraseCategory {

    CLAUSE,
    ADJECTIVE_PHRASE,
    ADVERB_PHRASE,
    NOUN_PHRASE,
    PREPOSITIONAL_PHRASE,
    VERB_PHRASE,
    CANNED_TEXT;

    public String value() {
        return name();
    }

    public static XmlPhraseCategory fromValue(String v) {
        return valueOf(v);
    }

}
