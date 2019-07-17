import java.util.ArrayList;

public class Jugador {

    private String nombre;
    private ArrayList<Punto> puntaje;

    public Jugador(String nombrex){
        nombre = nombrex;
        puntaje = new ArrayList<Punto>();
        puntaje.add(new Punto("1",0));
        puntaje.add(new Punto("2",0));
        puntaje.add(new Punto("3",0));
        puntaje.add(new Punto("4",0));
        puntaje.add(new Punto("5",0));
        puntaje.add(new Punto("escalera",0));
        puntaje.add(new Punto("full",0));
        puntaje.add(new Punto("poker",0));
        puntaje.add(new Punto("generala",0));
    }

    public void mostrarPuntaje(){
        System.out.println("juego          punto");
        for(int i = 0 ; i < puntaje.size();i++){
            if(i<5) System.out.println(puntaje.get(i).getNombre()+"               "+puntaje.get(i).getPunto());
            if(i == 5) System.out.println(puntaje.get(i).getNombre()+"        "+puntaje.get(i).getPunto());
            if(i == 6) System.out.println(puntaje.get(i).getNombre()+"            "+puntaje.get(i).getPunto());
            if(i == 7) System.out.println(puntaje.get(i).getNombre()+"           "+puntaje.get(i).getPunto());
            if(i == 8) System.out.println(puntaje.get(i).getNombre()+"        "+puntaje.get(i).getPunto());
        }
    }
    public void mostrarNombre(){
        System.out.println(this.getNombre());
    }
    public String getNombre(){
        return this.nombre;
    }
}
