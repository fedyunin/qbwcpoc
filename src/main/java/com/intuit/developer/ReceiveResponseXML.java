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
 *         &lt;element name="ticket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="response" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hresult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"ticket", "response", "hresult", "message"})
@XmlRootElement(name = "receiveResponseXML")
public class ReceiveResponseXML {

    protected String ticket;
    protected String response;
    protected String hresult;
    protected String message;

    /**
     * Gets the value of the ticket property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getTicket() {
        return ticket;
    }

    /**
     * Sets the value of the ticket property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTicket(String value) {
        this.ticket = value;
    }

    /**
     * Gets the value of the response property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setResponse(String value) {
        this.response = value;
    }

    /**
     * Gets the value of the hresult property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getHresult() {
        return hresult;
    }

    /**
     * Sets the value of the hresult property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHresult(String value) {
        this.hresult = value;
    }

    /**
     * Gets the value of the message property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
