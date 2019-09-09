import cuaderno.Cuaderno;
import cuaderno.Pedido;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestsCuaderno {
    @Test
    void casoDeTest1() {

        Pedido p = new Pedido();
        p.addCuaderno(Cuaderno.CHICO24,1);
        p.addCuaderno(Cuaderno.MEDIANO48,1);
        p.addCuaderno(Cuaderno.GRANDE98,1);
        assertEquals(p.getMonto(),330);

    }
    @Test
    void casoDeTest2() {

        Pedido p2 = new Pedido();
        p2.addCuaderno(Cuaderno.CHICO24,0);
        p2.addCuaderno(Cuaderno.MEDIANO48,2);
        p2.addCuaderno(Cuaderno.GRANDE98,0);
        assertEquals(p2.getMonto(),200);
    }

}
