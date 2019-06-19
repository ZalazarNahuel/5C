import java.util.Scanner;
public class ej12 {

    public static void main(String[] args){

    /*
        Sabiendo que la definición de factorial de un número N  (que se simboliza N! )
         es igual a:
	                N! = 1 x 2 x 3 x 4 x … x (N -2) x (N -1) x N
         (por ejemplo, el factorial de 5 es 5! = 1 x 2 x 3 x 4 x 5 )
         Realizar un programa que haga dicho cálculo para cualquier valor ingresado.
     */
        System.out.println("Ingrese un numero:");
        Scanner numero = new Scanner(System.in);
        int num = numero.nextInt();

        int factorial = 1;

        for(int i = 1; i<=num; i++){

            factorial = factorial * i;

        }

        System.out.println("El resultado del factorial es: " + factorial);
    }
}
