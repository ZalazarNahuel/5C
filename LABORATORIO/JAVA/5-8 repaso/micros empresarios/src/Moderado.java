public class Moderado extends Empleado {
    private int cantLugaresLibres;

    public Moderado(String nombrex, String tipox, int cantLugaresLibresx){
        super(nombrex);
        this.cantLugaresLibres = cantLugaresLibresx;
    }

    public int getCantLugaresLibres(){
        return this.cantLugaresLibres;
    }
}
