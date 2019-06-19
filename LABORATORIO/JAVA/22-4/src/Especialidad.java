import java.util.ArrayList;

public class Especialidad {


    private String tipoEspecialidad;
    private ArrayList<Medico> medicos= new ArrayList<Medico>();
    private int turno;
    private int cantMedicos;

    public Especialidad(String nombreEspecialidad){
        this.tipoEspecialidad=nombreEspecialidad;
        this.turno=0;
    }

    public void setTurno(int turnox) {
        this.turno = turnox;
    }

    public int getTurno() {
        return this.turno;
    }
    public String getTipoEspecialidad() {
        return this.tipoEspecialidad;
    }
    public Medico getMedico(int i){
        return this.medicos.get(i);
    }
    public int getCantMedicos(){
        return this.cantMedicos;
    }

    public void agregarMedico(Medico medico){
        this.medicos.add(medico);
    }

}
