package cuaderno;

import java.util.HashMap;
import java.util.Map;

public class Pedido {
    HashMap<Cuaderno,Integer> cuadernos ;

    public Pedido(){
        this.cuadernos = new HashMap<Cuaderno,Integer>();
    }
    public HashMap<Cuaderno,Integer> getCuadernos(){
        return this.cuadernos;
    }
    public void addCuaderno(Cuaderno cuaderno, int cantidad){
        this.getCuadernos().put(cuaderno,cantidad);
    }
    public int getMonto(){
        int monto = 0;
        for(Map.Entry<Cuaderno,Integer> cuaderno : cuadernos.entrySet()){
            monto = monto + ( cuaderno.getKey().getPrecio() * cuaderno.getValue() );
        }
        return monto;
    }
}
