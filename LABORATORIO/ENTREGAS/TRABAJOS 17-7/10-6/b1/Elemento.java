public class Elemento {

    private double peso;
    private String color;
    private String material;

    public Elemento(double pesox, String colorx, String materialx){
        this.peso = pesox;
        this.color = colorx;
        this.material = materialx;
    }

    public double getPeso(){
        return this.peso;
    }
    public String getColor(){
        return this.color;
    }
    public String getMaterial(){
        return this.material;
    }
    public void mostrar(){
        System.out.println(this.getColor());
        System.out.println(this.getPeso());
        System.out.println(this.getMaterial());
    }

}
