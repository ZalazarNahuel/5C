import microsEnum.Empleado;
import microsEnum.Micro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestsMicroEnum {
    @Test
    void casoDeTestApuradoSube() {
        Micro m = new Micro(0,1,120);
        Empleado p = Empleado.APURADO;
        assertTrue(m.subirPasajero(p));

    }
    @Test
    void casoDeTestApuradoNoSube() {
        Micro m = new Micro(0,0,120);
        Empleado p = Empleado.APURADO;
        assertFalse(m.subirPasajero(p));
    }
    @Test
    void casoDeTestClaustrofobicoSube() {
        Micro m = new Micro(1,1,140);
        Empleado p = Empleado.CLAUSTROFOBICO;
        assertTrue(m.subirPasajero(p));

    }
    @Test
    void casoDeTestClaustrofobicoNoSube() {
        Micro m = new Micro(1,1,100);
        Empleado p = Empleado.CLAUSTROFOBICO;
        assertFalse(m.subirPasajero(p));
    }
    @Test
    void casoDeTestFiacaSube() {
        Micro m = new Micro(1,1,140);
        Empleado p = Empleado.FIACA;
        assertTrue(m.subirPasajero(p));

    }
    @Test
    void casoDeTestFiacaNoSube() {
        Micro m = new Micro(10,0,100);
        Empleado p = Empleado.FIACA;
        assertFalse(m.subirPasajero(p));
    }
    @Test
    void casoDeTestModeradoSube() {
        Micro m = new Micro(1,7,140);
        Empleado p = Empleado.MODERADO;
        assertTrue(m.subirPasajero(p));

    }
    @Test
    void casoDeTestModeradoNoSube() {
        Micro m = new Micro(0,3,100);
        Empleado p = Empleado.MODERADO;
        assertFalse(m.subirPasajero(p));
    }
    @Test
    void casoDeTestObsecuenteSube() {
        Micro m = new Micro(1,5,140);
        Empleado p = Empleado.OBSECUENTE;
        m.subirPasajero(p);
        assertTrue(m.subirPasajero(p));

    }
    @Test
    void casoDeTestObsecuenteNoSube() {
        Micro m = new Micro(5,0,100);
        Empleado p = Empleado.OBSECUENTE;
        m.subirPasajero(p);
        assertFalse(m.subirPasajero(p));
    }
    @Test
    void casoDeTestPrimero() {
        Micro m = new Micro(1,1,100);
        Empleado p = Empleado.APURADO;
        m.subirPasajero(p);
        Empleado p1 = Empleado.APURADO;
        m.subirPasajero(p1);
        assertEquals(m.getPrimero(),p);
    }
    @Test
    void casoDeTestPrimeroVacio() {
        Micro m = new Micro(1,1,100);
        Empleado p = Empleado.APURADO;
        m.subirPasajero(p);
        Empleado p1 = Empleado.APURADO;
        m.subirPasajero(p1);
        m.bajarPasajero(p);
        m.bajarPasajero(p1);
        assertEquals(m.getPrimero(),null);
    }
}
