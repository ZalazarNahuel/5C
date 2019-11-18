package ejercicio1;

public class Peces  extends Mascota{
    private int vida;
    public Peces(String nombre, String dueno){
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
        if(getVida() == 0){
            //muere
        }
    }
    @Override
    public void saludar(String dueno) {
        if(dueno == this.getDueno()){
            restarVida();
        }
        else{
            //muere
        }
    }

    @Override
    public void alimentar() {
        setVida(getVida()+1);
    }
}
