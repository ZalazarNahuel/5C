public class Mago {

    private String nombre;
    private int salud;
    private int mana;
    private int cantHechizos;
    public Mago(String nombrex, int saludx, int manax, int cantHechizosx){
        nombre = nombrex;
        salud = saludx;
        mana = manax;
        cantHechizos = cantHechizosx;
    }
    public int getSalud(){
        return this.salud;
    }
    public int getMana(){
        return this.mana;
    }
    public int cantHechizos(){
        return this.cantHechizos;
    }
    public String getNombre(){
        return this.nombre;
    }
}
