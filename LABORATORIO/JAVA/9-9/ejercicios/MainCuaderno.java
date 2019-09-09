import cuaderno.Cuaderno;
import cuaderno.Pedido;

public class MainCuaderno {
    public static void main(String[] args){
        Pedido p = new Pedido();
        p.addCuaderno(Cuaderno.CHICO24,1);
        p.addCuaderno(Cuaderno.MEDIANO48,1);
        p.addCuaderno(Cuaderno.GRANDE98,1);

        System.out.println(p.getMonto());
    }
}
