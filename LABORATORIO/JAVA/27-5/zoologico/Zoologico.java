package zoologico;


import java.util.HashSet;

public class Zoologico {
    private HashSet<Animal> animales;

    public Zoologico(){
        animales = new HashSet<Animal>();
    }

    public void addAnimal(Animal a){
        animales.add(a);
    }
    public void mostrarHerbivoros(){
        for(Animal a: animales){
            if(a.getTipo().equalsIgnoreCase("herbivoro")){
                System.out.println(a.getTipo());
            }
        }
    }
}
