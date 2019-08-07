import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Sistema s1 = new Sistema();
        s1.addLab(new Laboratorio());
       
        String resultado = "";
        Scanner r1 = new Scanner(System.in);


        System.out.println("¿Quiere empezar un nuevo experimento?(y/n)");
        while(resultado.equalsIgnoreCase("y")==false && resultado.equalsIgnoreCase("n")==false) resultado = r1.next();

        
        if(resultado.equalsIgnoreCase("y")){
            Experimento e1 = new Experimento();
            if(s1.addExperimento(e1)==true){
                System.out.println("Se econtro un laboratorio para el experimento");
                System.out.println("¿Cuantas observaciones tiene?");
                int resul;
                resul = r1.nextInt();
                ArrayList<Observacion> obs = new ArrayList<Observacion>();
                for(int i=0;i<resul;i++){
                    System.out.println("Como es su resultado?(a/l+/l-)");
                        resultado = r1.next();
                    obs.add(new Observacion());
                    if(resultado.equals("a")){
                        obs.get(i).setResultado("ANOMALA");
                        e1.addObservacion(obs.get(i));
                    }
                    else if(resultado.equals("l+")){
                        obs.get(i).setResultado("LEGITIMA QUE CONFIRMA LA HIPOTESIS");
                        e1.addObservacion(obs.get(i));
                    }
                    else if(resultado.equals("l-")){
                        obs.get(i).setResultado("LEGITIMA QUE CONTRADICE LA HIPOTESIS");
                        e1.addObservacion(obs.get(i));
                    }
                }
                s1.buscarAnomalias();
                s1.cantExperimentosConsistentes();
                s1.cantExperimentosAvanzadosConsistentes();
                
            }
            else{
                System.out.println("Disculpe las molestias no contamos con un laboratorio disponible");
            }             
        }
        else{
            System.out.println("Chau!");
        }

    }
}
