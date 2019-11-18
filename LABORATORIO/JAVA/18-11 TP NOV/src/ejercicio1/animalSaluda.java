package ejercicio1;

public abstract class animalSaluda extends Mascota{
    private String saludo;
    private int alegria;

    public animalSaluda(String nombre, String dueno,String tipo, String saludox){
        super(nombre,dueno, tipo);
        alegria = 1;
        saludo = saludox;
    }
    public String getSaludo(){
        return saludo;
    }
    public int getAlegria(){
        return alegria;
    }
    public void setAlegria(int x){
        alegria = x;
    }
    public void saludar(String dueno){
        super.saludar(dueno);
        String result= "";
        if (dueno.equalsIgnoreCase(this.getDueno())){
            for(int i = 0; i < alegria;i++){
                result = result +" "+ this.getSaludo();
            }
            System.out.println(result);
            if(this.getAlegria()>1){
                setAlegria(getAlegria()-1);
            }
        }

    }

    @Override
    public void alimentar() {
        super.alimentar();
        setAlegria(getAlegria()+1);
    }
}
