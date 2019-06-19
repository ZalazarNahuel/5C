import java.util.Scanner;
public class ej3 {
    public static void main(String[] args) {

        /*
                Escriba un programa que pida al usuario que escriba dos números,
                que obtenga los números del usuario y muestre el número más grande,
                seguido de las palabras “el número es más grande”.
                Si los números son iguales, imprima el mensaje “Estos números son iguales”.
         */
        System.out.println("Ingrese 2 numeros");

        System.out.println("El primero");
        Scanner numero1 = new Scanner(System.in);
        int num1 = numero1.nextInt();

        System.out.println("El segundo");
        Scanner numero2 = new Scanner(System.in);

        int num2 = numero2.nextInt();

        if(num1 < num2){

            System.out.println("El numero " + num2 + " es mas grande");

        }

        else if(num1 > num2){

            System.out.println("El numero " + num1 + " es mas grande");

        }

        else if(num1 == num2){

            System.out.println("Los numeros son iguales");

        }
    }
}
