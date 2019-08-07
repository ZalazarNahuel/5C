public class Main{
    public static void main(String[] args){
        Zoologico z = new Zoologico(); 

        z.addAnimal(new Animal("Herbivoro","conejo"));
        z.addAnimal(new Animal("herbivoro","Liebre"));
        z.addAnimal(new Animal("carnivoro", "tigre"));

        z.animalesHerbivoros();
    }
}