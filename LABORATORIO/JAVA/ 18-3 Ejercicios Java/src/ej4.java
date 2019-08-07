import java.util.Scanner;
public class ej4 {
    public static void main(String[] args) {

        /*
            Escriba un algoritmo para determinar si un número N es divisible por M.
         */
        System.out.println("Ingrese un numero");
        Scanner numero1= new Scanner(System.in);
        int n = numero1.nextInt();

        System.out.println("Ingrese otro numero");
        Scanner numero2= new Scanner(System.in);
        int m = numero2.nextInt();

        if(n%m==0){
            System.out.println(n + " es divisible por " + m);
        }
        else{
            System.out.println(n + " no es divisible por " + m);
        }
    }
}
