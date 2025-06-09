public class Jugador extends Persona{

    private String piernaBuena;

    //En el constructor tenemos que poner todos los atributos que queramos que tenga el Jugador,
    //Incluidos los que no tiene aquí, que hereda de la clase padre.
    //nombre, edad y nacionalidad los hereda de la clase padre, y piernaBuena es propia.
    public Jugador(String nombre, int edad, String nacionalidad, String piernaBuena){

        //super hará referencia al constructor de la clase padre
        // y guardará las variables en los atributos como si estuvieran en esta misma clase
        super(nombre, edad, nacionalidad);

        //Agregamos además el atributo propio
        this.piernaBuena = piernaBuena;

    }

    public String getPiernaBuena() {
        return piernaBuena;
    }

    public void setPiernaBuena(String piernaBuena) {
        this.piernaBuena = piernaBuena;
    }

    //Un metodo de lógica de programa simple para hacer una prueba. Estructura:
    //palabra resevada public; dato que devuelve, en este caso, String; nombre del metodo;
    //Paréntesis con parámetros, en este caso recibe un String.

    //Dentro del metodo obligatorio el return, ya que devuelve un dato.
    //En este caso el jugador saluda a otra "quien sea". Obtenemos el nombre del jugador que utilice el metodo
    //con su respectivo metodo getNombre, nuestra frase saluda a y seguidamente la cadena que pasamos por parámetro
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
