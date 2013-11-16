/**
 * QBWebConnectorSvcSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package com.test.ws;

import com.intuit.developer.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * QBWebConnectorSvcSkeleton java skeleton for the axisService
 */
public class QBWebConnectorSvcSkeleton {

    private final Logger log = LoggerFactory.getLogger(QBWebConnectorSvcSkeleton.class);

    /**
     * Auto generated method signature
     *
     * @param sendRequestXML
     * @return sendRequestXMLResponse
     */

    public SendRequestXMLResponse sendRequestXML(SendRequestXML sendRequestXML) {
        //TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#sendRequestXML");
    }


    /**
     * Auto generated method signature
     *
     * @param connectionError
     * @return connectionErrorResponse
     */

    public ConnectionErrorResponse connectionError(ConnectionError connectionError) {
        //TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#connectionError");
    }


    /**
     * Auto generated method signature
     *
     * @param serverVersion
     * @return serverVersionResponse
     */

    public ServerVersionResponse serverVersion(ServerVersion serverVersion) {
        ServerVersionResponse serverVersionResponse = new ServerVersionResponse();
        serverVersionResponse.setServerVersionResult("1.0");
        return serverVersionResponse;
    }


    /**
     * Auto generated method signature
     *
     * @param clientVersion
     * @return clientVersionResponse
     */

    public ClientVersionResponse clientVersion(ClientVersion clientVersion) {
        return new ClientVersionResponse("1.0");
    }


    /**
     * Auto generated method signature
     *
     * @param closeConnection
     * @return closeConnectionResponse
     */

    public CloseConnectionResponse closeConnection(CloseConnection closeConnection) {
        return new CloseConnectionResponse("Connection closed");
    }


    /**
     * Auto generated method signature
     *
     * @param getLastError
     * @return getLastErrorResponse
     */

    public GetLastErrorResponse getLastError(GetLastError getLastError) {
        //TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#getLastError");
    }


    /**
     * Auto generated method signature
     *
     * @param authenticate
     * @return authenticateResponse
     */

    public AuthenticateResponse authenticate(Authenticate authenticate) {
        log.info("Authenticate:" + authenticate.toString());
        ArrayOfString arrayOfString = new ArrayOfString();
        List<String> values = new ArrayList<String>(2);
        values.add("{F5FCCBC3-AA13-4d28-9DBF-3E571823F2BB}");
        values.add("{F5FCCBC3-AA13-4d28-9DBF-3E571823F2BB}");
//        values.add("none");
        arrayOfString.setString(values);
        AuthenticateResponse authenticateResponse = new AuthenticateResponse();
        authenticateResponse.setAuthenticateResult(arrayOfString);
        return authenticateResponse;
    }


    /**
     * Auto generated method signature
     *
     * @param receiveResponseXML
     * @return receiveResponseXMLResponse
     */

    public ReceiveResponseXMLResponse receiveResponseXML(ReceiveResponseXML receiveResponseXML) {
        //TODO : fill this with the necessary business logic
        throw new java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#receiveResponseXML");
    }

}
    