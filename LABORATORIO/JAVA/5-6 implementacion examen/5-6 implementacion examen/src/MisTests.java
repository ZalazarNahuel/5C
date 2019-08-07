import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MisTests {

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
