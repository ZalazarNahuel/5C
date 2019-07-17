import java.util.HashSet;

public class Aula {

    private HashSet<Elemento> elementos;

    public Aula(){
        elementos = new HashSet<Elemento>();
    }
    public void addElemento(Elemento e){
        this.elementos.add(e);
    }
    public HashSet<Elemento> getElementos(){
        return this.elementos;
    }
    public void mostrarElementos(){
        for(Elemento elemento: this.getElementos()){
            System.out.println(elemento.getNombre());
            System.out.println("Cant "+elemento.getCant());
        }
    }
}
