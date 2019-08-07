public class Brujo extends Personaje {

    private int mana;
    private int cantHechizos;

    public Brujo(String nombrex, int saludx, int manax, int cantHechizosx){
        super(nombrex,saludx);
        mana = manax;
        cantHechizos = cantHechizosx;
    }
    public int getMana(){
        return this.mana;
    }
    public int getCantHechizos(){
        return this.cantHechizos;
    }
    public void mostrarMago(){
        super.mostar();
        System.out.println("Mana "+this.getMana());
        System.out.println("Cantidad de hechizos "+this.getCantHechizos());
    }
}
