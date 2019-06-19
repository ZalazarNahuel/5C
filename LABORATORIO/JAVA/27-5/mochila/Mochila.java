package mochila;

import java.util.ArrayList;

public class Mochila {
    ArrayList<Util> utiles;
    public Mochila(){
        utiles = new ArrayList<Util>();
    }
    public void addUtil(Util u1){
        utiles.add(u1);
    }
    public ArrayList<Util> getUtiles(){
        return this.utiles;
    }
}
