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

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.UUID;

/**
 * QBWebConnectorSvcSkeleton java skeleton for the axisService
 */
public class QBWebConnectorSvcSkeleton {

    static boolean stop = false;

    private final Logger log = LoggerFactory.getLogger(QBWebConnectorSvcSkeleton.class);
    private String authenticatedUserID;

    /**
     * Prepares and send QBXML request for execute on Quickbooks Company data.
     *
     * @param sendRequestXML
     * @return sendRequestXMLResponse
     */

    public SendRequestXMLResponse sendRequestXML(SendRequestXML sendRequestXML) {
        log.info("sendRequestXML: " + sendRequestXML.toString());
        SendRequestXMLResponse sendRequestXMLResponse = new SendRequestXMLResponse();
        if (!stop) {
            java.net.URL url = QBWebConnectorSvcSkeleton.class.getResource("request.xml");
            try {
                String xml = new java.util.Scanner(new File(url.getFile()), "UTF8").useDelimiter("\\Z").next();
                xml = xml.replace("{{VendorName}}", "Vendor_" + new Random().nextLong());
                sendRequestXMLResponse.setSendRequestXMLResult(xml);
                stop = true;
            } catch (FileNotFoundException e) {
                log.error(e.getMessage(), e);
            }
        } else {
            sendRequestXMLResponse.setSendRequestXMLResult("");
        }
        return sendRequestXMLResponse;
    }


    /**
     * Received when there are error while connection to Quickbooks.
     *
     * @param connectionError
     * @return connectionErrorResponse
     */

    public ConnectionErrorResponse connectionError(ConnectionError connectionError) {
        log.info("Connection error: " + connectionError.toString());
        ConnectionErrorResponse connectionErrorResponse = new ConnectionErrorResponse();
        connectionErrorResponse.setConnectionErrorResult("");
        return connectionErrorResponse;
    }


    /**
     * Notify Webconnector about server (this webservice) version.
     *
     * @param serverVersion
     * @return serverVersionResponse
     */

    public ServerVersionResponse serverVersion(ServerVersion serverVersion) {
        log.info("serverVersion: " + serverVersion.toString());
        ServerVersionResponse serverVersionResponse = new ServerVersionResponse();
        serverVersionResponse.setServerVersionResult("1.0");
        return serverVersionResponse;
    }


    /**
     * Provides information about version of WebConnector.
     * Allow to request user to update WebConnector if current version of WebConnector does not meet our requirements.
     *
     * @param clientVersion
     * @return clientVersionResponse
     */

    public ClientVersionResponse clientVersion(ClientVersion clientVersion) {
        log.info("clientVersion: " + clientVersion.toString());
        // create empty response for continue.
        ClientVersionResponse clientVersionResponse = new ClientVersionResponse();
        return clientVersionResponse;
    }


    /**
     * Action on close connection with Quickbooks.
     *
     * @param closeConnection
     * @return closeConnectionResponse
     */

    public CloseConnectionResponse closeConnection(CloseConnection closeConnection) {
        log.info("closeConnection: " + closeConnection.toString());
        CloseConnectionResponse closeConnectionResponse = new CloseConnectionResponse();
        closeConnectionResponse.setCloseConnectionResult("Close connection.");
        return closeConnectionResponse;
    }


    /**
     * Return errors.
     *
     * @param getLastError
     * @return getLastErrorResponse
     */

    public GetLastErrorResponse getLastError(GetLastError getLastError) {
        log.info("getLastError: " + getLastError.toString());
        GetLastErrorResponse lastErrorResponse = new GetLastErrorResponse();
        // return empty: no errors.
        return lastErrorResponse;
    }


    /**
     * Authenticate user in our webservice.
     *
     * @param authenticate
     * @return authenticateResponse
     */

    public AuthenticateResponse authenticate(Authenticate authenticate) {
        log.info("Authenticate:" + authenticate.toString());

        // prepare response
        AuthenticateResponse authenticateResponse = new AuthenticateResponse();
        ArrayOfString arrayOfString = new ArrayOfString();

        if ("user".equals(authenticate.getStrUserName()) && "123".equals(authenticate.getStrPassword())) {
            // do authenticate

            //The first member of the array is a session token, which could be a GUID or anything else that you want
            // to use to identify the session. This token will be returned by QBWC in subsequent callbacks in the
            // session
            authenticatedUserID = UUID.randomUUID().toString();
            arrayOfString.addString(authenticatedUserID);
            stop = false;
            // If you do have work to do for the that user, you can supply the full pathname of the company to be
            // used in the current update
            // e.g: arrayOfString.addString("c:\\Users\\Public\\Documents\\Test Company.qbw");

            // empty for use opened company in Quickbooks.
            arrayOfString.addString("");

        } else {
            // If the username and password in the authenticate call is invalid, you would supply the value “nvu”.
            arrayOfString.addString("");
            arrayOfString.addString("nvu");
            stop = true;
        }


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
        log.info("receiveResponseXML: " + receiveResponseXML.toString());
        return new ReceiveResponseXMLResponse();
    }

}
    