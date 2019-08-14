package micros;

public class Moderado extends Empleado {
    private int cantLugaresLibres;

    public Moderado(String nombrex,  int cantLugaresLibresx){
        super(nombrex);
        this.cantLugaresLibres = cantLugaresLibresx;
    }

    public int getCantLugaresLibres(){
        return this.cantLugaresLibres;
    }
}
