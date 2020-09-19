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
public class Fubolista {
    
    private String nombre;
    private String genero;
    private int edad;
    private float altura;

    public Fubolista(String nombre, String genero, int edad, float altura) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.altura = altura;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Fubolista{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", altura=" + altura + '}';
    }
   
    
}
