public class Cine {
    private int entrada;
    private int cantSala;
    private int cantPelicula;
    private String zona;

    public Cine(){
        entrada=0;
        cantSala=0;
        cantPelicula=0;
        zona="";
    }
    public Cine(int entradaX,int cantSalaX, int cantPeliculaX, String zonaX){
        entrada=entradaX;
        cantSala=cantSalaX;
        cantPelicula=cantPeliculaX;
        zona=zonaX;
    }

    public int getEntrada(){
        return this.entrada;
    }
    public int getCantSala(){
        return this.cantSala;
    }
    public int getCantPelicula(){
        return this.cantPelicula;
    }

    public String getZona() {
        return this.zona;
    }

    public void setEntrada(int entradaX){
        this.entrada = entradaX;
    }
    public void setCantSala(int cantSalaX){
        this.cantSala = cantSalaX;
    }
    public void setCantPelicula(int cantPeliculaX){
        this.cantPelicula = cantPeliculaX;
    }
    public void setZona(String zonaX) {
        this.zona = zonaX;
    }

    public boolean sonIguales(Cine c2){
        boolean loSon = this.getEntrada() == c2.getEntrada() && this.getCantSala() == c2.getCantSala() && this.getCantPelicula() == c2.getCantPelicula() && this.getZona() == c2.getZona();
        return loSon;
    }
    public boolean entradaMayorA125(){
        boolean loEs = this.getEntrada() == 125;
        return loEs;
    }
    public boolean salasIgualPeliculas(){
        boolean loSon = this.getCantPelicula() == this.getCantSala();
        return loSon;
    }
    public boolean mismaZona(Cine c2){
        boolean loEs = this.getZona() == c2.getZona();
        return loEs;
    }
}
