/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.futbol;

/**
 *
 * @author casashd
 */
public class Delantero extends Fubolista {
    
    private float velocidad;
    private int goles;
    private String piePateo;

    public Delantero(String nombre, String genero, int edad, float altura) {
        super(nombre, genero, edad, altura);
    }

 
    /**
     * @return the velocidad
     */
    public float getVelocidad() {
        return velocidad;
    }

    /**
     * @param velocidad the velocidad to set
     */
    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * @return the goles
     */
    public int getGoles() {
        return goles;
    }

    /**
     * @param goles the goles to set
     */
    public void setGoles(int goles) {
        this.goles = goles;
    }

    /**
     * @return the piePateo
     */
    public String getPiePateo() {
        return piePateo;
    }

    /**
     * @param piePateo the piePateo to set
     */
    public void setPiePateo(String piePateo) {
        this.piePateo = piePateo;
    }

    @Override
    public String toString() {
        return "Delantero{" + "velocidad=" + velocidad + ", goles=" + goles + ", piePateo=" + piePateo + '}';
    }
    
    
    
}
