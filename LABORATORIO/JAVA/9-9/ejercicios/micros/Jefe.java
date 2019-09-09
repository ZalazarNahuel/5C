package micros;

public class Jefe extends Empleado{
    private boolean decision;

    public Jefe(String nombrex){
        super(nombrex);
        this.decision = false;
    }

    public boolean getDecision(){
        return decision;
    }
    public void setDecision(boolean decisionx){
        this.decision = decisionx;
    }
}

