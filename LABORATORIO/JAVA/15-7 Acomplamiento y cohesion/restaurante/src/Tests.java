import java.sql.SQLSyntaxErrorException;

public class Tests {
    public static void main(String[] args){



        Restaurant r1 = new Restaurant("La Chancha y los Veinte","Milena");

        Mesa m1 = new Mesa();
        m1.setNumDeMesa(1);
        Mesa m2 = new Mesa();
        m2.setNumDeMesa(2);
        Mesa m3 = new Mesa();
        m3.setNumDeMesa(3);
        Mesa m4 = new Mesa();
        m4.setNumDeMesa(4);
        Mesa m5 = new Mesa();
        m5.setNumDeMesa(5);

        r1.agregarMesa(m1);
        r1.agregarMesa(m2);
        r1.agregarMesa(m3);
        r1.agregarMesa(m4);
        r1.agregarMesa(m5);

        Plato p1 = new Plato();
        p1.setNombre("Arroz con Pollo");
        p1.setCantidad(2);
        p1.setNumDeMesa(3);
        p1.setNumPedido(1);
        r1.agregarPlatoAPreparar(p1);
        r1.getMesa(2).agregarPedidoDeClienteActual(p1);

        Plato p2 = new Plato();
        p2.setNombre("Arroz con Pollo");
        p2.setCantidad(3);
        p2.setNumDeMesa(1);
        p2.setNumPedido(2);
        r1.agregarPlatoAPreparar(p2);
        r1.getMesa(0).agregarPedidoDeClienteActual(p2);

        Plato p3 = new Plato();
        p3.setNombre("Milanesa Napolitana");
        p3.setCantidad(2);
        p3.setNumDeMesa(2);
        p3.setNumPedido(3);
        r1.agregarPlatoAPreparar(p3);
        r1.getMesa(1).agregarPedidoDeClienteActual(p3);

        Plato p4 = new Plato();
        p4.setNombre("Pizza de Chocolate con piña");
        p4.setCantidad(2);
        p4.setNumDeMesa(5);
        p4.setNumPedido(4);
        r1.agregarPlatoAPreparar(p4);
        r1.getMesa(4).agregarPedidoDeClienteActual(p4);

        Plato p5 = new Plato();
        p5.setNombre("Paella");
        p5.setCantidad(1);
        p5.setNumDeMesa(4);
        p5.setNumPedido(5);
        r1.agregarPlatoAPreparar(p5);
        r1.getMesa(3).agregarPedidoDeClienteActual(p5);

        System.out.print("TEST getPlatoMenosPedido. Caso con Paella menos pedido. ");
        String ValorEsperado = "Paella";
        String ValorObtenido = r1.getPlatoMenosPedido();
        System.out.println((ValorEsperado==ValorObtenido)?"Pasó el test.":"No pasó el test.");

        System.out.print("TEST getPlatoMasPedido. Caso con Arroz con Pollo mas pedido. ");
        ValorEsperado = "Arroz con Pollo";
        ValorObtenido = r1.getPlatoMasPedido();
        System.out.println((ValorEsperado==ValorObtenido)?"Pasó el test.":"No pasó el test.");

        System.out.print("TEST clienteDesocupaMesa. Caso con cliente que desocupa la mesa 2. ");
        boolean ValorEsp = true;
        m2.clienteDesocupaMesa();
        boolean ValorObt = m2.getPlatosPedidos().isEmpty();
        System.out.println((ValorEsp==ValorObt)?"Pasó el test.":"No pasó el test.");
    }
}
