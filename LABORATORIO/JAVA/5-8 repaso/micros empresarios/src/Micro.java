import java.util.ArrayList;

public class Micro {
    private ArrayList<Empleado> pasajerosParados;
    private ArrayList<Empleado> pasajerosSentados;
    private int limiteParados;
    private int limiteSentados;
    private int volumen;
    private Empleado primero;

    public Micro(int limParado, int limSentado, int volumenx){
        this.limiteParados = limParado;
        this.limiteSentados = limSentado;
        this.volumen = volumenx;
        this.pasajerosParados = new ArrayList<Empleado>();
        this.pasajerosSentados = new ArrayList<Empleado>();
        this.primero = new Empleado();
    }

    public int getLimiteParados(){
        return this.limiteParados;
    }
    public int getLimiteSentados(){
        return this.limiteSentados;
    }
    public int getVolumen(){
        return this.volumen;
    }
    public ArrayList<Empleado> getPasajerosParados(){
        return this.pasajerosParados;
    }
    public ArrayList<Empleado> getPasajerosSentados(){
        return this.pasajerosSentados;
    }
    public int getLugaresLibres(){
        return  ((this.getLimiteParados() - this.getPasajerosParados().size()) + (this.getLimiteSentados() - this.getPasajerosSentados().size()));
    }

    public boolean colectivoLleno(){
        if( (this.getPasajerosParados().size() == limiteParados-1) && (this.getPasajerosSentados().size() == limiteSentados-1) ){
            return true;
        }
        return false;
    }
    public boolean asientosOcupados(){
        if( this.getPasajerosSentados().size() >= this.getLimiteSentados() ){
            return true;
        }
        return false;
    }
    public boolean espacioOcupado(){
        if( this.getPasajerosParados().size() >= this.getLimiteParados()){
            return true;
        }
        return false;
    }

    public void addPasajeroSentado(Empleado pasajero){
        this.pasajerosSentados.add(pasajero);
    }
    public void addPasajeroParado(Empleado pasajero){
        this.pasajerosParados.add(pasajero);
    }
    public boolean addPasajero(Empleado pasajero){
        if(!this.asientosOcupados()){
            this.addPasajeroSentado(pasajero);
            return true;
        }
        else if(!this.espacioOcupado()){
            this.addPasajeroParado(pasajero);
            return true;
        }
        return false;
    }
    public void checkPrimero(Empleado pasajero){
        if(this.getPasajerosSentados().size() == 0 && this.getPasajerosParados().size() == 0){
            this.setPrimero(pasajero);
        }
    }
    public void vaciarPrimero(){
        this.setPrimero(null);
    }

    public boolean subirPasajero(Apurado pasajero){
        this.checkPrimero(pasajero);
        if(this.addPasajero(pasajero)) return true;
        this.vaciarPrimero();
        return false;
    }
    public boolean subirPasajero(Claustrofobico pasajero){
        this.checkPrimero(pasajero);
        if(this.getVolumen()>120){
            if(this.addPasajero(pasajero)) return true;
            return false;
        }
        this.vaciarPrimero();
        return false;
    }
    public boolean subirPasajero(Fiaca pasajero){
        this.checkPrimero(pasajero);
        if(!this.asientosOcupados()){
            this.addPasajeroSentado(pasajero);
            return true;
        }
        this.vaciarPrimero();
        return false;
    }
    public boolean subirPasajero(Moderado pasajero){
        this.checkPrimero(pasajero);
        if(this.getLugaresLibres() >= pasajero.getCantLugaresLibres()){
            this.addPasajero(pasajero);
            return true;
        }
        this.vaciarPrimero();
        return false;
    }
    public boolean subirPasajero(Jefe pasajero){
        this.checkPrimero(pasajero);
        if(this.addPasajero(pasajero)){
            pasajero.setDecision(true);
            return true;
        }
        pasajero.setDecision(false);
        this.vaciarPrimero();
        return false;
    }
    public boolean subirPasajero(Obsecuente pasajero){
        this.checkPrimero(pasajero);
        if(pasajero.getJefe().getDecision() == true){
            this.addPasajero(pasajero);
            return true;
        }
        this.vaciarPrimero();
        return false;
    }
    public void bajarPasajero(Empleado pasajero){
        if(this.getPasajerosSentados().contains(pasajero)){
            this.getPasajerosSentados().remove(pasajero);
        }
        else{
            this.getPasajerosParados().remove(pasajero);
        }
        if(this.getPasajerosParados().size() == 0 && this.getPasajerosSentados().size() == 0) this.setPrimero(null);
    }
    public Empleado getPrimero(){
        return this.primero;
    }
    public void setPrimero(Empleado primerox){
        this.primero = primerox;
    }


}
