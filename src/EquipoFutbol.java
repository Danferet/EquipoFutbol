import java.util.ArrayList;

//clase princial que tendrá un nombre, un entrenadro 1:1 y una lista de jugadores 1:N
public class EquipoFutbol {

    private String nombre;
    private Entrenador entrenador;
    private ArrayList<Jugador> listaJugadores;

    //Constructor que pasa por parámetros el nombre del equipo y el entrenador
    public EquipoFutbol(String nombre, Entrenador entrenador){
        this.nombre = nombre;
        this.entrenador = entrenador;
        //La lista se inicializa, pero no se pasa la lista completa por parámetro.
        this.listaJugadores = new ArrayList<>();

    }

    //Con este metodo pasamos jugadores a la lista.
    //Retorna un void, no se guarda en ningna variable, solo hace su trabajo y punto.
    //Por convención se llaman add... en este Caso addJugador.
    //Por parámetros pasamos una instancia de la clase jugador.
    //Dentro del metodo, cogemos la lista y con el .add que tienen los ArrayList<> le pasamos el jugador
    public void addJugador(Jugador jugador){

        listaJugadores.add(jugador);

    }


    //Metodos getters y setters

    //Metodo getter, estructura: palabra reservada public; dato que devuelve;
    //Nombre del metodo -> get... en este caso getNombre;
    //Finalmente los parentesis vacíos (), ya que no reciben nada por parámetros;
    //Dentro del metodo tendremos la palabra reservada return seguida del atribudo que devuelve, en este caso nombre;
    public String getNombre() {
        return nombre;
    }


    //Metodo setter, estructura: palabra reservada public; void, pues no devuelve nada, solo hace un cambio;
    //Nombre del metodo -> set... en este caso setNombre;
    //Finalmente, los paréntesis:
    //En este caso con el tipo de dato del atributo que vamos a cambiar y un nombre para la variable.
    //Dentro del metodo, igual que en el constructor para el atributo: this.nombredelatributo = nombredelatributo.
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

    //Metodo to String: metodo predefinido en java. Se llama con public String toString(){}
    //Dentro de las llaves podemos hacer que nos retorne los datos de la clase como notros queramos,
    //pasándolo luego por el return como un tipo cadena.

    @Override
    public String toString() {
        return "EquipoFutbol ->" +
                "\nNombre = " + nombre + '\'' +
                "\nEntrenador = " + entrenador +
                "\nListaJugadores = " + listaJugadores;
    }
}
