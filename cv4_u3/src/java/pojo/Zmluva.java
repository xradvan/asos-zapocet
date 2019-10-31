/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author peter
 */
public class Zmluva {
    private String id;
    private Osoba majitel;
    private Osoba poistenec;

    public Zmluva() {
    }

    public Zmluva(String id, Osoba majitel, Osoba poistenec) {
        this.id = id;
        this.majitel = majitel;
        this.poistenec = poistenec;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Osoba getMajitel() {
        return majitel;
    }

    public void setMajitel(Osoba majitel) {
        this.majitel = majitel;
    }

    public Osoba getPoistenec() {
        return poistenec;
    }

    public void setPoistenec(Osoba poistenec) {
        this.poistenec = poistenec;
    }
}
