import java.util.ArrayList;

public class Medico {


    private String nombre;
    private String apellido;
    private Especialidad especialidad;
    private ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
    private int matriculaNacional;

    public Medico(String nombrex, String apellidox, int matriculaNacionalx){
        nombre=nombrex;
        apellido=apellidox;
        matriculaNacional=matriculaNacionalx;
    }

    public void agregarPaciente(Paciente paciente){
        this.pacientes.add(paciente);
    }

}
