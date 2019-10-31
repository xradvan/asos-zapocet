/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.util.HashMap;
import java.util.Map;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pojo.DenEnum;
import pojo.Jedlo;
import pojo.Menu;

/**
 *
 * @author peter
 */
@WebService(serviceName = "JedalenService")
public class JedalenService {
    private Map<DenEnum, Menu> tyzdenneMenu;

    public JedalenService() {
        tyzdenneMenu = new HashMap<>();
        for (DenEnum d : DenEnum.values()) {
            tyzdenneMenu.put(d, new Menu());
        }
        tyzdenneMenu.get(DenEnum.PONDELOK).addJedlo(new Jedlo("pizza", 8.50, "hawai"));
    }

    @WebMethod
    public Menu getMenu(@WebParam(name = "d") DenEnum d) {
        return tyzdenneMenu.get(d);
    }
    
    @WebMethod
    public void addJedlo(@WebParam(name = "j") Jedlo j, @WebParam(name = "d") DenEnum d ) {
        tyzdenneMenu.get(d).addJedlo(j);
    }
}
