public class Persona implements SerHumano{
    private String nombre;
    private int edad;

    public Persona(String nombrex, int edadx){
        nombre = nombrex;
        edad = edadx;
    }

    @Override
    public void respirar() {

    }
    @Override
    public void pensar() {

    }
    @Override
    public void beber() {

    }
    @Override
    public void comer() {

    }
    @Override
    public void trabajar() {

    }
    @Override
    public void hacerNecesidades() {

    }
    @Override
    public void vestirse() {

    }
    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public int getEdad() {
        return edad;
    }
}
