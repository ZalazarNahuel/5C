
import micros.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestsMicro {
    @Test
    void casoDeTestApuradoSube() {
        Micro m = new Micro(0,1,120);
        Apurado p = new Apurado("jose");
        assertTrue(m.subirPasajero(p));

    }
    @Test
    void casoDeTestApuradoNoSube() {
        Micro m = new Micro(0,0,120);
        Apurado p = new Apurado("jose");
        assertFalse(m.subirPasajero(p));
    }
    @Test
    void casoDeTestClaustrofobicoSube() {
        Micro m = new Micro(1,1,140);
        Claustrofobico p = new Claustrofobico("jose");
        assertTrue(m.subirPasajero(p));

    }
    @Test
    void casoDeTestClaustrofobicoNoSube() {
        Micro m = new Micro(1,1,100);
        Claustrofobico p = new Claustrofobico("jose");
        assertFalse(m.subirPasajero(p));
    }
    @Test
    void casoDeTestFiacaSube() {
        Micro m = new Micro(1,1,140);
        Fiaca p = new Fiaca("jose");
        assertTrue(m.subirPasajero(p));

    }
    @Test
    void casoDeTestFiacaNoSube() {
        Micro m = new Micro(10,0,100);
        Fiaca p = new Fiaca("jose");
        assertFalse(m.subirPasajero(p));
    }
    @Test
    void casoDeTestModeradoSube() {
        Micro m = new Micro(1,3,140);
        Moderado p = new Moderado("jose",4);
        assertTrue(m.subirPasajero(p));

    }
    @Test
    void casoDeTestModeradoNoSube() {
        Micro m = new Micro(0,3,100);
        Moderado p = new Moderado("jose",4);
        assertFalse(m.subirPasajero(p));
    }
    @Test
    void casoDeTestObsecuenteSube() {
        Micro m = new Micro(1,1,140);
        Jefe j = new Jefe("nahue");
        m.subirPasajero(j);
        Obsecuente p = new Obsecuente("conde",j);
        assertTrue(m.subirPasajero(p));

    }
    @Test
    void casoDeTestObsecuenteNoSube() {
        Micro m = new Micro(1,1,100);
        Jefe j = new Jefe("nahue");
        Obsecuente p = new Obsecuente("conde",j);
        assertFalse(m.subirPasajero(p));
    }
    @Test
    void casoDeTestPrimero() {
        Micro m = new Micro(1,1,100);
        Apurado p = new Apurado("pepe");
        m.subirPasajero(p);
        Apurado p1 = new Apurado("jose");
        m.subirPasajero(p1);
        assertEquals(m.getPrimero(),p);
    }
    @Test
    void casoDeTestPrimeroVacio() {
        Micro m = new Micro(1,1,100);
        Apurado p = new Apurado("pepe");
        m.subirPasajero(p);
        Apurado p1 = new Apurado("jose");
        m.subirPasajero(p1);
        m.bajarPasajero(p);
        m.bajarPasajero(p1);
        assertEquals(m.getPrimero(),null);
    }

}