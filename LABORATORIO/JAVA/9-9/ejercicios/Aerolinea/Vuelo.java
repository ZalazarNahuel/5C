package Aerolinea;

import java.util.HashSet;

public class Vuelo {
    private HashSet<Asiento> asientos;
    private int idVuelo;

    public Vuelo(int id){
        this.asientos = new HashSet<Asiento>();
        this.idVuelo = id;
    }
    public Vuelo(){
        this(0);
    }
    public HashSet<Asiento> getAsientos(){
        return this.asientos;
    }
    public int getIdVuelo(){
        return this.idVuelo;
    }
    public void addAsiento(Asiento asiento){
        this.getAsientos().add(asiento);
    }
    public int getCantidadAsientosDisponibles(){
        int cant = 0;
        for( Asiento a : asientos){
            if(!a.getOcupado()){
                cant++;
            }
        }
        return cant;
    }

    public int getCantidadAsientosDisponiblesLugar(String lugar){
        int cant = 0;
        for( Asiento a : asientos){
            if(checkAsientoLugar(a, lugar)) cant++;
        }
        return cant;
    }
    public int getCantidadAsientosDisponiblesFilaLugar(int fila, String lugar){
        int cant = 0;
        for( Asiento a : asientos){
            if(checkAsientoLugar(a, lugar) && a.getFila() == fila ) cant++;
        }
        return cant;
    }
    public boolean checkAsientoLugar(Asiento a, String lugar){
        if(!a.getOcupado() && a.getLugar() == lugar){
            return true;
        }
        return false;
    }
    public void reservarAsiento(Asiento a ){
        a.setOcupado(true);
    }
    public void reservarLugar(String lugar){
        for(Asiento a : asientos){
            if(checkAsientoLugar(a, lugar)){
                this.reservarAsiento(a);
                break;
            }

        }
    }
    public void reservarCantidadLugar(String lugar, int cantidad){
        for(int i = 0 ; i <cantidad ; i++){
            reservarLugar(lugar);
        }
    }
    public boolean reservar(int cantidadPasillo, int cantidadVentana){
        if(!checkReservar(cantidadPasillo, cantidadVentana)) return false;
        reservarCantidadLugar("pasillo", cantidadPasillo);
        reservarCantidadLugar("ventana", cantidadVentana);
        return true;
    }
    public int getCantidadAsientosDisponiblesFilasLugar(int filaMin, int filaMax, String lugar){
        int cant = 0;
        for(int i = filaMin; i <= filaMax;i++){
            cant = cant + getCantidadAsientosDisponiblesFilaLugar(i, lugar);
        }
        return cant;
    }
    public boolean checkFila(int cantidadPasillo, int cantidadVentana,int filaMin, int filaMax){
        if(getCantidadAsientosDisponiblesFilasLugar(filaMin, filaMax, "pasillo")==cantidadPasillo && getCantidadAsientosDisponiblesFilasLugar(filaMin, filaMax, "ventana")==cantidadVentana ) return true;
        return false;
    }
    public boolean reservarFila(int cantidadPasillo, int cantidadVentana,int filaMin, int filaMax){
        if(!checkFila(cantidadPasillo, cantidadVentana, filaMin, filaMax)) return false;
        reservarCantidadLugarFila("pasillo", cantidadPasillo, filaMin, filaMax);
        reservarCantidadLugarFila("ventana", cantidadVentana, filaMin , filaMax);
        return true;
    }
    public void reservarCantidadLugarFila(String lugar, int cantidad, int filaMin, int filaMax){
        int cant =0;
        while(cantidad!=cant){
            for(int i = filaMin; i<=filaMax;i++){
                for(Asiento a : asientos){
                    if(a.getFila()==i && !a.getOcupado() && a.getLugar() == lugar){
                        this.reservarAsiento(a);;
                        cant++;
                    }
                }
            }
        }

    }

    public boolean checkReservar(int cantidadPasillo,int cantidadVentana){
        if(this.getCantidadAsientosDisponiblesLugar("pasillo")>=cantidadPasillo && this.getCantidadAsientosDisponiblesLugar("ventana")>=cantidadVentana){
            return true;
        }
        return false;
    }
    public void mostrarAsientos(boolean estado){
        for(Asiento a : asientos){
            if(a.getOcupado()==estado) System.out.println("fila: "+a.getFila()+" columna: "+ a.getColumna());
        }
    }
    public void mostrarAsientosReservados(){
        mostrarAsientos(true);
    }
    public void mostrarAsientosDisponibles(){
        mostrarAsientos(false);
    }
    public boolean checkFilaLlena(int fila){
        for(Asiento a :asientos){
            if(!a.getOcupado() && a.getFila() == fila) return false;
        }
        return true;
    }
    public void mostrarFilasDisponibles(){
        HashSet<Integer> filas = new HashSet<Integer>();
        for(Asiento a : asientos) filas.add(a.getFila());
        for(Integer fila : filas){
            if(!this.checkFilaLlena(fila)){
                System.out.println("La fila "+fila+" esta disponible");
            }
        }
    }

    public int getCantidadAsientosDisponiblesVentana(){
        return this.getCantidadAsientosDisponiblesLugar("ventana");
    }
}
