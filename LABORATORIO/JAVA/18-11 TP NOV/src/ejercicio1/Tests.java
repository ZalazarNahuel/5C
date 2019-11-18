package ejercicio1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    @Test
    //Pruebo con un perro,pero ocurre lo mismo con un gato y pajarito
    void alimentarAnimalSaluda(){
        Sistema ABM = new Sistema();
        Perro perro = new Perro("polo","nahue");
        ABM.altaMascota(perro);
        ABM.alimentar(perro);

        assertEquals(2,perro.getAlegria());
    }
    @Test
    void alimentarPez(){
        Sistema ABM = new Sistema();
        Pez pez = new Pez("polo","nahue");
        ABM.altaMascota(pez);
        ABM.alimentar(pez);

        assertEquals(11,pez.getVida());
    }
    @Test
    void saludarPezDueno(){
        Sistema ABM = new Sistema();
        Pez pez = new Pez("polo","nahue");
        ABM.altaMascota(pez);
        ABM.saludar(pez,"nahue");

        assertEquals(9,pez.getVida());
    }
    @Test
    void saludarPezNoDueno(){
        Sistema ABM = new Sistema();
        Pez pez = new Pez("polo","nahue");
        ABM.altaMascota(pez);
        ABM.saludar(pez,"carbo");

        assertFalse(pez.getVivo());
    }
    //no pruebo saludar a los demas mascotas porque no devuelven nada, solo muestran algo en la pantalla
    @Test
    void esElDueno(){
        Sistema ABM = new Sistema();
        Gato gato = new Gato("lemi","nahue");
        ABM.altaMascota(gato);

        assertTrue(ABM.esElDueno("nahue","lemi"));
    }
    @Test
    void NoesElDueno(){
        Sistema ABM = new Sistema();
        Gato gato = new Gato("lemi","nahue");
        ABM.altaMascota(gato);

        assertFalse(ABM.esElDueno("carbo","lemi"));
    }
    @Test
    void modificarDueno(){
        Sistema ABM = new Sistema();
        Gato gato = new Gato("lemi","nahue");
        ABM.altaMascota(gato);
        ABM.modificarDuenoMascota(gato,"carbo");

        assertTrue(ABM.esElDueno("carbo","lemi"));
    }
    @Test
    void modificarNombre(){
        Sistema ABM = new Sistema();
        Gato gato = new Gato("lemi","nahue");
        ABM.modificarNombreMascota(gato,"nacho");

        assertEquals("nacho",gato.getNombre());
    }
}
