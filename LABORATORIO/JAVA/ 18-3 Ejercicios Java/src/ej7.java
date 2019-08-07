import java.util.Scanner;
public class ej7 {
    public static void main(String[] args) {

        /*
            Desarrolle un algoritmo que permita encontrar el mínimo común múltiplo
            entre dos números enteros ingresados por pantalla.
        */

        System.out.println("Ingrese 2 numeros");
        Scanner numero1 = new Scanner (System.in);
        int num1 = numero1.nextInt();

        Scanner numero2 = new Scanner (System.in);
        int num2 = numero2.nextInt();

        int numero=0;
        if(num1>num2){
            numero=num1;
        }
        else{
            numero=num2;
        }

        boolean encontrar=true;
        int numeroX=1;
        int multiplo=0;
        while(encontrar){
            multiplo=numero*numeroX;
            if(multiplo%num1==0 && multiplo%num2==0){
                encontrar=false;
            }
            else{
                numeroX++;
            }
        }


        System.out.println("El minimo comun multiplo es: " + multiplo);
    }
}
