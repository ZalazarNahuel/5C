import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MisTests {

    @Test
    void addTarjetaTrue(){
        Pasajero pedro = new Pasajero(1);
        Tarjeta sube = new Tarjeta(200);
        pedro.addTarjeta(sube);
        assertEquals(sube,pedro.getSUBE());
    }
    @Test
    void addTarjetaFalse(){
        Pasajero pedro = new Pasajero(1);
        assertEquals(null,pedro.getSUBE());
    }
    @Test
    void abonarTrue(){
        Pasajero pedro = new Pasajero(1);
        Tarjeta sube = new Tarjeta(200);
        pedro.addTarjeta(sube);
        pedro.abonar();
        assertTrue(pedro.getSUBE().getAbonado());
    }
    @Test
    void abonarFalse(){
        Pasajero pedro = new Pasajero(1);
        Tarjeta sube = new Tarjeta(200);
        pedro.addTarjeta(sube);
        assertFalse(pedro.getSUBE().getAbonado());
    }
    @Test
    void agregarPasajero(){
        Colectivo bondi = new Colectivo();
        Pasajero pedro = new Pasajero(1);
        Pasajero santi = new Pasajero(2);
        bondi.addPasajero(pedro);
        bondi.addPasajero(santi);
        assertEquals(2,bondi.getPasajerosActual().size());
    }
    @Test
    void bajarPasajero(){
        Colectivo bondi = new Colectivo();
        Pasajero pedro = new Pasajero(1);
        bondi.addPasajero(pedro);
        bondi.bajarColectivo(pedro);
        assertTrue(bondi.getPasajerosActual().isEmpty());
    }
    @Test
    void ifAbonadoTrue(){
        Colectivo bondi = new Colectivo();
        Tarjeta t1 = new Tarjeta(600);
        Pasajero pedro = new Pasajero(1);
        pedro.addTarjeta(t1);
        pedro.abonar();
        bondi.addPasajero(pedro);
        assertTrue(bondi.ifAbonado(0));
    }
    @Test
    void ifAbonadoFalse(){
        Colectivo bondi = new Colectivo();
        Tarjeta t1 = new Tarjeta(600);
        Pasajero pedro = new Pasajero(1);
        pedro.addTarjeta(t1);
        bondi.addPasajero(pedro);
        assertFalse(bondi.ifAbonado(0));
    }
    @Test
    void ifMenorMetrosPagadosFalse(){
        Colectivo bondi = new Colectivo();
        Tarjeta t1 = new Tarjeta(600);
        t1.setMetrosRecorridos(700);
        Pasajero pedro = new Pasajero(1);
        pedro.addTarjeta(t1);
        pedro.abonar();
        bondi.addPasajero(pedro);
        assertFalse(bondi.ifMenorMetrosPagados(0));
    }
    @Test
    void ifMenorMetrosPagadosTrue(){
        Colectivo bondi = new Colectivo();
        Tarjeta t1 = new Tarjeta(600);
        t1.setMetrosRecorridos(300);
        Pasajero pedro = new Pasajero(1);
        pedro.addTarjeta(t1);
        pedro.abonar();
        bondi.addPasajero(pedro);
        assertTrue(bondi.ifMenorMetrosPagados(0));
    }
    @Test
    void ifDescuentoAplicadoTrue(){
        Colectivo bondi = new Colectivo();
        Pasajero pedro = new Pasajero(1);
        Tarjeta tarPedro = new Tarjeta(600);
        tarPedro.setMetrosRecorridos(400);
        pedro.addTarjeta(tarPedro);
        bondi.addPasajero(pedro);
        bondi.setCantidadViajes(0,26);
        bondi.bajarColectivo(pedro);
        bondi.addPasajero(pedro);
        pedro.abonar();
        assertTrue(bondi.ifDescuentoAplicado(0));
    }
    @Test
    void ifDescuentoAplicadoFalse(){
        Colectivo bondi = new Colectivo();
        Pasajero pedro = new Pasajero(1);
        Tarjeta tarPedro = new Tarjeta(600);
        tarPedro.setMetrosRecorridos(400);
        pedro.addTarjeta(tarPedro);
        bondi.addPasajero(pedro);
        pedro.abonar();
        assertFalse(bondi.ifDescuentoAplicado(0));
    }
    @Test
    void checkOrdenTrue(){
        Colectivo bondi = new Colectivo();
        Pasajero pedro = new Pasajero(1);
        Tarjeta tarPedro = new Tarjeta(600);
        tarPedro.setMetrosRecorridos(400);
        pedro.addTarjeta(tarPedro);
        bondi.addPasajero(pedro);
        bondi.setCantidadViajes(0,26);
        bondi.bajarColectivo(pedro);
        bondi.addPasajero(pedro);
        pedro.abonar();

        assertTrue( bondi.checkOrden(0));
    }
    @Test
    void checkOrdenFalse(){
        Colectivo bondi = new Colectivo();
        Pasajero pedro = new Pasajero(1);
        Tarjeta tarPedro = new Tarjeta(600);
        tarPedro.setMetrosRecorridos(1400);
        pedro.addTarjeta(tarPedro);
        bondi.addPasajero(pedro);

        assertFalse( bondi.checkOrden(0));
    }

    @Test
    void ColectivoEnOrden(){
        Colectivo bondi = new Colectivo();
        Pasajero pedro = new Pasajero(1);
        Tarjeta tarPedro = new Tarjeta(600);
        tarPedro.setMetrosRecorridos(400);
        pedro.addTarjeta(tarPedro);
        Pasajero jose = new Pasajero(2);
        Tarjeta tarJose = new Tarjeta(1000);
        tarJose.setMetrosRecorridos(700);
        jose.addTarjeta(tarJose);
        // le agrego mas viajes a pedro para que sea recurrente
        bondi.addPasajero(pedro);
        bondi.setCantidadViajes(0,26);
        bondi.bajarColectivo(pedro);
        //ahora agrego los dos pasajeros pedro que es recurrente y jose que no y hago que abonen
        bondi.addPasajero(pedro);
        pedro.abonar();
        bondi.addPasajero(jose);
        jose.abonar();

        assertTrue( bondi.ordenTotal());
    }
    @Test
    void ColectivoPasajeroNoAbonado(){
        Colectivo bondi = new Colectivo();
        Pasajero pedro = new Pasajero(1);
        Tarjeta tarPedro = new Tarjeta(600);
        tarPedro.setMetrosRecorridos(400);
        pedro.addTarjeta(tarPedro);
        Pasajero jose = new Pasajero(2);
        Tarjeta tarJose = new Tarjeta(1000);
        tarJose.setMetrosRecorridos(700);
        jose.addTarjeta(tarJose);
        //ahora agrego los dos pasajeros y solo pedro abona
        bondi.addPasajero(pedro);
        pedro.abonar();
        bondi.addPasajero(jose);

        assertFalse( bondi.ordenTotal());
    }
    @Test
    void ColectivoPasajeroPasoMetrosPagados(){
        Colectivo bondi = new Colectivo();
        Pasajero pedro = new Pasajero(1);
        Tarjeta tarPedro = new Tarjeta(600);
        tarPedro.setMetrosRecorridos(400);
        pedro.addTarjeta(tarPedro);
        Pasajero jose = new Pasajero(2);
        Tarjeta tarJose = new Tarjeta(1000);
        // hago que jose se pase de metros
        tarJose.setMetrosRecorridos(1200);
        jose.addTarjeta(tarJose);
        bondi.addPasajero(pedro);
        pedro.abonar();
        bondi.addPasajero(jose);
        jose.abonar();

        assertFalse( bondi.ordenTotal());
    }
    @Test
    void ColectivoDescuentoNoAplicado(){
        Colectivo bondi = new Colectivo();
        Pasajero pedro = new Pasajero(1);
        Tarjeta tarPedro = new Tarjeta(600);
        tarPedro.setMetrosRecorridos(400);
        pedro.addTarjeta(tarPedro);
        Pasajero jose = new Pasajero(2);
        Tarjeta tarJose = new Tarjeta(1000);
        tarJose.setMetrosRecorridos(700);
        jose.addTarjeta(tarJose);
        // le agrego mas viajes a pedro para que sea recurrente
        bondi.addPasajero(pedro);
        bondi.setCantidadViajes(0,26);
        bondi.bajarColectivo(pedro);
        //ahora agrego los dos pasajeros pedro que es recurrente y jose que no
        bondi.addPasajero(pedro);
        pedro.abonar();
        // a pedro le cambio el precio abonado al original (sin descuento)
        tarPedro.setPrecio(300);
        bondi.addPasajero(jose);
        jose.abonar();

        assertFalse(bondi.ordenTotal());
    }
}
