import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @Test
    public void EsMayorEdadFalse(){
        Persona p = new Persona("nahuel","zalazar",17,43814039,"masculino","estudiante");
        assertFalse(p.esMayorEdad());
    }
    @Test
    public void EsMayorEdadTrue(){
        Persona p = new Persona("nahuel","zalazar",18,43814039,"masculino","estudiante");
        assertTrue(p.esMayorEdad());
    }
    @Test
    public void nombreContieneAMinisculaTrue(){
        Persona p = new Persona("nahuel","zalazar",18,43814039,"masculino","estudiante");
        assertTrue(p.nombreContieneA());
    }
    @Test
    public void nombreContieneAMayusculaTrue(){
        Persona p = new Persona("Abel","zalazar",18,43814039,"masculino","estudiante");
        assertTrue(p.nombreContieneA());
    }
    @Test
    public void nombreContieneAFalse(){
        Persona p = new Persona("federico","zalazar",18,43814039,"masculino","estudiante");
            assertFalse(p.nombreContieneA());
    }
    @Test
    public void dniMayor38MillonesTrue(){
        Persona p = new Persona("federico","zalazar",18,43814039,"masculino","estudiante");
        assertTrue(p.dniMayor38Millones());
    }
    @Test
    public void dniMayor38MillonesFalse(){
        Persona p = new Persona("federico","zalazar",18,30000000,"masculino","estudiante");
        assertFalse(p.dniMayor38Millones());
    }
}