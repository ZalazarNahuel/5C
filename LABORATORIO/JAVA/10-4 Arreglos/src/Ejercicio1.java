import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {


        System.out.println("Ingrese 10 numeros enteros");
        int[] arregloUsuario = new int[10];
        for(int i=0;i<10;i++){
            Scanner numeros = new Scanner(System.in);
            arregloUsuario[i] = numeros.nextInt();
        }

        int[] arregloFinal = new int [10];
        int k=0;

        for(int i=0;i<10;i++){
            boolean existe=false;
            for(int j=0;j<10;j++){
                if(arregloUsuario[i]==arregloFinal[j]){
                    existe=true;
                }
            }
            if(existe==false){
                arregloFinal[k]=arregloUsuario[i];
                k++;
            }
        }
        System.out.println("Quedaria:");
        for(int i=0;i<k;i++){
            System.out.println(arregloFinal[i]);
        }
    }
}
