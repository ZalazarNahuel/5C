import java.util.HashSet;
public class Habitacion{

    HashSet<Elemento> elementos;

    public Habitacion(){
        elementos = new HashSet<Elemento>();
    }
    public void addElemento(Elemento o1){
        elementos.add(o1);
    }
    public HashSet<Elemento> getElemento(){
        return this.elementos;
    }
    public void mostrarElementos(){
        for(Elemento elemento: this.getElemento()){
            System.out.println(elemento.getNombre());
            System.out.println("Color "+elemento.getColor());
            System.out.println("Material "+elemento.getMaterial());
            System.out.println("Peso " +elemento.getPeso());
        }
    }


}