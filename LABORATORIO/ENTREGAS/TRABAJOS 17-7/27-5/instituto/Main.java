public class Main{
    public static void main(String[] args){
        Instituto i = new Instituto();
        i.addProfe(new Profesor("Humberto"), 4);
        i.addProfe(new Profesor("Lopez"), 6);
        i.addProfe(new Profesor("Sandra"), 5);

        i.materiaProfe();
    }
}