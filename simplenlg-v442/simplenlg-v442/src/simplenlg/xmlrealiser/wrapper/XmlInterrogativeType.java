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
 * <p>Java class for interrogativeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="interrogativeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HOW"/>
 *     &lt;enumeration value="WHAT_OBJECT"/>
 *     &lt;enumeration value="WHAT_SUBJECT"/>
 *     &lt;enumeration value="WHERE"/>
 *     &lt;enumeration value="WHO_INDIRECT_OBJECT"/>
 *     &lt;enumeration value="WHO_OBJECT"/>
 *     &lt;enumeration value="WHO_SUBJECT"/>
 *     &lt;enumeration value="WHY"/>
 *     &lt;enumeration value="YES_NO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "interrogativeType")
@XmlEnum
public enum XmlInterrogativeType {

    HOW,
    WHAT_OBJECT,
    WHAT_SUBJECT,
    WHERE,
    WHO_INDIRECT_OBJECT,
    WHO_OBJECT,
    WHO_SUBJECT,
    WHY,
    YES_NO;

    public String value() {
        return name();
    }

    public static XmlInterrogativeType fromValue(String v) {
        return valueOf(v);
    }

}
