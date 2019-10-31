/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.util.Random;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pojo.Zmluva;

/**
 *
 * @author peter
 */
@WebService(serviceName = "ZmluvyService")
public class ZmluvyService {
    private Random random;

    public ZmluvyService() {
        random = new Random(121);
    }

    @WebMethod
    public Zmluva navrhZmluvy(@WebParam(name = "navrh") Zmluva navrh) throws Exception {
        if (navrh.getMajitel() == null) {
            throw new Exception("majitel nie je zadany");
        }
        
        if (navrh.getPoistenec() == null) {
            throw new Exception("poistenec nie je zadany");
        }
        
        navrh.setId(genId());
        return navrh;
    }
    
    private String genId() {
        return "Z" + random.nextInt(9) + random.nextInt(9) + random.nextInt(9)
                + random.nextInt(9); 
    }
}
