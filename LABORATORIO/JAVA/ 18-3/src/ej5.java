import java.util.Scanner;
public class ej5 {
    public static void main(String[] args) {

        /*
            Escriba un programa que reciba un año y un mes e informe por consola
            la cantidad de de días que tiene ese mes de ese año. Considerar años bisiestos.
         */
        System.out.println("Ingrese un año y un mes");

        System.out.println("El ano:");
        Scanner el_ano = new Scanner (System.in);
        int ano = el_ano.nextInt();

        System.out.println("El mes:");
        Scanner el_mes = new Scanner (System.in);
        int mes = el_mes.nextInt();

        boolean bisiesto = false;

        if(ano%4 == 0){

            bisiesto = true;

        }

        if(bisiesto == false){

            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 ){

                System.out.println("El mes tiene 31 dias");

            }

            else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){

                System.out.println("El mes tiene 30 dias");

            }

            else if(mes == 2){

                System.out.println("El mes tiene 28 dias");

            }

        }

        else{

            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 ){

                System.out.println("El mes tiene 31 dias");

            }

            else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){

                System.out.println("El mes tiene 30 dias");

            }

            else if(mes == 2){

                System.out.println("El mes tiene 29 dias");

            }


        }

    }
}
