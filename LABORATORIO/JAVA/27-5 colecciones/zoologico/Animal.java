public class Animal{
    private String tipo;
    private String nombre;

    public Animal(String tipox, String nombrex){
        tipo = tipox;
        nombre = nombrex;
    }

    public String getTipo(){
        return this.tipo;
    }
    public String getNombre(){
        return this.nombre;
    }
}