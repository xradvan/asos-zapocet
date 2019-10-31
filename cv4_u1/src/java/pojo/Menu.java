/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author peter
 */
public class Menu {
    private List<Jedlo> ponuka;
    private DenEnum den;
    
    public Menu() {
        ponuka = new ArrayList<>();
    }

    public DenEnum getDen() {
        return den;
    }

    public void setDen(DenEnum den) {
        this.den = den;
    }

    public void addJedlo(Jedlo j) {
        ponuka.add(j);
    }

    public List<Jedlo> getPonuka() {
        return ponuka;
    }

    public void setPonuka(List<Jedlo> ponuka) {
        this.ponuka = ponuka;
    }
}
