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
public class MedioCampista extends Fubolista {
 
    private int asistencias;
    private int regates;
    private int faltas;

    public MedioCampista(String nombre, String genero, int edad, float altura) {
        super(nombre, genero, edad, altura);
    }
    /**
     * @return the asistencias
     */
    public int getAsistencias() {
        return asistencias;
    }

    /**
     * @param asistencias the asistencias to set
     */
    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    /**
     * @return the regates
     */
    public int getRegates() {
        return regates;
    }

    /**
     * @param regates the regates to set
     */
    public void setRegates(int regates) {
        this.regates = regates;
    }

    /**
     * @return the faltas
     */
    public int getFaltas() {
        return faltas;
    }

    /**
     * @param faltas the faltas to set
     */
    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    @Override
    public String toString() {
        return "MedioCampista{" + "asistencias=" + asistencias + ", regates=" + regates + ", faltas=" + faltas + '}';
    }

   
    
    
    
}
