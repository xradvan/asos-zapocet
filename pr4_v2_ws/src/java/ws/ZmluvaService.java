/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;
import org.netbeans.j2ee.wsdl.pr4_v2_xml.src.newwsdl.NavrhZmluvyFault;

/**
 *
 * @author peter
 */
@WebService(serviceName = "newWSDLService", portName = "newWSDLPort", endpointInterface = "org.netbeans.j2ee.wsdl.pr4_v2_xml.src.newwsdl.NewWSDLPortType", targetNamespace = "http://j2ee.netbeans.org/wsdl/pr4_v2_xml/src/newWSDL", wsdlLocation = "WEB-INF/wsdl/ZmluvaService/newWSDL.wsdl")
public class ZmluvaService {

    public org.netbeans.xml.schema.newxmlschema.Zmluva navrhZmluvy(org.netbeans.xml.schema.newxmlschema.Zmluva zmluva) throws NavrhZmluvyFault {
        if (zmluva.getMajitel() == null) {
            throw new NavrhZmluvyFault("Majitel nie je zadany", "chyba");
        }
        
        if (zmluva.getPoistenec()== null) {
            throw new NavrhZmluvyFault("Poistenec nie je zadany", "chyba");
        }
        
        zmluva.setCislo("Z1234");
        return zmluva;
    }

    public void getOsoba(org.netbeans.xml.schema.newxmlschema.Osoba part1) {
        
    }
    
}
