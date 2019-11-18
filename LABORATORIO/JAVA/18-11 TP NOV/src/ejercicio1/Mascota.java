package ejercicio1;

public abstract class Mascota {
    private String nombre;
    private String dueno;
    private String tipo;
    private boolean vivo;

    public Mascota(String nombrex, String duenox, String tipox){
        nombre = nombrex;
        dueno = duenox;
        tipo = tipox;
        vivo = true;
    }
    public Mascota(){

    }
    public String getDueno(){
        return dueno;
    }
    public String getNombre(){
        return nombre;
    }
    public boolean getVivo(){
        return vivo;
    }
    public String getTipo(){
        return  tipo;
    }
    public void setVivo(boolean b){
        vivo = b;
    }
    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void alimentar(){

    }
    public void saludar(String dueno){

    }
}
