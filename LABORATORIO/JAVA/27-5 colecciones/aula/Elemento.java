public class Elemento {

    private String nombre;
    private int cant;

    public Elemento(String nombrex, int cantx){
        cant = cantx;
        nombre = nombrex;
    }
    public int getCant(){
        return this.cant;
    }
    public String getNombre(){
        return this.nombre;
    }
}
