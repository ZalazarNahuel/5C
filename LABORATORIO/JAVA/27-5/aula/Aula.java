package aula;

import java.util.ArrayList;

public class Aula {

    private ArrayList<Elemento> elementos;

    public Aula(){
        elementos = new ArrayList<Elemento>();
    }
    public void addElemento(Elemento e){
        this.elementos.add(e);
    }
    public ArrayList<Elemento> getElementos(){
        return this.elementos;
    }
}
