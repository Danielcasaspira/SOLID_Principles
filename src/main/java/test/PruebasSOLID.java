/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import co.com.futbol.Delantero;
import co.com.futbol.IAccesoMovimientos;
import co.com.futbol.IAsistencias;
import co.com.futbol.MedioCampista;


public class PruebasSOLID {
    public static void main(String[] args) {
     
        IAsistencias accion = new MedioCampista("Pepe","M",30, (float) 1.80);
        accion.hacerAsistencias();
        IAccesoMovimientos movim =  new Delantero("Luis", "M", 28, (float) 1.75);
        movim.patear();
    }
}
