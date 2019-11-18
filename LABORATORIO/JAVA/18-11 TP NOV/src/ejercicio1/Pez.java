package ejercicio1;

public class Pez extends Mascota{
    private int vida;
    public Pez(String nombre, String dueno){
        super(nombre,dueno,"pez");
        vida = 10;
    }
    public void setVida(int x){
        vida = x;
    }
    public int getVida(){
        return vida;
    }
    public void restarVida(){
        setVida(getVida()-1);
        System.out.println("Se le resto una vida a tu pez. Le quedan "+getVida());
        if(getVida() == 0){
            this.setVivo(false);
        }
    }
    @Override
    public void saludar(String dueno) {
        if(dueno.equalsIgnoreCase(this.getDueno())){
            restarVida();
        }
        else{
            this.setVivo(false);
            System.out.println(getVivo());
        }
    }

    @Override
    public void alimentar() {
        setVida(getVida()+1);
    }
}
