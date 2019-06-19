import java.util.Scanner;
public class ej9 {
    public static void main(String[] args){


        /*
            Desarrollar un programa que le pida al usuario que ingrese números enteros,
            y los vaya sumando hasta que se ingrese el número -1 (este último no debe ser sumado).
            Por último, debe ser mostrada por pantalla la suma obtenida y la cantidad de números ingresados.

         */
        System.out.println("Ingrese numeros:");
        int numero=0;
        int cant=0;
        int suma=0;

        while(numero!=-1){
            Scanner num =new Scanner(System.in);
            numero= num.nextInt();
            if(numero!=-1){
                cant++;
                suma=suma+numero;
            }
        }

        System.out.println("La suma de los numeros ingresados es: "+ suma + " y la cantidad de numeros ingresados son: " + cant);

    }

}
