package co.com.futbol;

public class Equipo {
    private final int idEquipo;
    private String nombre;
    private Arquero arquero;
    private Defensa defensa;
    private Delantero delantero;
    private MedioCampista medioCampista;
    private static int contadorJugador;

    private Equipo(){
        this.idEquipo=++Equipo.contadorJugador;
    }

    public Equipo(String nombre, Arquero arquero, Defensa defensa, Delantero delantero, MedioCampista medioCampista) {
        this();
        this.nombre = nombre;
        this.arquero = arquero;
        this.defensa = defensa;
        this.delantero = delantero;
        this.medioCampista = medioCampista;
    }

    public int getIdNomina() {
        return idEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public Arquero getArquero() {
        return arquero;
    }

    public void setArquero(Arquero arquero) {
        this.arquero = arquero;
    }

    public Defensa getDefensa() {
        return defensa;
    }

    public void setDefensa(Defensa defensa) {
        this.defensa = defensa;
    }

    public Delantero getDelantero() {
        return delantero;
    }

    public void setDelantero(Delantero delantero) {
        this.delantero = delantero;
    }

    public MedioCampista getMedioCampista() {
        return medioCampista;
    }

    public void setMedioCampista(MedioCampista medioCampista) {
        this.medioCampista = medioCampista;
    }

    @Override
    public String toString() {
        return "Equipo{" + "#Equipo=" + idEquipo + ", nombre=" + nombre + ", arquero=" + arquero + ", defensa=" + defensa + ", delantero=" + delantero + ", medioCampista=" + medioCampista + '}';
    }
     
    

    
}
