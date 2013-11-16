/**
 * QBWebConnectorSvcMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package com.test.ws;

import com.intuit.developer.*;

/**
 * QBWebConnectorSvcMessageReceiverInOut message receiver
 */

public class QBWebConnectorSvcMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {


    public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext) throws org.apache.axis2.AxisFault {

        try {

            // get the implementation class for the Web Service
            Object obj = getTheImplementationObject(msgContext);

            QBWebConnectorSvcSkeleton skel = (QBWebConnectorSvcSkeleton) obj;
            //Out Envelop
            org.apache.axiom.soap.SOAPEnvelope envelope = null;
            //Find the axisOperation that has been set by the Dispatch phase.
            org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
            if (op == null) {
                throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
            }

            java.lang.String methodName;
            if ((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)) {


                if ("sendRequestXML".equals(methodName)) {

                    SendRequestXMLResponse sendRequestXMLResponse1 = null;
                    SendRequestXML wrappedParam = (SendRequestXML) fromOM(msgContext.getEnvelope().getBody().getFirstElement(), SendRequestXML.class, getEnvelopeNamespaces(msgContext.getEnvelope()));

                    sendRequestXMLResponse1 =


                            skel.sendRequestXML(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext), sendRequestXMLResponse1, false, new javax.xml.namespace.QName("http://developer.intuit.com/", "sendRequestXML"));
                } else if ("connectionError".equals(methodName)) {

                    ConnectionErrorResponse connectionErrorResponse3 = null;
                    ConnectionError wrappedParam = (ConnectionError) fromOM(msgContext.getEnvelope().getBody().getFirstElement(), ConnectionError.class, getEnvelopeNamespaces(msgContext.getEnvelope()));

                    connectionErrorResponse3 =


                            skel.connectionError(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext), connectionErrorResponse3, false, new javax.xml.namespace.QName("http://developer.intuit.com/", "connectionError"));
                } else if ("serverVersion".equals(methodName)) {

                    ServerVersionResponse serverVersionResponse5 = null;
                    ServerVersion wrappedParam = (ServerVersion) fromOM(msgContext.getEnvelope().getBody().getFirstElement(), ServerVersion.class, getEnvelopeNamespaces(msgContext.getEnvelope()));

                    serverVersionResponse5 =


                            skel.serverVersion(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext), serverVersionResponse5, false, new javax.xml.namespace.QName("http://developer.intuit.com/", "serverVersion"));
                } else if ("clientVersion".equals(methodName)) {

                    ClientVersionResponse clientVersionResponse7 = null;
                    ClientVersion wrappedParam = (ClientVersion) fromOM(msgContext.getEnvelope().getBody().getFirstElement(), ClientVersion.class, getEnvelopeNamespaces(msgContext.getEnvelope()));

                    clientVersionResponse7 =


                            skel.clientVersion(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext), clientVersionResponse7, false, new javax.xml.namespace.QName("http://developer.intuit.com/", "clientVersion"));
                } else if ("closeConnection".equals(methodName)) {

                    CloseConnectionResponse closeConnectionResponse9 = null;
                    CloseConnection wrappedParam = (CloseConnection) fromOM(msgContext.getEnvelope().getBody().getFirstElement(), CloseConnection.class, getEnvelopeNamespaces(msgContext.getEnvelope()));

                    closeConnectionResponse9 =


                            skel.closeConnection(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext), closeConnectionResponse9, false, new javax.xml.namespace.QName("http://developer.intuit.com/", "closeConnection"));
                } else if ("getLastError".equals(methodName)) {

                    GetLastErrorResponse getLastErrorResponse11 = null;
                    GetLastError wrappedParam = (GetLastError) fromOM(msgContext.getEnvelope().getBody().getFirstElement(), GetLastError.class, getEnvelopeNamespaces(msgContext.getEnvelope()));

                    getLastErrorResponse11 =


                            skel.getLastError(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext), getLastErrorResponse11, false, new javax.xml.namespace.QName("http://developer.intuit.com/", "getLastError"));
                } else if ("authenticate".equals(methodName)) {

                    AuthenticateResponse authenticateResponse13 = null;
                    Authenticate wrappedParam = (Authenticate) fromOM(msgContext.getEnvelope().getBody().getFirstElement(), Authenticate.class, getEnvelopeNamespaces(msgContext.getEnvelope()));

                    authenticateResponse13 =


                            skel.authenticate(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext), authenticateResponse13, false, new javax.xml.namespace.QName("http://developer.intuit.com/", "authenticate"));
                } else if ("receiveResponseXML".equals(methodName)) {

                    ReceiveResponseXMLResponse receiveResponseXMLResponse15 = null;
                    ReceiveResponseXML wrappedParam = (ReceiveResponseXML) fromOM(msgContext.getEnvelope().getBody().getFirstElement(), ReceiveResponseXML.class, getEnvelopeNamespaces(msgContext.getEnvelope()));

                    receiveResponseXMLResponse15 =


                            skel.receiveResponseXML(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext), receiveResponseXMLResponse15, false, new javax.xml.namespace.QName("http://developer.intuit.com/", "receiveResponseXML"));

                } else {
                    throw new java.lang.RuntimeException("method not found");
                }


                newMsgContext.setEnvelope(envelope);
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    //

    private static final javax.xml.bind.JAXBContext wsContext;

    static {
        javax.xml.bind.JAXBContext jc;
        jc = null;
        try {
            jc = javax.xml.bind.JAXBContext.newInstance(SendRequestXML.class, SendRequestXMLResponse.class, ConnectionError.class, ConnectionErrorResponse.class, ServerVersion.class, ServerVersionResponse.class, ClientVersion.class, ClientVersionResponse.class, CloseConnection.class, CloseConnectionResponse.class, GetLastError.class, GetLastErrorResponse.class, Authenticate.class, AuthenticateResponse.class, ReceiveResponseXML.class, ReceiveResponseXMLResponse.class);
        } catch (javax.xml.bind.JAXBException ex) {
            System.err.println("Unable to create JAXBContext: " + ex.getMessage());
            ex.printStackTrace(System.err);
            Runtime.getRuntime().exit(-1);
        } finally {
            wsContext = jc;
        }
    }


    private org.apache.axiom.om.OMElement toOM(SendRequestXML param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(SendRequestXML.class, param, marshaller, methodQName.getNamespaceURI(), methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(), null);
            return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(SendRequestXML param, boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(SendRequestXML.class, param, marshaller, "http://developer.intuit.com/", "sendRequestXML");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://developer.intuit.com/", null);
            return factory.createOMElement(source, "sendRequestXML", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, SendRequestXML param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
        return envelope;
    }


    private org.apache.axiom.om.OMElement toOM(SendRequestXMLResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(SendRequestXMLResponse.class, param, marshaller, methodQName.getNamespaceURI(), methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(), null);
            return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(SendRequestXMLResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(SendRequestXMLResponse.class, param, marshaller, "http://developer.intuit.com/", "sendRequestXMLResponse");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://developer.intuit.com/", null);
            return factory.createOMElement(source, "sendRequestXMLResponse", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, SendRequestXMLResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
        return envelope;
    }


    private org.apache.axiom.om.OMElement toOM(ConnectionError param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(ConnectionError.class, param, marshaller, methodQName.getNamespaceURI(), methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(), null);
            return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(ConnectionError param, boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(ConnectionError.class, param, marshaller, "http://developer.intuit.com/", "connectionError");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://developer.intuit.com/", null);
            return factory.createOMElement(source, "connectionError", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ConnectionError param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
        return envelope;
    }


    private org.apache.axiom.om.OMElement toOM(ConnectionErrorResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(ConnectionErrorResponse.class, param, marshaller, methodQName.getNamespaceURI(), methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(), null);
            return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(ConnectionErrorResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(ConnectionErrorResponse.class, param, marshaller, "http://developer.intuit.com/", "connectionErrorResponse");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://developer.intuit.com/", null);
            return factory.createOMElement(source, "connectionErrorResponse", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ConnectionErrorResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
        return envelope;
    }


    private org.apache.axiom.om.OMElement toOM(ServerVersion param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(ServerVersion.class, param, marshaller, methodQName.getNamespaceURI(), methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(), null);
            return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(ServerVersion param, boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(ServerVersion.class, param, marshaller, "http://developer.intuit.com/", "serverVersion");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://developer.intuit.com/", null);
            return factory.createOMElement(source, "serverVersion", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ServerVersion param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
        return envelope;
    }


    private org.apache.axiom.om.OMElement toOM(ServerVersionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(ServerVersionResponse.class, param, marshaller, methodQName.getNamespaceURI(), methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(), null);
            return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(ServerVersionResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(ServerVersionResponse.class, param, marshaller, "http://developer.intuit.com/", "serverVersionResponse");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://developer.intuit.com/", null);
            return factory.createOMElement(source, "serverVersionResponse", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ServerVersionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
        return envelope;
    }


    private org.apache.axiom.om.OMElement toOM(ClientVersion param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(ClientVersion.class, param, marshaller, methodQName.getNamespaceURI(), methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(), null);
            return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(ClientVersion param, boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(ClientVersion.class, param, marshaller, "http://developer.intuit.com/", "clientVersion");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://developer.intuit.com/", null);
            return factory.createOMElement(source, "clientVersion", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ClientVersion param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
        return envelope;
    }


    private org.apache.axiom.om.OMElement toOM(ClientVersionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(ClientVersionResponse.class, param, marshaller, methodQName.getNamespaceURI(), methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(), null);
            return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(ClientVersionResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(ClientVersionResponse.class, param, marshaller, "http://developer.intuit.com/", "clientVersionResponse");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://developer.intuit.com/", null);
            return factory.createOMElement(source, "clientVersionResponse", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ClientVersionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
        return envelope;
    }


    private org.apache.axiom.om.OMElement toOM(CloseConnection param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(CloseConnection.class, param, marshaller, methodQName.getNamespaceURI(), methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(), null);
            return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(CloseConnection param, boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(CloseConnection.class, param, marshaller, "http://developer.intuit.com/", "closeConnection");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://developer.intuit.com/", null);
            return factory.createOMElement(source, "closeConnection", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, CloseConnection param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
        return envelope;
    }


    private org.apache.axiom.om.OMElement toOM(CloseConnectionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(CloseConnectionResponse.class, param, marshaller, methodQName.getNamespaceURI(), methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(), null);
            return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(CloseConnectionResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(CloseConnectionResponse.class, param, marshaller, "http://developer.intuit.com/", "closeConnectionResponse");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://developer.intuit.com/", null);
            return factory.createOMElement(source, "closeConnectionResponse", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, CloseConnectionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
        return envelope;
    }


    private org.apache.axiom.om.OMElement toOM(GetLastError param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(GetLastError.class, param, marshaller, methodQName.getNamespaceURI(), methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(), null);
            return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(GetLastError param, boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(GetLastError.class, param, marshaller, "http://developer.intuit.com/", "getLastError");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://developer.intuit.com/", null);
            return factory.createOMElement(source, "getLastError", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, GetLastError param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
        return envelope;
    }


    private org.apache.axiom.om.OMElement toOM(GetLastErrorResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(GetLastErrorResponse.class, param, marshaller, methodQName.getNamespaceURI(), methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(), null);
            return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(GetLastErrorResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(GetLastErrorResponse.class, param, marshaller, "http://developer.intuit.com/", "getLastErrorResponse");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://developer.intuit.com/", null);
            return factory.createOMElement(source, "getLastErrorResponse", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, GetLastErrorResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
        return envelope;
    }


    private org.apache.axiom.om.OMElement toOM(Authenticate param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(Authenticate.class, param, marshaller, methodQName.getNamespaceURI(), methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(), null);
            return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(Authenticate param, boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(Authenticate.class, param, marshaller, "http://developer.intuit.com/", "authenticate");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://developer.intuit.com/", null);
            return factory.createOMElement(source, "authenticate", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, Authenticate param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
        return envelope;
    }


    private org.apache.axiom.om.OMElement toOM(AuthenticateResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(AuthenticateResponse.class, param, marshaller, methodQName.getNamespaceURI(), methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(), null);
            return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(AuthenticateResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(AuthenticateResponse.class, param, marshaller, "http://developer.intuit.com/", "authenticateResponse");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://developer.intuit.com/", null);
            return factory.createOMElement(source, "authenticateResponse", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, AuthenticateResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
        return envelope;
    }


    private org.apache.axiom.om.OMElement toOM(ReceiveResponseXML param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(ReceiveResponseXML.class, param, marshaller, methodQName.getNamespaceURI(), methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(), null);
            return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(ReceiveResponseXML param, boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(ReceiveResponseXML.class, param, marshaller, "http://developer.intuit.com/", "receiveResponseXML");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://developer.intuit.com/", null);
            return factory.createOMElement(source, "receiveResponseXML", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ReceiveResponseXML param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
        return envelope;
    }


    private org.apache.axiom.om.OMElement toOM(ReceiveResponseXMLResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(ReceiveResponseXMLResponse.class, param, marshaller, methodQName.getNamespaceURI(), methodQName.getLocalPart());
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace(methodQName.getNamespaceURI(), null);
            return factory.createOMElement(source, methodQName.getLocalPart(), namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.om.OMElement toOM(ReceiveResponseXMLResponse param, boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();

            JaxbRIDataSource source = new JaxbRIDataSource(ReceiveResponseXMLResponse.class, param, marshaller, "http://developer.intuit.com/", "receiveResponseXMLResponse");
            org.apache.axiom.om.OMNamespace namespace = factory.createOMNamespace("http://developer.intuit.com/", null);
            return factory.createOMElement(source, "receiveResponseXMLResponse", namespace);
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ReceiveResponseXMLResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
        envelope.getBody().addChild(toOM(param, optimizeContent, methodQName));
        return envelope;
    }


    /**
     * get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param, java.lang.Class type, java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault {
        try {
            javax.xml.bind.JAXBContext context = wsContext;
            javax.xml.bind.Unmarshaller unmarshaller = context.createUnmarshaller();

            return unmarshaller.unmarshal(param.getXMLStreamReaderWithoutCaching(), type).getValue();
        } catch (javax.xml.bind.JAXBException bex) {
            throw org.apache.axis2.AxisFault.makeFault(bex);
        }
    }

    class JaxbRIDataSource implements org.apache.axiom.om.OMDataSource {
        /**
         * Bound object for output.
         */
        private final Object outObject;

        /**
         * Bound class for output.
         */
        private final Class outClazz;

        /**
         * Marshaller.
         */
        private final javax.xml.bind.Marshaller marshaller;

        /**
         * Namespace
         */
        private String nsuri;

        /**
         * Local name
         */
        private String name;

        /**
         * Constructor from object and marshaller.
         *
         * @param obj
         * @param marshaller
         */
        public JaxbRIDataSource(Class clazz, Object obj, javax.xml.bind.Marshaller marshaller, String nsuri, String name) {
            this.outClazz = clazz;
            this.outObject = obj;
            this.marshaller = marshaller;
            this.nsuri = nsuri;
            this.name = name;
        }

        public void serialize(java.io.OutputStream output, org.apache.axiom.om.OMOutputFormat format) throws javax.xml.stream.XMLStreamException {
            try {
                marshaller.marshal(new javax.xml.bind.JAXBElement(new javax.xml.namespace.QName(nsuri, name), outObject.getClass(), outObject), output);
            } catch (javax.xml.bind.JAXBException e) {
                throw new javax.xml.stream.XMLStreamException("Error in JAXB marshalling", e);
            }
        }

        public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat format) throws javax.xml.stream.XMLStreamException {
            try {
                marshaller.marshal(new javax.xml.bind.JAXBElement(new javax.xml.namespace.QName(nsuri, name), outObject.getClass(), outObject), writer);
            } catch (javax.xml.bind.JAXBException e) {
                throw new javax.xml.stream.XMLStreamException("Error in JAXB marshalling", e);
            }
        }

        public void serialize(javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            try {
                marshaller.marshal(new javax.xml.bind.JAXBElement(new javax.xml.namespace.QName(nsuri, name), outObject.getClass(), outObject), xmlWriter);
            } catch (javax.xml.bind.JAXBException e) {
                throw new javax.xml.stream.XMLStreamException("Error in JAXB marshalling", e);
            }
        }

        public javax.xml.stream.XMLStreamReader getReader() throws javax.xml.stream.XMLStreamException {
            try {
                javax.xml.bind.JAXBContext context = wsContext;
                org.apache.axiom.om.impl.builder.SAXOMBuilder builder = new org.apache.axiom.om.impl.builder.SAXOMBuilder();
                javax.xml.bind.Marshaller marshaller = context.createMarshaller();
                marshaller.marshal(new javax.xml.bind.JAXBElement(new javax.xml.namespace.QName(nsuri, name), outObject.getClass(), outObject), builder);

                return builder.getRootElement().getXMLStreamReader();
            } catch (javax.xml.bind.JAXBException e) {
                throw new javax.xml.stream.XMLStreamException("Error in JAXB marshalling", e);
            }
        }
    }


    /**
     * A utility method that copies the namepaces from the SOAPEnvelope
     */
    private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env) {
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
        }
        return returnMap;
    }

    private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

}//end of class
    