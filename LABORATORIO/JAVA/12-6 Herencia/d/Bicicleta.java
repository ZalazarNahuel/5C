public class Bicicleta {



    private int rodado;
    private String color;

    public Bicicleta(int rodadox,String colorx){
        this.rodado = rodadox;
        this.color = colorx;
    }
    public int getRodado(){
        return this.rodado;
    }
    public String getColor(){
        return this.color;
    }
    public void imprimirAtributos(){
        System.out.println("Rodado "+this.getRodado());
        System.out.println("Color "+this.getColor());
    }
}