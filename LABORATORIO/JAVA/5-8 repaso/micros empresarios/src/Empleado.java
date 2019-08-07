public class Empleado {
    private String nombre;
    private String tipo;

    public Empleado(String nombrex, String tipox){
        this.nombre = nombrex;
        this.tipo = tipox;
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getTipo(){
        return this.tipo;
    }
}
