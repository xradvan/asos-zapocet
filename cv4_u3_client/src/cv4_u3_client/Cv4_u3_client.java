/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv4_u3_client;

import ws.Exception_Exception;
import ws.Osoba;
import ws.Zmluva;

/**
 *
 * @author peter
 */
public class Cv4_u3_client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Osoba majitel = new Osoba(null, "Marcel", "Blaha");
        Osoba poistenec = new Osoba(null, "Karol", "Bold");
        
        Zmluva z = new Zmluva();
        z.setMajitel(majitel);
        z.setPoistenec(majitel);
        
        try {
            Zmluva z2 = navrhZmluvy(z);
            if (z2.getMajitel().equals(z2.getPoistenec())) {
                System.out.println("Poistenec je zaroven majitel zmluvy");
            } 
            else {
                System.out.println("Poistenec nie je aj majitel zmluvy");
            }
            
        } catch (Exception_Exception ex) {
            System.out.println(ex);
        }
    }

    private static Zmluva navrhZmluvy(ws.Zmluva navrh) throws Exception_Exception {
        ws.ZmluvyService_Service service = new ws.ZmluvyService_Service();
        ws.ZmluvyService port = service.getZmluvyServicePort();
        return port.navrhZmluvy(navrh);
    }
    
}
