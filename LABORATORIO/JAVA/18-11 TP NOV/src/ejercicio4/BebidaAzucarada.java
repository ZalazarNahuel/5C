package ejercicio4;

public class BebidaAzucarada extends Bebida {
    private int cantAzucar;
    public BebidaAzucarada(String nombre, int azucar){
        super(nombre,1,azucar*10);
        cantAzucar = azucar;
    }

    public int getCantAzucar() {
        return cantAzucar;
    }
}
