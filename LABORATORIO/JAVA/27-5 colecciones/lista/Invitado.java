public class Invitado{
    private String nombre;

    public Invitado(String nombrex){
        nombre = nombrex;
    }
    public Invitado(){
        nombre = null;
    }

    public String getNombre(){
        return this.nombre;
    }
}