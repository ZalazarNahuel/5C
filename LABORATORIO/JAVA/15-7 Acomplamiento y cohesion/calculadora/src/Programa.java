import java.util.ArrayList;

public class Programa {


    private ArrayList<Rutina> rutinas = new ArrayList<Rutina>();

    public Programa(){

    }

    public ArrayList<Rutina> getRutinas() {
        return rutinas;
    }

    public void agregarRutina(Rutina rutina){
        rutinas.add(rutina);
    }
    }
