import java.util.Scanner;
public class ej8 {
    public static void main(String[] args){

        /*
            Escriba un programa que imprima los primeros n números pares.
            El valor n se ingresa por teclado.
            Luego modifíquelo para que, además de  imprimirlos calcule su suma.

         */
        System.out.println("Ingrese un numero:");
        Scanner numero = new Scanner(System.in);
        int num = numero.nextInt();

        int suma = 0;

        for(int i = 1; i <= num*2; i++){

            if(i%2 == 0){

                System.out.println(i);

                suma = suma + i;

            }

        }

        System.out.println("La suma es: " + suma);
    }
}
