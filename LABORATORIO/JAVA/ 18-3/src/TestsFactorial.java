public class TestsFactorial {

    public static void main(String[] args){

        Factorial f1 = new Factorial();

        System.out.println("TEST resultadoFactorial. Caso con 5");
        f1.setNumero(5);
        int valorEsperado = 120;
        int valorObtenido = f1.resultadoFactorial();
        System.out.println((valorEsperado==valorObtenido)?"Paso el test.\n":"No paso el test.\n");

        System.out.println("TEST resultadoFactorial. Caso con numero 0");
        f1.setNumero(0);
        valorEsperado = 1;
        valorObtenido = f1.resultadoFactorial();
        System.out.println((valorEsperado==valorObtenido)?"Paso el test.\n":"No paso el test.\n");

        System.out.println("TEST resultadoFactorial. Caso con numero -5");
        f1.setNumero(-5);
        valorEsperado = 120;
        valorObtenido = f1.resultadoFactorial();
        System.out.println((valorEsperado==valorObtenido)?"Paso el test.\n":"No paso el test.\n");
    }
}