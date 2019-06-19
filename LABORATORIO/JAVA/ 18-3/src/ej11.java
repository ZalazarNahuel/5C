import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class ej11 {

    public static void main(String[] args){

        /*
        Realizar un programa para hallar el mínimo común múltiplo
        (abreviado como mcm)  entre dos números naturales ingresados por teclado.
         */
        System.out.println("Ingrese 2 numeros");
        Scanner numero1 = new Scanner (System.in);
        float num1 = numero1.nextFloat();

        System.out.println("segundo");
        Scanner numero2 = new Scanner (System.in);
        float num2 = numero2.nextFloat();

        float numero=0;
        if(num1>num2){
            numero=num1;
        }
        else{
            numero=num2;
        }

        boolean encontrar=true;

        float x=1;
        float multiplo=0;
        System.out.println("1");
         while(encontrar){
            multiplo=numero*x;
            if(multiplo%num1==0 && multiplo%num2==0){
                encontrar=false;
            }
            else{
                x++;
            }

        }

        System.out.println("El minimo comun multiplo es: " + multiplo);

    }
}
