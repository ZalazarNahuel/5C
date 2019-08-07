import java.util.ArrayList;

public class Alumno {




    private String nombre;
    private String apellido;
    private ArrayList<Integer> listaAsistencia = new ArrayList<Integer>();

    public Alumno(){
        nombre="";
        apellido="";
    }

    public String getApellido() {
        return this.apellido;
    }
    public String getNombre() {
        return this.nombre;
    }
    public ArrayList<Integer> getListaAsistencia(){
        return this.listaAsistencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void AgregoAsistencia(int asistencia){
        this.listaAsistencia.add(asistencia);
    }
    public int Faltas(){
        int cantidad=0;
        for(int i=0;i<this.listaAsistencia.size();i++){
            if(this.listaAsistencia.get(i)==0){
                cantidad++;
            }
        }
        return cantidad;
    }
}
