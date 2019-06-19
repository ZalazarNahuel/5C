import java.util.ArrayList;

public class Experimento {

    ArrayList<Observacion> observaciones = new ArrayList<Observacion>();
    /*boolean avanzado;
    boolean consistente;*/
    private int id = 0;

    public Experimento(int i){
        id = i;
    }
    public Experimento(){

    }

    public void addObservacion(Observacion o1){
        this.observaciones.add(o1);
    }

    public Observacion getObservacion(int i) {
        return observaciones.get(i);
    }

    public boolean anomala(){
        int cantA=0;
        int cantL=0;
        for(int i = 0;i < observaciones.size();i++){
            if(observaciones.get(i).getResultado()=="ANOMALA"){
                cantA++;
            }
            else{
                cantL++;
            }
        }
        if(cantA>cantL){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean avanzado(){
        int cant=0;
        for(int i = 0;i < observaciones.size();i++){
            if(observaciones.get(i).getResultado()=="LEGITIMA QUE CONFIRMA LA HIPOTESIS" || observaciones.get(i).getResultado()=="LEGITIMA QUE CONTRADICE LA HIPOTESIS"){
                cant++;
            }
        }
        if(cant>30){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean consistente(){
        int cant=0;
        int cantl=0;
        for(int i = 0;i < observaciones.size();i++){
            if(observaciones.get(i).getResultado()=="LEGITIMA QUE CONFIRMA LA HIPOTESIS"){
                cant++;
                cantl++;

            }
            else if(observaciones.get(i).getResultado()=="LEGITIMA QUE CONTRADICE LA HIPOTESIS"){
                cant++;

            }
        }
        cant = cant/2;
        System.out.println(cant + " " + cantl);
        if(cantl>cant){
            return true;
        }
        else{
            return false;
        }

    }


}
