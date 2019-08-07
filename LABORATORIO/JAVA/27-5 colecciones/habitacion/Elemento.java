public class Elemento{
    
    private String nombre;
    private float peso;
    private String color;
    private String material;

    public Elemento(String nombrex, float pesox, String colorx, String materialx){
        nombre = nombrex;
        peso=pesox;
        color=colorx;
        material=materialx;
    }

    public String getNombre(){
        return this.nombre;
    }
    public float getPeso(){
        return this.peso;
    }
    public String getColor(){
        return this.color;
    }
    public String getMaterial(){
        return this.material;
    }
}