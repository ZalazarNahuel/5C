import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Sistema s1 = new Sistema();
        Laboratorio l1 = new Laboratorio();
        s1.addLab(l1);
        System.out.println("¿Quiere empezar un nuevo experimento?(y/n)");
        String resultado;
        Scanner r1 = new Scanner(System.in);
        resultado = r1.next();
        Experimento e1 = new Experimento(0);
        System.out.println("¿Cuantas observaciones tiene?");
        int resul;
        resul = r1.nextInt();
        ArrayList<Observacion> obs = new ArrayList<Observacion>();
        for(int i=0;i<resul;i++){
            System.out.println("Como es su resultado?(a/l+/l-)");
            String resultado2 = r1.next();
            obs.add(new Observacion());
            if(resultado2.equals("a")){
                obs.get(i).setResultado("ANOMALA");
                e1.addObservacion(obs.get(i));
            }
            else if(resultado2.equals("l+")){
                obs.get(i).setResultado("LEGITIMA QUE CONFIRMA LA HIPOTESIS");
                e1.addObservacion(obs.get(i));
            }
            else if(resultado2.equals("l-")){
                obs.get(i).setResultado("LEGITIMA QUE CONTRADICE LA HIPOTESIS");
                e1.addObservacion(obs.get(i));
            }
        }
        for(int i=0;i<resul;i++){
            System.out.println(e1.observaciones.get(i).getResultado());
        }
        if(resultado.equals("y")){
            if(s1.addExperimento(e1)==true){
                System.out.println("Se econtro un laboratorio para el experimento");
                boolean r;
                int cantCons=0;
                for(int i = 0 ;i < s1.cantLab();i++){
                    r = s1.getLab(i).getExperimento().anomala();
                    if(r){
                        System.out.println("Se encontro que el experimento " + s1.getLab(i).getExperimento()+" es anomala por lo que sera eliminada");
                        s1.getLab(i).removeExperimento();
                    }
                    r = s1.getLab(i).getExperimento().consistente();
                    if(r){
                        cantCons++;
                    }
                }
                System.out.println("Hay " + cantCons + " experimentos consistentes");
            }
            else{
                System.out.println("No se econtro un laboratorio para el experimento");
            }
        }
        else{
            System.out.println("Chau!");
        }

    }
}
