import java.util.Scanner;
public class ej10 {
    public static void main(String[] args){

        /*
         Realizar un programa para determinar si un número leído por teclado es primo.
        */
        System.out.println("Ingrese un numero:");
        Scanner numero = new Scanner(System.in);
        int num = numero.nextInt();

        int divisores = 0;

        for(int i = 1; i<=num; i++){

            if(num%i == 0){

                divisores++;

            }

        }

        if(divisores == 2){

            System.out.println("El numero " + num + " es primo");

        }

        else{

            System.out.println("El numero " + num + " no es primo");

        }
    }
}
