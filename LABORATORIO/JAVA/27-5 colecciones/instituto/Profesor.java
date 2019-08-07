public class Profesor{
    private String nombre;

    public Profesor(String nombrex){
        nombre = nombrex;
    }
    public Profesor(){
        nombre = null;
    }

    public String getNombre(){
        return this.nombre;
    }
}