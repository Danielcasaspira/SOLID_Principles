
package co.com.futbol;

import java.util.List;


public class Equipo2 {
    
    List<Futbolista> jugadores;
    
    
    public Equipo2(List<Futbolista> jugadores){
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Equipo2{jugadores=").append(jugadores);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
