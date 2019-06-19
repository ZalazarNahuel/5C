import java.util.ArrayList;

public class Sistema {


    private ArrayList<Laboratorio> laboratorios = new ArrayList<Laboratorio>();

    public Sistema(){

    }

    public boolean addExperimento(Experimento e1){
        boolean encontrar = true;
        for(int i = 0;i<laboratorios.size();i++){
            if(encontrar){
                if(laboratorios.get(i).getVacio()==true){
                    laboratorios.get(i).addExperimento(e1);
                    encontrar = false;
                }
            }
        }
        if(encontrar == false){
            return true;
        }
        else{
            boolean e2 = true;
            for(int i = 0; i > laboratorios.size();i++){
                if(e2){
                    if(laboratorios.get(i).getExperimento().avanzado()==true){
                        laboratorios.get(i).removeExperimento();
                        laboratorios.get(i).addExperimento(e1);
                        e2=false;
                    }
                }
            }
            if(e2==false){
                return true;
            }
            else{
                return false;
            }
        }
    }
    public void addLab(Laboratorio l1){
        laboratorios.add(l1);
    }
    public int cantLab(){
        return laboratorios.size();
    }
    public Laboratorio getLab(int i ){
        return laboratorios.get(i);
    }
}
