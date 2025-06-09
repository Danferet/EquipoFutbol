public class Main {

    public static void main(String[] args) {

        Entrenador e1 = new Entrenador("Pinchependejo", 65, "Rumano",
                "Entrenador Internacional de Fútbol nivel III.");

        Jugador j1 = new Jugador("Messi", 40, "Argentino","Zurdo");
        Jugador j2 = new Jugador("Ronaldo", 40, "Portugués", "Ambidiestro");

        EquipoFutbol gijon = new EquipoFutbol("Gijón FC", e1);

        gijon.addJugador(j1);
        gijon.addJugador(j2);

        String estadoJugador = j1.saludar(e1.getNombre());

        System.out.println(estadoJugador);
        System.out.println();

        System.out.println(gijon);
    }
}
