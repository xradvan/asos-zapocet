/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;

/**
 *
 * @author peter
 */
@WebService(serviceName = "newWSDLService", portName = "newWSDLPort", endpointInterface = "org.netbeans.j2ee.wsdl.cv6_u1_xml.src.newwsdl.NewWSDLPortType", targetNamespace = "http://j2ee.netbeans.org/wsdl/cv6_u1_xml/src/newWSDL", wsdlLocation = "WEB-INF/wsdl/NewWebServiceFromWSDL/newWSDL.wsdl")
public class NewWebServiceFromWSDL {

    public org.netbeans.xml.schema.newxmlschema.PoistnaZmluva podatNavrh(org.netbeans.xml.schema.newxmlschema.NavrhZmluvy part1) {
        
    }
    
}
