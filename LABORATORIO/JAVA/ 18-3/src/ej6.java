import java.util.Scanner;
public class ej6 {
    public static void main(String[] args) {

        /*
            Pasar un período expresado en segundosa a un período expresado
            en días, horas, minutos y segundos.
         */
        System.out.println("Ingresar los segundos");
        Scanner segundos= new Scanner(System.in);
        int seg=segundos.nextInt();

        //min
        int min=0;
        for(int i=seg;i>59;i=i-60){
            min++;
        }

        int hora=0;
        for(int i=min;i>59;i=i-60){
            hora++;
        }

        int dia=0;
        for(int i=hora;i>23;i=i-24){
            dia++;
        }

        System.out.println(seg + " serian:");
        System.out.println("minutos: " + min);
        System.out.println("horas: " + hora);
        System.out.println("dias: " + dia);
    }
}
