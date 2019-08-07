public class ResgistroMateria {




    private int dia;
    private int mes;
    private int unidad;
    private int numClase;
    private String temaVisto;

    public ResgistroMateria(){
        dia=0;
        mes=0;
        unidad=0;
        numClase=0;
        temaVisto="";
    }

    public int getDia() {
        return this.dia;
    }
    public int getMes() {
        return this.mes;
    }
    public int getUnidad() {
        return this.unidad;
    }
    public int getNumClase() {
        return this.numClase;
    }
    public String getTemaVisto(){
        return this.temaVisto;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }
    public void setNumClase(int numClase) {
        this.numClase = numClase;
    }
    public void setTemaVisto(String temaVisto) {
        this.temaVisto = temaVisto;
    }
}
