public class Util{
    private String nombre;
    private double precio;
    private String marca;

    public Util(String nombrex,double preciox, String marcax){
        nombre = nombrex;
        precio=preciox;
        marca=marcax;
    }

    public double getPrecio(){
        return this.precio;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getNombre(){
        return this.nombre;
    }
    
}
