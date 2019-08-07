public class TestsCine {

    public static void main(String[] args){

        Cine c1= new Cine();
        Cine c2= new Cine();

        System.out.println("TEST sonIguales. Caso con cines diferentes");
        c1.setCantPelicula(5);
        c1.setCantSala(2);
        c1.setEntrada(200);
        c1.setZona("Dvto");
        c2.setCantPelicula(5);
        c2.setCantSala(3);
        c2.setEntrada(250);
        c2.setZona("Uqz");
        boolean valorEsperado = false;
        boolean valorObtenido = c1.sonIguales(c2);
        System.out.println((valorEsperado==valorObtenido)?"Paso el test.\n":"No paso el test.\n");

        System.out.println("TEST sonIguales. Caso con cines iguales");
        c1.setCantPelicula(5);
        c1.setCantSala(2);
        c1.setEntrada(200);
        c1.setZona("Dvto");
        c2.setCantPelicula(5);
        c2.setCantSala(2);
        c2.setEntrada(200);
        c2.setZona("Dvto");
         valorEsperado = true;
         valorObtenido = c1.sonIguales(c2);
        System.out.println((valorEsperado==valorObtenido)?"Paso el test.\n":"No paso el test.\n");

        System.out.println("TEST entradaMayorA125. Caso con entrada a 125");
        c1.setCantPelicula(5);
        c1.setCantSala(2);
        c1.setEntrada(125);
        c1.setZona("Dvto");
         valorEsperado = true;
         valorObtenido = c1.entradaMayorA125();
        System.out.println((valorEsperado==valorObtenido)?"Paso el test.\n":"No paso el test.\n");

        System.out.println("TEST salasIgualPlicula. Caso con cantidad de salas iguales a peliculas");
        c1.setCantPelicula(5);
        c1.setCantSala(5);
        c1.setEntrada(200);
        c1.setZona("Dvto");
         valorEsperado = true;
         valorObtenido = c1.salasIgualPeliculas();
        System.out.println((valorEsperado==valorObtenido)?"Paso el test.\n":"No paso el test.\n");

        System.out.println("TEST salasIgualPlicula. Caso con cantidad de salas distintas a peliculas");
        c1.setCantPelicula(10);
        c1.setCantSala(5);
        c1.setEntrada(200);
        c1.setZona("Dvto");
         valorEsperado = false;
         valorObtenido = c1.salasIgualPeliculas();
        System.out.println((valorEsperado==valorObtenido)?"Paso el test.\n":"No paso el test.\n");

        System.out.println("TEST mismaZona. Caso con zonas iguales");
        c1.setCantPelicula(10);
        c1.setCantSala(5);
        c1.setEntrada(230);
        c1.setZona("Dvto");
        c2.setCantPelicula(5);
        c2.setCantSala(2);
        c2.setEntrada(200);
        c2.setZona("Dvto");
         valorEsperado = true;
         valorObtenido = c1.mismaZona(c2);
        System.out.println((valorEsperado==valorObtenido)?"Paso el test.\n":"No paso el test.\n");

        System.out.println("TEST mismaZona. Caso con zonas iguales");
        c1.setCantPelicula(10);
        c1.setCantSala(5);
        c1.setEntrada(230);
        c1.setZona("Dvto");
        c2.setCantPelicula(5);
        c2.setCantSala(2);
        c2.setEntrada(200);
        c2.setZona("Uqz");
         valorEsperado = false;
         valorObtenido = c1.mismaZona(c2);
        System.out.println((valorEsperado==valorObtenido)?"Paso el test.\n":"No paso el test.\n");
    }
}
