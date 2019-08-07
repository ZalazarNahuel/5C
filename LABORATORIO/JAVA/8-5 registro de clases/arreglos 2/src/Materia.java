import java.util.ArrayList;

public class Materia {


    private String nombre;
    private ArrayList<Integer> listaNotas = new ArrayList<Integer>();

    public Materia(){
        nombre="";
    }

    public Materia(String nombreX, int nota){
        nombre=nombreX;
        listaNotas.add(nota);
    }
     public String getNombre(){
        return this.nombre;
     }
     public ArrayList<Integer> getListaNotas(){
        return this.listaNotas;
     }

     public void setNombre(String nombreX){
        this.nombre=nombreX;
     }
     public void setListaNotas(int nota){
        this.listaNotas.add(nota);
     }
}
