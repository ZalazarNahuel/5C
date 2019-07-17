public class Laboratorio {




    private Experimento experimento = new Experimento();
    private boolean vacio;

    public Laboratorio(){
        this.vacio=true;
    }


    public void addExperimento(Experimento e1){
        this.experimento = e1;
        vacio=false;
    }

    public boolean getVacio(){
        return this.vacio;
    }
    public Experimento getExperimento(){
        return experimento;
    }
    public void removeExperimento(){
        vacio = true;
        Experimento e1 = new Experimento();
        experimento = e1;
    }
}
