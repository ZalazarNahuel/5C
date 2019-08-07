public class Personaje {
    private String nombre;
    private int salud;

    public Personaje(String nombrex, int saludx){
        nombre = nombrex;
        salud = saludx;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getSalud(){
        return this.salud;
    }

    public void mostar(){
        System.out.println("Nombre "+this.getNombre());
        System.out.println("Salud "+this.getSalud());
    }
}
