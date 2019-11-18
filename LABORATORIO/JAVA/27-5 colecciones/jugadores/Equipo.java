import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Equipo{
    private HashMap<Jugador,Integer> jugadores;
    public Equipo(){
        jugadores = new HashMap<Jugador, Integer>();
    }

    public void addJugador(Jugador nombre, Integer numero){
        jugadores.put(nombre, numero);
    }

    public HashSet<Jugador> getJugadoresImpar(){
        HashSet<Jugador> resultado = new HashSet<Jugador>();
        for(Map.Entry<Jugador,Integer> jugador : jugadores.entrySet()){
            if((jugador.getValue())%2 != 0){
                resultado.add(jugador.getKey());
            }
        }
        return resultado;
    }
    public void mostrarJugadoresImpar(){
        HashSet<Jugador> resultado = getJugadoresImpar();
        for(Jugador jugador: resultado){
            System.out.println(jugador.getNombre());
        }
    }
}