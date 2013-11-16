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
 *         &lt;element name="serverVersionResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"serverVersionResult"})
@XmlRootElement(name = "serverVersionResponse")
public class ServerVersionResponse {

    protected String serverVersionResult;

    /**
     * Gets the value of the serverVersionResult property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getServerVersionResult() {
        return serverVersionResult;
    }

    /**
     * Sets the value of the serverVersionResult property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setServerVersionResult(String value) {
        this.serverVersionResult = value;
    }

}
