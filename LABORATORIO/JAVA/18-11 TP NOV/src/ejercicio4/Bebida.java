package ejercicio4;

public abstract class Bebida {
    private String nombre;
    private int coefPos;
    private int coefNeg;

    public Bebida(String nombrex, int pos, int neg){
        nombre = nombrex;
        coefNeg = neg;
        coefPos = pos;
    }
    public Bebida(){

    }
    public String getNombre(){
        return nombre;
    }
    public int getCoefPos(){
        return  coefPos;
    }
    public int getCoefNeg(){
        return coefNeg;
    }
    public int calcularCoeficiente(){
        return (getCoefPos()-getCoefNeg());
    }
}
