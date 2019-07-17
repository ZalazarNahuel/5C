import java.util.ArrayList;

public class Rutina {

    private String nombre;
    private ArrayList<Instruccion> instrucciones = new ArrayList<Instruccion>();

    public Rutina(String nombrex){
        this.nombre=nombrex;
    }

    public String getNombre(){
        return this.nombre;
    }

    public Instruccion getInstrucciones(int x){
        return this.instrucciones.get(x);
    }

    public int getSizeInstrucciones(){
        return this.instrucciones.size();
    }

    public void addInstruccion(Instruccion instruccion){
        instrucciones.add(instruccion);
    }


}
