import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @Test
    public void getCantidadLibros4(){
        Libreria l = new Libreria();
        l.addLibro(Editorial.KAPELUSZ,2);
        l.addLibro(Editorial.KAPELUSZ,2);
        l.addLibro(Editorial.SUDAMERICANA,3);

        assertEquals(4,l.getCantidadLibrosEditorial(Editorial.KAPELUSZ));

    }
    @Test
    public void getCantidadLibros0(){
        Libreria l = new Libreria();
        l.addLibro(Editorial.ALIANZA,5);

        assertEquals(0,l.getCantidadLibrosEditorial(Editorial.KAPELUSZ));

    }
    @Test
    public void getEditorialMayorVentasSur(){
        Libreria l = new Libreria();
        l.addLibro(Editorial.KAPELUSZ,3);
        l.addLibro(Editorial.SUR,7);

        assertEquals(Editorial.SUR,l.getEditorialMayorVentas());

    }
    @Test
    public void getEditorialMayorVentasNull(){
        Libreria l = new Libreria();

        assertEquals(null,l.getEditorialMayorVentas());

    }

}
