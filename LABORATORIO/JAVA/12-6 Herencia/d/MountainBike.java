public class MountainBike extends Bicicleta {



    int cantFrenosAdelante;
    int cantFrenosAtras;

    public MountainBike(int rodadox, String colorx, int cantFrenosAdelantex, int cantFrenosAtrasx ){
        super(rodadox,colorx);
        cantFrenosAdelante = cantFrenosAdelantex;
        cantFrenosAtras = cantFrenosAtrasx;
    }
    public int getCantFrenosAdelante(){
        return this.cantFrenosAdelante;
    }
    public int getCantFrenosAtras(){
        return this.cantFrenosAtras;
    }
    public void imprimirAtributos(){
        super.imprimirAtributos();
        System.out.println("Cantidad de frenos adelante "+this.getCantFrenosAdelante());
        System.out.println("Cantidad de frenos atras "+this.getCantFrenosAtras());
    }


}
