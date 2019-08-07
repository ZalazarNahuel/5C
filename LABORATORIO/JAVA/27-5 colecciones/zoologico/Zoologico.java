import java.util.HashSet;

public class Zoologico{
    private HashSet<Animal> animales ;

    public Zoologico(){
        animales = new HashSet<Animal>();
    }

    public void addAnimal(Animal a){
        animales.add(a);
    }
    public HashSet<Animal> getAnimales(){
        return this.animales;
    }

    public void animalesHerbivoros(){
        for(Animal animal : this.getAnimales()){
            if(animal.getTipo().equalsIgnoreCase("herbivoro")){
                System.out.println(animal.getNombre());
            }
        }
    }
}