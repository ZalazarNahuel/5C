package ejercicio4;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Persona> personas;

    public Sistema(){
        personas = new ArrayList<>();
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }
    public void addPersona(Persona p){
        personas.add(p);
    }
    public int calcularCoefPer(Persona p){
        for(int i = 0; i<getPersonas().size();i++){
            if(getPersonas().get(i) == p){
                return p.getCoeficienteTotal();
            }
        }
        return 0;
    }
    public Persona mayorCoeficiente(){
        Persona mayor;
        if(getPersonas().size()>0) {
            mayor = getPersonas().get(0);
        }
        else{
            return null;
        }
        for(int i = 1;i<getPersonas().size();i++){
            if(getPersonas().get(i).getCoeficienteTotal()>mayor.getCoeficienteTotal()){
                mayor = getPersonas().get(i);
            }
        }
        return mayor;
    }
    public Persona menorCoeficiente(){
        Persona menor;
        if(getPersonas().size()>0) {
            menor = getPersonas().get(0);
        }
        else{
            return null;
        }
        for(int i = 1;i<getPersonas().size();i++){
            if(getPersonas().get(i).getCoeficienteTotal()<menor.getCoeficienteTotal()){
                menor = getPersonas().get(i);
            }
        }
        return menor;
    }

}
