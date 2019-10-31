/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr4_v2_client;

import java.util.logging.Level;
import java.util.logging.Logger;
import ws.DruhPoisteniaEnum;
import ws.NavrhZmluvyFault;
import ws.Osoba;
import ws.Zmluva;

/**
 *
 * @author peter
 */
public class Pr4_v2_client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Osoba majitel = new Osoba();
        majitel.setId("Id0000");
        majitel.setMeno("Marek");
        majitel.setPriezvisko("Boldis");
        
        Zmluva z = new Zmluva();
        z.setCislo("Z0000");
        z.setDruh(DruhPoisteniaEnum.ZIVOTNE);
        z.setMajitel(majitel);
        z.getPoistenec().add(majitel);
        z.getUcastnik().add(majitel);
        
        try {
            System.out.println(navrhZmluvy(z));
        } catch (NavrhZmluvyFault ex) {
            System.out.println(ex);
        }
    }

    private static Zmluva navrhZmluvy(ws.Zmluva part1) throws NavrhZmluvyFault {
        ws.NewWSDLService service = new ws.NewWSDLService();
        ws.NewWSDLPortType port = service.getNewWSDLPort();
        return port.navrhZmluvy(part1);
    }
    
}
