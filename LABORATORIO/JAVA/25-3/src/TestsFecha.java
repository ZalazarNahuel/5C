public class TestsFecha {

    public static void main(String[] args){

        Fecha f1 = new Fecha();
        Fecha f2 = new Fecha();


        System.out.println("TEST diferenciaDeDia. Caso con 3 dias de diferencia");
        f1.setDia(20);
        f1.setAno(2019);
        f1.setMes(2);
        f2.setDia(23);
        f2.setAno(2019);
        f2.setMes(2);
        int valorEsperado = 3;
        int valorObtenido = f1.diferenciaDeDias(f2);
        System.out.println((valorEsperado==valorObtenido)?"Paso el test.\n":"No paso el test.\n");

        System.out.println("TEST sonDistintos. Caso con dos fechas distintas");
        f1.setDia(20);
        f1.setAno(2019);
        f1.setMes(2);
        f2.setDia(23);
        f2.setAno(2012);
        f2.setMes(5);
        boolean valEsperado = true;
        boolean valObtenido = f1.sonDistintos(f2);
        System.out.println((valEsperado==valObtenido)?"Paso el test.\n":"No paso el test.\n");

        System.out.println("TEST sonDistintos. Caso con dos fechas iguales");
        f1.setDia(20);
        f1.setAno(2019);
        f1.setMes(2);
        f2.setDia(20);
        f2.setAno(2019);
        f2.setMes(2);
         valEsperado = false;
         valObtenido = f1.sonDistintos(f2);
        System.out.println((valEsperado==valObtenido)?"Paso el test.\n":"No paso el test.\n");

        System.out.println("TEST anteriorALaOtra. Caso con una fecha anterior a la otra");
        f1.setDia(20);
        f1.setAno(2019);
        f1.setMes(2);
        f2.setDia(20);
        f2.setAno(2019);
        f2.setMes(6);
        valEsperado = true;
        valObtenido = f1.anteriorALaOtra(f2);
        System.out.println((valEsperado==valObtenido)?"Paso el test.\n":"No paso el test.\n");

        System.out.println("TEST anteriorALaOtra. Caso con una fecha anterior a la otra");
        f1.setDia(26);
        f1.setAno(2019);
        f1.setMes(2);
        f2.setDia(20);
        f2.setAno(2019);
        f2.setMes(2);
        valEsperado = false;
        valObtenido = f1.anteriorALaOtra(f2);
        System.out.println((valEsperado==valObtenido)?"Paso el test.\n":"No paso el test.\n");
    }
}
