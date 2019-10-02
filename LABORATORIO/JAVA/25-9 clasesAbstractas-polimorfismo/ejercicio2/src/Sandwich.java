import java.util.ArrayList;

public class Sandwich {
    ArrayList<Fiambre> fiambres;
    public Sandwich(){
        fiambres = new ArrayList<>();
    }
    public int calcularPrecio(){
        int precio=0;
        for(int i = 0; i < fiambres.size();i++){
            precio = precio + fiambres.get(i).getPrecio();
        }
        return precio;
    }
    public void addFiambre(Fiambre fiambre){
        fiambres.add(fiambre);
    }
}
