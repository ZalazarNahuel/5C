import java.util.ArrayList;

public class Materia {


    private String nombre;
    private ArrayList<Alumno> listaAlumno = new ArrayList<Alumno>();
    private int curso;
    private String horarioCursada;
    private ArrayList<String> diasCursada = new ArrayList<String>();

    public Materia(String nombrex, int cursox, String horarioCursadax){
        nombre=nombrex;
        curso=cursox;
        horarioCursada=horarioCursadax;
        horarioCursada=horarioCursadax;
    }
    public Alumno getAlumno(int i){
        return this.listaAlumno.get(i);
    }

    public void AgregoAlumno(Alumno alumno){
        this.listaAlumno.add(alumno);
    }
    public void AgregoDiasCursada(String dia){
        this.diasCursada.add(dia);
    }

}
