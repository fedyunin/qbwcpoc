package com.intuit.developer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="strVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"strVersion"})
@XmlRootElement(name = "serverVersion")
public class ServerVersion {

    protected String strVersion;

    /**
     * Gets the value of the strVersion property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getStrVersion() {
        return strVersion;
    }

    /**
     * Sets the value of the strVersion property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStrVersion(String value) {
        this.strVersion = value;
    }

}
