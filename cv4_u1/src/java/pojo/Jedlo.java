/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author peter
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class Jedlo {
    @XmlElement(required = true)
    private String nazov;

    @XmlElement(required = true)
    private Double cena;

    @XmlElement(required = true)
    private String popis;

    public Jedlo() {
    }

    public Jedlo(String nazov, Double cena, String popis) {
        this.nazov = nazov;
        this.cena = cena;
        this.popis = popis;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }
}
