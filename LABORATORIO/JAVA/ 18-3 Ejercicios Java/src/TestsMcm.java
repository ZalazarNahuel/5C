public class TestsMcm {

    public static void main(String[] args){

        Mcm m1= new Mcm();

        System.out.println("TEST numMayor. Caso con numero 2 y 6");
        m1.setNum1(2);
        m1.setNum2(6);
        int valorEsperado = 6;
        int valorObtenido = m1.numMayor();
        System.out.println((valorEsperado==valorObtenido)?"Paso el test.\n":"No paso el test.\n");

        System.out.println("TEST numMayor. Caso con numero -2 y -5");
        m1.setNum1(-2);
        m1.setNum2(-5);
        valorEsperado = -2;
        valorObtenido = m1.numMayor();
        System.out.println((valorEsperado==valorObtenido)?"Paso el test.\n":"No paso el test.\n");

        System.out.println("TEST numMCM. Caso con numero 3 y 7");
        m1.setNum1(3);
        m1.setNum2(7);
        valorEsperado = 21;
        valorObtenido = m1.numeroMCM();
        System.out.println((valorEsperado==valorObtenido)?"Paso el test.\n":"No paso el test.\n");
    }
}
