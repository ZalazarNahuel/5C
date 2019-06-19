public class Tarjeta {


    private int metrosRecorridos;
    private int metrosARecorrer;
    private double precio;
    private boolean abonado;

    public Tarjeta(int metrosARecorrerX){
        this.metrosARecorrer = metrosARecorrerX;
        this.precio=0.0;
        this.abonado=false;
    }
    public Tarjeta(){
        this.metrosARecorrer = 0;
        this.precio=0.0;
        this.abonado=false;
    }

    public int getMetrosARecorrer(){
        return this.metrosARecorrer;
    }
    public boolean getAbonado(){
        return this.abonado;
    }
    public double getPrecio(){
        return this.precio;
    }
    public int getMetrosRecorridos(){
        return this.metrosRecorridos;
    }

    public void setMetrosRecorridos(int metros){
        this.metrosRecorridos = metros;
    }
    public void setAbonado(boolean abonadox) {
        this.abonado = abonadox;
    }
    public void setMetrosARecorrer(int metrosARecorrerx) { //es por si el pasajero quiere hacer un nuevo viaje con la tarjeta
        this.metrosARecorrer = metrosARecorrerx;
    }
    public void setPrecio(double preciox) {
        this.precio = preciox;
    }
}
