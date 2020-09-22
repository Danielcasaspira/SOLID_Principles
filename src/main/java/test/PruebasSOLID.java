package test;

import co.com.futbol.*;
import java.util.ArrayList;
import java.util.List;



public class PruebasSOLID {
    public static void main(String[] args) {
        Arquero arquero1 =new Arquero("Erick","masculino",25,2);
        Defensa defensa1=new Defensa("Jhon","masculino",25,1);
        Delantero delantero1= new Delantero("juan","masculino",23,2);
        MedioCampista mediocampista1=new MedioCampista("juan","masculino",22,1);
        Equipo equipo = new Equipo("equipo 1",arquero1,defensa1,delantero1,mediocampista1);
        
        
        Nomina nomina1 = new Nomina();
        nomina1.agregarJugador(equipo);

        nomina1.mostrarNomina();
        
        
        // Implementación del principio de Liskov
        
        List<Futbolista> futbolistas = new ArrayList<>();
        
        futbolistas.add(defensa1);
        futbolistas.add(arquero1);
        futbolistas.add(delantero1);
        futbolistas.add(mediocampista1);
        
        Equipo2 equipo2 = new Equipo2(futbolistas);
        
        System.out.println(equipo2.toString());
    }
}
