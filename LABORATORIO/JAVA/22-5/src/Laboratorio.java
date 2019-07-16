public class Laboratorio {


    private Experimento experimento ;
    private boolean vacio;

    public Laboratorio(){
        this.vacio=true;
        experimento = new Experimento();
    }

    public void setVacio(boolean estado){
        this.vacio = estado;
    }
    public void addExperimento(Experimento e1){
        this.experimento = e1;
        this.setVacio(false);;
    }

    public boolean getVacio(){
        return this.vacio;
    }
    public Experimento getExperimento(){
        return experimento;
    }
    public void removeExperimento(){
        this.setVacio(true);;
        Experimento e1 = new Experimento();
        experimento = e1;
    }
}
