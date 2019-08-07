import java.util.Scanner;
public class ej2 {
    public static void main(String[] args) {

         /*
          1) Escriba un programa que calcule e imprima el producto de tres
             números enteros. (Ej. num1 * num2 * num3)
         */
        System.out.println("hola! Ingrese tres numeros enteros");
        Scanner numero1  = new Scanner(System.in);
        int num1 = numero1.nextInt();
        Scanner numero2 = new Scanner(System.in);
        int num2 = numero2.nextInt();
        Scanner numero3 = new Scanner(System.in);
        int num3 = numero3.nextInt();
        int producto=num1*num2*num3;
        System.out.println("El producto entre los tres es " + producto);


    }
}
