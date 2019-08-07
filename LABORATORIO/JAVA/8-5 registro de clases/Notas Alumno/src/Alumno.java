import java.util.ArrayList;

public class Alumno {


    private ArrayList<Integer> listaNotas = new ArrayList<Integer>();
    private String nombre;
    private String apellido;

    public Alumno(String nombrex, String apellidox){
        nombre=nombrex;
        apellido=apellidox;
    }

    public String getNombre() {
        return this.nombre;
    }
    public String getApellido() {
        return this.apellido;
    }

    public void AgregoNotas(int nota){
        this.listaNotas.add(nota);
    }
    public int PromedioNotas(){
        int suma=0;
        for(int i=0;i<this.listaNotas.size();i++){
            suma=suma+this.listaNotas.get(i);
        }
        int promedio=suma/this.listaNotas.size();
        return promedio;
    }
}
