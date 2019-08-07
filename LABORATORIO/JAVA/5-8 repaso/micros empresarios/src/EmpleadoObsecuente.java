public class EmpleadoObsecuente extends Empleado {
    private EmpleadoJefe jefe;
    public EmpleadoObsecuente(String nombrex, String tipox, EmpleadoJefe jefex){
        super(nombrex,tipox);
        this.jefe = jefex;
    }

    public EmpleadoJefe getJefe(){
        return this.jefe;
    }
}
