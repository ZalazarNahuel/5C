package cuaderno;

public enum Cuaderno {
    CHICO24(50) , MEDIANO48(100) ,GRANDE98(180);
    private  int precio;

    private Cuaderno(int hojasx){
        this.precio = hojasx;
    }
    public int getPrecio() {
        return precio;
    }
}
