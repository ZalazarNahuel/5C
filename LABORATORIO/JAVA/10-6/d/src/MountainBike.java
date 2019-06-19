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
        System.out.println(this.getCantFrenosAdelante());
        System.out.println(this.getCantFrenosAtras());
    }


}
