public class Playera extends Bicicleta {



    boolean frenoPedal;
    boolean canasta;
    public Playera(int rodadox, String colorx, boolean frenoPedalx, boolean canastax){
        super(rodadox,colorx);
        frenoPedal = frenoPedalx;
        canasta = canastax;
    }
    public boolean getFrenoPedal(){
        return this.frenoPedal;
    }
    public boolean getCanasta(){
        return this.canasta;
    }
    public void imprimirAtributos(){
        super.imprimirAtributos();
        System.out.println("Canasta " + getCanasta());
        System.out.println("FrenoPedal "+getFrenoPedal());
    }
}
