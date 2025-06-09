public class Entrenador extends Persona{

    private String titulo;

    public Entrenador(String nombre, int edad, String nacionalidad, String titulo){
        super(nombre, edad, nacionalidad);
        this.titulo = titulo;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nTitulo = " + titulo + "\n";
    }
}
