public class Guerrero extends Personaje {

    private int cantEspadas;
    private int fuerza;

    public Guerrero(String nombrex, int saludx, int fuerzax, int cantEspadasx){
        super(nombrex,saludx);
        fuerza = fuerzax;
        cantEspadas = cantEspadasx;
    }

    public int getFuerza(){
        return this.fuerza;
    }
    public int getCantEspadas(){
        return this.cantEspadas;
    }
    public void mostarGuerrero(){
        super.mostar();
        System.out.println("Fuerza "+this.getFuerza());
        System.out.println("Cantidad de espadas "+this.getCantEspadas());
    }
}
