package ejercicio1;

public class Gato extends animalSaluda {
    public Gato(String nombre, String dueno){
        super(nombre,dueno,"gato","miau");
    }
    @Override
    public void saludar(String dueno) {
        super.saludar(dueno);
        if(!getDueno().equalsIgnoreCase(dueno)){
            System.out.println(getSaludo().toUpperCase()+"!");
        }
    }
}
