package equipo;

import java.util.ArrayList;

public class Equipo {
    private ArrayList<Jugador> jugadores;
    public Equipo(){
        jugadores = new ArrayList<Jugador>();
    }
    public void addJugador(Jugador j){
        jugadores.add(j);
    }
    public void jugadoresImpar(){
        for(int i = 0 ; i < jugadores.size() ; i++){
            if(jugadores.get(i).getNumero()%2 !=0){
                System.out.println(jugadores.get(i).getNumero());
            }
        }
    }
}
