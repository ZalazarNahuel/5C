import Aerolinea.Asiento;
import Aerolinea.Vuelo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestsAerolinea {
    @Test
    void casoDeTestReservar() {
        Vuelo v1 = new Vuelo();
        v1.addAsiento(new Asiento(1,1,"pasillo"));
        v1.addAsiento(new Asiento(1,2,"ventana"));
        v1.addAsiento(new Asiento(2,1,"pasillo"));
        v1.addAsiento(new Asiento(2,1,"ventana"));
        assertTrue(v1.reservar(2,2));

    }
    @Test
    void casoDeTestReservarCancelado() {
        Vuelo v1 = new Vuelo();
        v1.addAsiento(new Asiento(1,1,"pasillo"));
        v1.addAsiento(new Asiento(2,1,"pasillo"));

        assertTrue(!v1.reservar(2,2));
    }
    @Test
    void casoDeTestAsientosDisponibles() {
        Vuelo v1 = new Vuelo();
        v1.addAsiento(new Asiento(1,1,"pasillo"));
        v1.addAsiento(new Asiento(2,1,"pasillo"));

        assertEquals(v1.getCantidadAsientosDisponibles(),2);
    }
    @Test
    void casoDeTestFilaLlena() {
        Vuelo v1 = new Vuelo();
        v1.addAsiento(new Asiento(1,1,"pasillo"));
        v1.addAsiento(new Asiento(2,1,"ventana"));
        v1.reservar(1,0);
        assertTrue(v1.checkFilaLlena(1));
    }
    @Test
    void casoDeTestAsientosVentanaDisponible() {
        Vuelo v1 = new Vuelo();
        v1.addAsiento(new Asiento(1,1,"ventana"));
        v1.addAsiento(new Asiento(1,2,"pasillo"));
        v1.addAsiento(new Asiento(2,1,"ventana"));
        assertEquals(v1.getCantidadAsientosDisponiblesVentana(),2);
    }


}
