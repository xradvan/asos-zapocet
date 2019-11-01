/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;
import org.netbeans.xml.schema.newxmlschema.Zmluva;

/**
 *
 * @author peter
 */
@WebService(serviceName = "newWSDLService", portName = "newWSDLPort", endpointInterface = "org.netbeans.j2ee.wsdl.p5_v2_xml.src.newwsdl.NewWSDLPortType", targetNamespace = "http://j2ee.netbeans.org/wsdl/p5_v2_xml/src/newWSDL", wsdlLocation = "WEB-INF/wsdl/NewWebServiceFromWSDL/newWSDL.wsdl")
public class NewWebServiceFromWSDL {

    public org.netbeans.xml.schema.newxmlschema.Zmluva navrhZmluvy(org.netbeans.xml.schema.newxmlschema.Navrh part1) throws Exception {
        if (part1.getCislo().isEmpty()) {
            throw new Exception("cislo nie je nastavene");
        }
        
        Zmluva z = new Zmluva();
        z.setCislo("Z1234");
        z.setDruh(part1.getDruh());
        z.setUzavreta(part1.getUzavreta());
        return z;
    }
}
