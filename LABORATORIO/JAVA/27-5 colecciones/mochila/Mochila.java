import java.util.HashSet;

public class Mochila{
    private HashSet<Util> utiles ;
    
    public Mochila(){
        utiles = new HashSet<Util>();
    }

    public HashSet<Util> getUtil(){
        return this.utiles;
    }
    public void addUtil(Util e){
        this.utiles.add(e);
    }

    public void mostrarUtiles(){
        for(Util util: this.getUtil()){
            System.out.println(util.getNombre());
            System.out.print("Precio "+util.getPrecio());
            System.out.print("Marca "+util.getMarca());
        }
    }
}