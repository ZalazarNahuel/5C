public class Pasajero {

    private Tarjeta SUBE;
    private int id;
    private boolean frecuente;

    public Pasajero(int idx){
        this.frecuente=false;
        this.id=idx;
        this.SUBE=new Tarjeta();
    }

    public int getId(){
        return this.id;
    }
    public Tarjeta getSUBE(){
        return this.SUBE;
    }
    public boolean getFrecuente(){
        return this.frecuente;
    }


    public void setFrecuente(boolean estado){
        this.frecuente=estado;
    }

    public void addTarjeta(Tarjeta SUBEx){
        this.SUBE = SUBEx;
    }
    public void abonar(){
        double calcularPrecio = this.SUBE.getMetrosARecorrer() * 0.5;
        if(this.frecuente){
            calcularPrecio = calcularPrecio * 0.5;
        }
        this.SUBE.setAbonado(true);
        this.SUBE.setPrecio(calcularPrecio);
    }

}
