public class Jugador{
    private String nombre;

    public Jugador(String nombrex){
        nombre = nombrex;
    }
    public Jugador(){
        nombre = null;
    }

    public String getNombre(){
        return this.nombre;
    }
}