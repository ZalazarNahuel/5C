package micros;

public class Obsecuente extends Empleado {
    private Jefe jefe;
    public Obsecuente(String nombrex, Jefe jefex){
        super(nombrex);
        this.jefe = jefex;
    }
    public Jefe getJefe(){
        return this.jefe;
    }
}
