import java.util.ArrayList;

public class EquipoFutbol {

    private String nombre;
    private Entrenador entrenador;
    private ArrayList<Jugador> listaJugadores;

    public EquipoFutbol(String nombre, Entrenador entrenador){
        this.nombre = nombre;
        this.entrenador = entrenador;
        this.listaJugadores = new ArrayList<>();

    }

    public void addJugador(Jugador jugador){

        listaJugadores.add(jugador);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    @Override
    public String toString() {
        return "EquipoFutbol ->" +
                "\nNombre = " + nombre + '\'' +
                "\nEntrenador = " + entrenador +
                "\nListaJugadores = " + listaJugadores;
    }
}
