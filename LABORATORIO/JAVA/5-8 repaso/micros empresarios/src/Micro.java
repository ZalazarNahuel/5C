import java.util.ArrayList;

public class Micro {
    private ArrayList<Empleado> pasajerosParados;
    private ArrayList<Empleado> pasajerosSentados;
    private int limiteParados;
    private int limiteSentados;
    private int volumen;

    public Micro(int limParado, int limSentado, int volumenx){
        this.limiteParados = limParado;
        this.limiteSentados = limSentado;
        this.volumen = volumenx;
        this.pasajerosParados = new ArrayList<Empleado>();
        this.pasajerosSentados = new ArrayList<Empleado>();
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
        if( this.getPasajerosSentados().size() == this.getLimiteSentados()-1 ){
            return true;
        }
        return false;
    }
    public boolean espacioOcupado(){
        if( this.getPasajerosParados().size() == this.getLimiteParados()-1){
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

    public boolean subirApurado(Empleado pasajero){
        if(this.addPasajero(pasajero)) return true;
        return false;
    }
    public boolean subirClaustrofobico(Empleado pasajero){
        if(this.getVolumen()>120){
            if(this.addPasajero(pasajero)) return true;
            return false;
        }
        return false;
    }
    public boolean subirFiaca(Empleado pasajero){
        if(!this.asientosOcupados()){
            this.addPasajeroSentado(pasajero);
            return true;
        }
        return false;
    }

    public boolean decisionPasajero(Empleado pasajero){
        switch (pasajero.getTipo()){
            case "apurado":
                this.subirApurado(pasajero);
                return true;
            case "claustrofobico":
                this.subirClaustrofobico(pasajero);
                return true;
            case "fiaca":
                this.subirFiaca(pasajero);
                return true;
        }
        return false;
    }
    public boolean decisionPasajero(Moderado pasajero){
        if(this.getLugaresLibres() >= pasajero.getCantLugaresLibres()){
            this.addPasajero(pasajero);
            return true;
        }
        return false;
    }
    public boolean decisionPasajero(EmpleadoObsecuente pasajero){
        return false;
    }

    public boolean subirPasajero(Empleado pasajero){
        return false;
    }

}
