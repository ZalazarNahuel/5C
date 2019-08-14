package micros;

import java.util.ArrayList;

public class Micro {
    private ArrayList<Empleado> pasajeros;
    private int disponibleParado;
    private int disponibleSentado;
    private int volumen;
    private Empleado primero;

    public Micro(int limParado, int limSentado, int volumenx){
        this.disponibleParado = limParado;
        this.disponibleSentado = limSentado;
        this.volumen = volumenx;
        this.pasajeros = new ArrayList<Empleado>();
        this.primero = new Empleado();
    }

    public int getDisponibleParado(){
        return this.disponibleParado;
    }
    public int getDisponibleSentado(){
        return this.disponibleSentado;
    }
    public void setDisponibleParado(int disp){
        this.disponibleParado = disp;
    }
    public void setDisponibleSentado(int disp){
        this.disponibleSentado = disp;
    }
    public int getVolumen(){
        return this.volumen;
    }
    public ArrayList<Empleado> getPasajeros(){
        return this.pasajeros;
    }
    public int getLugaresLibres(){
        return  (this.getDisponibleSentado() + this.getDisponibleParado());
    }

    public boolean colectivoLleno(){
        if( this.getDisponibleParado() == 0 && this.getDisponibleSentado() == 0 ){
            return true;
        }
        return false;
    }
    public boolean asientosOcupados(){
        if( this.getDisponibleSentado() == 0 ){
            return true;
        }
        return false;
    }
    public boolean espacioOcupado(){
        if(this.getDisponibleParado() == 0){
            return true;
        }
        return false;
    }

    public void addPasajeroSentado(Empleado pasajero){
        this.getPasajeros().add(pasajero);
        this.setDisponibleSentado(this.getDisponibleSentado()-1);
    }
    public void addPasajeroParado(Empleado pasajero){
        this.getPasajeros().add(pasajero);
        this.setDisponibleParado(this.getDisponibleParado()-1);
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
    public void checkPrimero(Empleado pasajero){
        if(this.getPasajeros().size() == 0){
            this.setPrimero(pasajero);
        }
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
        if(pasajero.getJefe().getDecision() == true){
            this.addPasajero(pasajero);
            return true;
        }
        this.vaciarPrimero();
        return false;
    }
    public void bajarPasajero(Empleado pasajero){
        this.getPasajeros().remove(pasajero);
        if(this.getPasajeros().size() == 0) this.setPrimero(null);
        else this.setPrimero(this.getPasajeros().get(0));
    }
    public Empleado getPrimero(){
        return this.primero;
    }
    public void setPrimero(Empleado primerox){
        this.primero = primerox;
    }


}
