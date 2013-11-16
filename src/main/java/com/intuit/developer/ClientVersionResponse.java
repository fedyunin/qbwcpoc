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
 *         &lt;element name="clientVersionResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"clientVersionResult"})
@XmlRootElement(name = "clientVersionResponse")
public class ClientVersionResponse {

    protected String clientVersionResult;

    public ClientVersionResponse(String version) {
        this.clientVersionResult = version;
    }

    public ClientVersionResponse() {
    }

    /**
     * Gets the value of the clientVersionResult property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getClientVersionResult() {
        return clientVersionResult;
    }

    /**
     * Sets the value of the clientVersionResult property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClientVersionResult(String value) {
        this.clientVersionResult = value;
    }

}
