package Aerolinea;

public class Asiento {
    private int fila;
    private int columna;
    private boolean ocupado;
    private String lugar;

    public Asiento(int filax, int columnax, String lugarx){
        this.fila = filax;
        this.columna = columnax;
        this.ocupado = false;
        this.lugar = lugarx;
    }
    public Asiento(){
        this(0, 0, "");
        this.ocupado = false;
    }

    public int getFila(){
        return this.fila;
    }
    public int getColumna(){
        return this.columna;
    }
    public boolean getOcupado(){
        return this.ocupado;
    }
    public String getLugar(){
        return this.lugar;
    }
    public void setOcupado(boolean estado){
        this.ocupado = estado;
    }
}
