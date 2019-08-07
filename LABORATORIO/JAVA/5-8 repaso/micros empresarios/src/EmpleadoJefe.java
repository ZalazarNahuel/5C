public class EmpleadoJefe extends Empleado {
    private boolean decision;

    public EmpleadoJefe(String nombrex, String tipox, boolean decisionx){
        super(nombrex, tipox);
        this.decision = decisionx;
    }
    public boolean getDecision(){
        return this.decision;
    }
}
