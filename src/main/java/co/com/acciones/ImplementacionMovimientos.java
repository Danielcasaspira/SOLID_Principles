/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.acciones;

import co.com.futbol.IAccesoMovimientos;


public class ImplementacionMovimientos implements IAccesoMovimientos{

    @Override
    public void saltar() {
        System.out.println("Saltando... ");
    }

    @Override
    public void correr() {
        System.out.println("Corriendo... ");
    }

    @Override
    public void patear() {
        System.out.println("Pateando balón... ");
    }

    @Override
    public void recuperar() {
        System.out.println("Recuperando balón... ");
    }
    
}
