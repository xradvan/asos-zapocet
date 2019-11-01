/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr5_v2_client;

import ws.Navrh;
import ws.Zmluva;

/**
 *
 * @author peter
 */
public class Pr5_v2_client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Navrh n = new Navrh();
        n.setCislo("a");
        System.out.println(navrhZmluvy(n));
    }

    private static Zmluva navrhZmluvy(ws.Navrh part1) {
        ws.NewWSDLService service = new ws.NewWSDLService();
        ws.NewWSDLPortType port = service.getNewWSDLPort();
        return port.navrhZmluvy(part1);
    }
}
