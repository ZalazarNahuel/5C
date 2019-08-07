public class SillaGamer extends Silla{
    private int cantRuedas;

    public SillaGamer(){
        this(3);
    }
    public SillaGamer(int cantRuedasx){
        cantRuedas = cantRuedasx;
    }
    public SillaGamer(String marcax){
        this(3);
        super.setMarca(marcax);
    }
}