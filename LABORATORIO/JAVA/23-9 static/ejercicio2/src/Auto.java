public class Auto {
    static int numeroSerie = 0;
    public Auto(){
        numeroSerie=numeroSerie+1;
    }

    public static void aviso(){
        if (numeroSerie>=2000) System.out.println("se vendieron dos mil autos");
    }
}
