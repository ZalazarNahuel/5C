public class Paciente {




    private String nombre;
    private String apellido;
    private Especialidad especialidad;
    private int turno;

    public Paciente(){
        nombre="";
        apellido="";
        turno=0;
    }

    public int getTurno() {
        return this.turno;
    }
    public Especialidad getEspecialidad() {
        return this.especialidad;
    }

    public void sacarTurno(String nombrex, String apellidox, Especialidad especialidadx){
        this.nombre=nombrex;
        this.apellido=apellidox;
        this.especialidad=especialidadx;
        especialidadx.setTurno((especialidadx.getTurno()+1));
        this.turno=especialidadx.getTurno();
    }

}
