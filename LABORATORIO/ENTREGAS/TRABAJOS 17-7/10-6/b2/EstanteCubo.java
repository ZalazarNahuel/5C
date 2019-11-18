public class EstanteCubo extends Estante{
    private int largo;
    private int ancho;
    private int profundidad;

    public  EstanteCubo(){
        this(2,3,4);
    }
    public EstanteCubo(int largox, int anchox, int profundidadx){
        largo = largox;
        ancho = anchox;
        profundidad = profundidadx;
    }
    public EstanteCubo(int largox, String materialx, String colorx){
        this(largox,2,3);
        super.setColor(colorx);
        super.setMaterial(materialx);
    }
}