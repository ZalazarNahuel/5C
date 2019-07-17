public class Punto {
    String nombre;
    int punto;

    public Punto (String nombrex, int puntox){
        nombre = nombrex;
        punto = puntox;
    }

    public String getNombre(){
        return this.nombre;
    }
    public int getPunto(){
        return this.punto;
    }
}
