public class Guerrero {

    private String nombre;
    private int salud;
    private int fuerza;
    private int cantEspadas;

    public Guerrero(String nombrex, int saludx, int fuerzax, int cantEspadasx){
        nombre = nombrex;
        salud = saludx;
        fuerza = fuerzax;
        cantEspadas = cantEspadasx;
    }
    public int getSalud(){
        return this.salud;
    }
    public int getFuerza(){
        return this.fuerza;
    }
    public int getCantEspadas(){
        return this.cantEspadas;
    }
    public String getNombre(){
        return this.nombre;
    }

}
