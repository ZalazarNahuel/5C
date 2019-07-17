import java.util.ArrayList;

public class Sistema {


    private ArrayList<Laboratorio> laboratorios = new ArrayList<Laboratorio>();

    public Sistema(){

    }
    public ArrayList<Laboratorio> getLaboratorios(){
        return laboratorios;
    }

    public boolean addExperimento(Experimento e1){
        for(int i = 0;i<laboratorios.size();i++){
            if(laboratorios.get(i).getVacio()==true){
                laboratorios.get(i).addExperimento(e1);
                 return true;
            }
        }
        for(int i = 0; i < laboratorios.size();i++){
            if(laboratorios.get(i).getExperimento().avanzado()==true){
                laboratorios.get(i).removeExperimento();
                laboratorios.get(i).addExperimento(e1);
                return true;        
            }
        }
        return false;
    }
    public void addLab(Laboratorio l1){
        laboratorios.add(l1);
    }
    public int cantLab(){
        return getLaboratorios().size();
    }
    public Laboratorio getLab(int i ){
        return getLaboratorios().get(i);
    }
    public void  buscarAnomalias(){
        for(int i = 0 ; i<this.cantLab() ; i++){
            if(this.getLab(i).getExperimento().anomala()){
                System.out.println("Se encontro que un experimento es anomala por lo que sera cancelado");
                this.getLab(i).removeExperimento();
            }
        }
    }
    public void cantExperimentosConsistentes(){
        int cantConsistentes = 0;
        for(int i = 0;i< this.cantLab();i++){
            if(this.getLab(i).getExperimento().consistente()){
                cantConsistentes++;
            }
        }
        System.out.println("Hay "+cantConsistentes+" experimentos consistentes");
    }
    public void cantExperimentosAvanzadosConsistentes(){
        int cantAvanzado = 0;
        int cantConsis = 0;
        for(int i = 0; i < this.cantLab();i++){
            if(this.getLab(i).getExperimento().avanzado()){
                if(this.getLab(i).getExperimento().consistente()) cantConsis++;
                cantAvanzado++;
            }
        }
        System.out.println("De los "+cantAvanzado+" experimentos avanzados "+cantConsis+" son consistentes");
    }
}
