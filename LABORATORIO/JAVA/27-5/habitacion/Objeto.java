package habitacion;
public class Objeto{
    
    float peso;
    String color;
    String material;

    public Objeto(float pesox, String colorx, String materialx){
        peso=pesox;
        color=colorx;
        material=materialx;
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