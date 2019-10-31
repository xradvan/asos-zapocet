/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.util.HashMap;
import java.util.Map;
import javax.jws.WebService;
import org.netbeans.xml.schema.newxmlschema.DenEnum;
import org.netbeans.xml.schema.newxmlschema.Menu;

/**
 *
 * @author peter
 */
@WebService(serviceName = "newWSDLService", portName = "newWSDLPort", endpointInterface = "org.netbeans.j2ee.wsdl.u1_xml_contract.src.newwsdl.NewWSDLPortType", targetNamespace = "http://j2ee.netbeans.org/wsdl/u1_xml_contract/src/newWSDL", wsdlLocation = "WEB-INF/wsdl/JedalenService/newWSDL.wsdl")
public class JedalenService {

    private Map<DenEnum, Menu> ponuka;
    public JedalenService() {
        ponuka = new HashMap<>();
        for (DenEnum d : DenEnum.values()) {
            ponuka.put(d, new Menu());
        }
    }
    
    public org.netbeans.xml.schema.newxmlschema.Menu getMenu(org.netbeans.xml.schema.newxmlschema.DenEnum part1) {
        return ponuka.get(part1);
    }

    public void addJedlo(org.netbeans.xml.schema.newxmlschema.Jedlo j, org.netbeans.xml.schema.newxmlschema.DenEnum d) {
        ponuka.get(d).getPonuka().add(j);
    }
    
}
