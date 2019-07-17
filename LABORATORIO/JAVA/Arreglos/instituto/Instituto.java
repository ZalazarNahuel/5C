import java.util.HashMap;
import java.util.Map;

public class Instituto{
    private HashMap<Profesor,Integer> profesores ;

    public Instituto(){
        profesores =  new HashMap<Profesor,Integer>();
    }
    public HashMap<Profesor,Integer> getProfesores(){
        return this.profesores;
    }

    public void materiaProfe(){
        for(Map.Entry<Profesor,Integer> profesor : this.getProfesores().entrySet()){
            System.out.println("Profesor "+ profesor.getKey().getNombre());
            System.out.println("Cantidad de Materias "+ profesor.getValue());
        }
    }

    public void addProfe(Profesor profesor, Integer cantMaterias){
        profesores.put(profesor, cantMaterias);
    }
}