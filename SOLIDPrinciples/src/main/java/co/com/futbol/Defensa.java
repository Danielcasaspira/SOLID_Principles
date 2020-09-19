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
public class Defensa extends Fubolista {

    private int bloquedas;
    private int pases_efectivos;
    private int cabezazos;

    public Defensa(String nombre, String genero, int edad, float altura) {
        super(nombre, genero, edad, altura);
    }
    

    /**
     * @return the bloquedas
     */
    public int getBloquedas() {
        return bloquedas;
    }

    /**
     * @param bloquedas the bloquedas to set
     */
    public void setBloquedas(int bloquedas) {
        this.bloquedas = bloquedas;
    }

    /**
     * @return the pases_efectivos
     */
    public int getPases_efectivos() {
        return pases_efectivos;
    }

    /**
     * @param pases_efectivos the pases_efectivos to set
     */
    public void setPases_efectivos(int pases_efectivos) {
        this.pases_efectivos = pases_efectivos;
    }

    /**
     * @return the cabezazos
     */
    public int getCabezazos() {
        return cabezazos;
    }

    /**
     * @param cabezazos the cabezazos to set
     */
    public void setCabezazos(int cabezazos) {
        this.cabezazos = cabezazos;
    }

    @Override
    public String toString() {
        return "Defensa{" + "bloquedas=" + bloquedas + ", pases_efectivos="
                + pases_efectivos + ", cabezazos=" + cabezazos + '}';
    }

}
