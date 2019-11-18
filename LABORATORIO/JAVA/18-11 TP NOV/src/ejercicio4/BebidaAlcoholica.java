package ejercicio4;

public class BebidaAlcoholica extends Bebida {
    private int cantAlcoholica;
    public BebidaAlcoholica(String nombre,int alcohol){
        super(nombre,0,alcohol*20);
        cantAlcoholica = alcohol;
    }

    public int getCantAlcoholica() {
        return cantAlcoholica;
    }
}
