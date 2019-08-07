import java.util.ArrayList;
public class Colectivo {

    ArrayList<Pasajero> pasajerosActual;
    ArrayList<Pasajero> registroPasajeros;
    ArrayList<Integer> cantidadViajes;

    public Colectivo(){
        this.registroPasajeros = new ArrayList<Pasajero>();
        this.pasajerosActual = new ArrayList<Pasajero>();
        this.cantidadViajes = new ArrayList<Integer>();
    }

    public void addPasajero(Pasajero p){
        boolean encontrado = false;
        for(int i = 0;i<this.registroPasajeros.size();i++){
            if(this.registroPasajeros.get(i).getId() == p.getId()){
                this.cantidadViajes.set(i,this.cantidadViajes.get(i)+1);
                if(this.cantidadViajes.get(i)>=25){
                    p.setFrecuente(true);
                }
                encontrado=true;
            }
        }
        if(encontrado==false){
            this.registroPasajeros.add(p);
            this.cantidadViajes.add(1);
        }
        this.pasajerosActual.add(p);
    }
    public void bajarColectivo(Pasajero p){
        this.pasajerosActual.remove(p);
    }
    // para los tests
    public void setCantidadViajes(int pos,int cant){
        this.cantidadViajes.set(pos,cant);
    }
     // metodos para controlar el orden
    public boolean ifAbonado(int pos){
        return this.pasajerosActual.get(pos).getSUBE().getAbonado();
    }
    public boolean ifMenorMetrosPagados(int pos){
        if(this.pasajerosActual.get(pos).getSUBE().getMetrosRecorridos()<=this.pasajerosActual.get(pos).getSUBE().getMetrosARecorrer()){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean ifDescuentoAplicado(int pos){
        double precioEsperado = this.pasajerosActual.get(pos).getSUBE().getMetrosARecorrer()*0.25;
        if(this.pasajerosActual.get(pos).getSUBE().getPrecio() == precioEsperado){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean checkOrden(int posPasajero){
        boolean checkAbonado = this.ifAbonado(posPasajero);
        boolean checkMenorMetrosPagados = this.ifMenorMetrosPagados(posPasajero);

        boolean orden = false;

        if(checkAbonado == true && checkMenorMetrosPagados == true){
            orden = true;
        }

        if(this.pasajerosActual.get(posPasajero).getFrecuente()){ //solo hace el chekeo si es frecuente
            boolean checkDescuentoAplicado = this.ifDescuentoAplicado(posPasajero);
            if(orden == true && checkDescuentoAplicado == true){
                orden= true;
            }
            else{
                orden = false;
            }
        }
        return orden;
    }

    public boolean ordenTotal(){
        boolean ordenFinal = true;
        for(int i = 0;i<pasajerosActual.size();i++){
            if(this.checkOrden(i)==false){
                ordenFinal = false;
                break;
            }
        }
        if(ordenFinal){
            return true;
        }
        else{
            return false;
        }
    }


}
