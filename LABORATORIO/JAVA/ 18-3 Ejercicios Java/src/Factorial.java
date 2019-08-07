public class Factorial {

    private int numero;

    public Factorial(){
        this.numero=0;
    }
    public Factorial(int numero){
        this.numero=numero;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero=numero;
    }

    public int resultadoFactorial(){
        int resultado=1;
        for(int i=1;i<=this.getNumero();i++){
            resultado=resultado*i;
        }

        return resultado;
    }
}
