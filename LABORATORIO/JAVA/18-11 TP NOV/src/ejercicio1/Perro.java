package ejercicio1;

public class Perro extends animalSaluda {
    public Perro(String nombre, String dueno){
        super(nombre,dueno,"perro","guau");
    }

    @Override
    public void saludar(String dueno) {
        super.saludar(dueno);
        if(!getDueno().equalsIgnoreCase(dueno)){
            System.out.println(getSaludo().toUpperCase()+"!");
        }
    }
}
