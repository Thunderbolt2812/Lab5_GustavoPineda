/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_gustavopineda;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Pais {
    private String nombre;
    private Date fundacion;
    private String himno;
    private Color colorB;

    public Pais() {
    }

    public Pais(String nombre, Date fundacion, String himno, Color colorB) {
        this.nombre = nombre;
        this.fundacion = fundacion;
        this.himno = himno;
        this.colorB = colorB;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFundacion() {
        return fundacion;
    }

    public void setFundacion(Date fundacion) {
        this.fundacion = fundacion;
    }

    public String getHimno() {
        return himno;
    }

    public void setHimno(String himno) {
        this.himno = himno;
    }

    public Color getColorB() {
        return colorB;
    }

    public void setColorB(Color colorB) {
        this.colorB = colorB;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
