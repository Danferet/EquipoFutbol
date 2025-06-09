public class Jugador extends Persona{

    private String piernaBuena;

    public Jugador(String nombre, int edad, String nacionalidad, String piernaBuena){

        super(nombre, edad, nacionalidad);
        this.piernaBuena = piernaBuena;

    }

    public String getPiernaBuena() {
        return piernaBuena;
    }

    public void setPiernaBuena(String piernaBuena) {
        this.piernaBuena = piernaBuena;
    }

    public String saludar(String nombre){

        return getNombre() + " saluda a " + nombre + ".";

    }

    @Override
    public String toString() {
        return super.toString()
                + "\nPierna Buena = "
                + piernaBuena + "\n";
    }
}
