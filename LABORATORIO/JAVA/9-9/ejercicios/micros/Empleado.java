package micros;

public class Empleado {
    private String nombre;

    public Empleado(String nombrex){
        this.nombre = nombrex;
    }
    public Empleado(){
        this.nombre = "";
    }

    public String getNombre(){
        return this.nombre;
    }
}
