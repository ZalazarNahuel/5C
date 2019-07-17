import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void tirar(Juego j, Scanner escaner){
        System.out.println("Apreta cualquier letra para tirar los dados");
        String letra = escaner.nextLine();
        j.tirar5dados();
        System.out.println("Los dados quedaron:");
        j.mostrarDados();
    }
    public static boolean elegir(ArrayList<Integer> idDados,Scanner escaner){
        boolean eligiendo = true;
        boolean tirar = false;
        while (eligiendo){
            System.out.println("Que dados desea tirar de nuevo?(Ingresar uno por uno) dados=0-4 ; todos=5 ; terminar=6");
            int num = escaner.nextInt();
            while (num<0 || num>6){
                System.out.println("Ingrese un numero valido. dados=0-4 ; todos=5 ; terminar=6");
                num = escaner.nextInt();
            }
            if(num == 6)  break;
            if(num>-1 || num<5){
                idDados.add(num);
                eligiendo = true;
                tirar = true;
            }
            if(num == 5){
                juego.tirar5dados();
                break;
            }
        }
    }

    public static void main(String[] args){

        Juego juego = new Juego();

        Scanner escaner = new Scanner(System.in);

        String letra;
        int num;

        System.out.println("Hola! bienvenidos a la generala, por problemas financieros el juego solo se puede jugar de a dos.");
        System.out.println("Aprete cualquier letra para comenzar..");
        letra = escaner.nextLine();

        System.out.println("Ingrese el nombre del primer jugador");
        juego.addJugador(new Jugador(escaner.nextLine()));
        System.out.println("Ingrese el nombre del segundo jugador");
        juego.addJugador(new Jugador(escaner.nextLine()));
        for(int i = 1; i<11; i++){
            System.out.println("Ronda "+i+":");
            for(int j = 0;j<2;j++){
                boolean turno = true;
                System.out.println("Es el turno de: " + juego.getNombreJugador(j));
                int s = 1;
                while(turno){
                    System.out.println(s + " intento");
                    tirar(juego,escaner);
                    System.out.println("Desea tirar de nuevo? y=si,n=no");
                    letra = escaner.nextLine();
                    if(letra.equalsIgnoreCase("y")){
                        elegir(idDados, escaner);
                    }
                }
                    ArrayList<Integer> idDados = new ArrayList<Integer>();
            }
        }


    }
}
