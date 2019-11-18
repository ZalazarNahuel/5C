public class ParlanteValija extends Parlante{
    private double peso;
    private int cantRuedas;

    public ParlanteValija(String marcax, double pesox){
        super.setMarca(marcax);
        this.peso = pesox;
    }
    public ParlanteValija(String marcax, double pesox,int cantRuedasx, float sonidox, boolean bluetoothx ){
        this(marcax,pesox);
        super.setBluetooth(bluetoothx);
        super.setSonido(sonidox);
        this.cantRuedas= cantRuedasx;
    }
    public ParlanteValija(){
        this("Sony",23);
    }
}