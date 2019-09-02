public class Avion implements Vehiculo,ObjetoVolador {



    private int capacidadPersonas;
    private String motor;
    private boolean ruedas;

    public Avion(int capacidadPersonasx, String motorx, boolean ruedasx){
        capacidadPersonas = capacidadPersonasx;
        motor = motorx;
        ruedas = ruedasx;
    }

    @Override
    public void aumentarVelocidad() {

    }
    @Override
    public boolean ruedas() {
        return false;
    }
    @Override
    public int capacidadPersonas() {
        return capacidadPersonas;
    }
    @Override
    public String motor() {
        return motor;
    }
    @Override
    public void encender() {

    }
    @Override
    public void vuela() {

    }
}
