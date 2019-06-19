package habitacion;
import java.util.ArrayList;
public class Habitacion{

    ArrayList<Objeto> objetos;

    public Habitacion(){
        objetos = new ArrayList<Objeto>();
    }
    public void addObjeto(Objeto o1){
        objetos.add(o1);
    }
    public ArrayList<Objeto> getObjetos(){
        return this.objetos;
    }


}