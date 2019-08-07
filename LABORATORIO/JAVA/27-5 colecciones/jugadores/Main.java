public class Main{
    public static void main(String[] args) {
        Equipo e = new Equipo();
        
        e.addJugador(new Jugador("nahuel"), 10);
        e.addJugador(new Jugador("carbone"), 3);
        e.addJugador(new Jugador("conde"), 7);
        e.addJugador(new Jugador("gamba"), 12);

        e.mostrarJugadoresImpar();
    }
}