/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.futbol;

import co.com.acciones.IAccesoMovimientos;
import co.com.acciones.IAtraparBalon;


public class Arquero extends Futbolista implements IAccesoMovimientos, IAtraparBalon{
    
    private int atajadas;
    
    public Arquero(String nombre, String genero, int edad, float altura) {
        super(nombre, genero, edad, altura);
    }

    public int getAtajadas() {
        return atajadas;
    }

    public void setAtajadas(int atajadas) {
        this.atajadas = atajadas;
    }

    @Override
    public void saltar() {
        System.out.println("Arquero saltando...");
    }

    @Override
    public void correr() {
        System.out.println("Arquero corriendo...");
    }

    @Override
    public void patear() {
        System.out.println("Arquero pateando balóns...");
    }

    @Override
    public void recuperar() {
        System.out.println("Arquero recuperando balón...");
    }

    @Override
    public void atraparBalon() {
        System.out.println("Arquero atrapando balón...");
    }
    
}
