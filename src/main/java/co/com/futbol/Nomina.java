package co.com.futbol;

public class Nomina {
    private final int idNomina;
    private Equipo jugadores[];
    private static int contadorNomina;
    private static final int MAX_Nomina=11;
    private int contadorJugador;

    public Nomina() {
    
        this.idNomina = ++Nomina.contadorNomina;
        this.jugadores=new Equipo [Nomina.MAX_Nomina];
        
    }

 
    
    public void agregarJugador(Equipo jugador){
        if(this.contadorJugador < Nomina.MAX_Nomina){
            this.jugadores[this.contadorJugador++]=jugador;   
        }
        else{
            System.out.println("Ha superado el limite de jugadores" + Nomina.MAX_Nomina);
        
        }
        
    }
    
    public void mostrarNomina(){
        System.out.println("Nomina #1:"+this.idNomina);
        System.out.println("Jugadores de la nomina #" + this.idNomina);
        for(int i=0;i<this.contadorJugador;i++){
            System.out.println(this.jugadores[i]);
        }
    }
    
    
}
