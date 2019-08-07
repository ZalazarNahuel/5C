import java.util.ArrayList;

public class Juego {
    private ArrayList<Jugador> jugadores;
    private Jugador ganador;
    private int[] dados;

    public Juego(){
        jugadores = new ArrayList<Jugador>();
        ganador = new Jugador(null);
        dados = new int[5];
    }

    public void addJugador(Jugador j){
        jugadores.add(j);
    }

    public int[] getDados() {
        return dados;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
    public String getNombreJugador(int i){
        return this.getJugador(i).getNombre();
    }
    public Jugador getGanador(){
        return ganador;
    }
    public void setDado(int i,int valor){
        this.dados[i] = valor;
    }
    public int getDado(int i){
        return this.dados[i];
    }
    public Jugador getJugador(int i){
        return jugadores.get(i);
    }

    /*
    public void tirar1dado(ArrayList<Integer> d){
        this.setDado(d.get(0),this.rand());
    }
    public void tirar2dados(ArrayList<Integer> d){
        this.setDado(d1,this.rand());
        this.setDado(d2,this.rand());
    }
    public void tirar3dados(ArrayList<Integer> d){
        this.setDado(d1,this.rand());
        this.setDado(d2,this.rand());
        this.setDado(d3,this.rand());
    }
    public void tirar4dados(ArrayList<Integer> d){
        this.setDado(d1,this.rand());
        this.setDado(d2,this.rand());
        this.setDado(d3,this.rand());
        this.setDado(d4,this.rand());
    }*/
    public void tirarDadosCantX(ArrayList<Integer> d){
        for(int i = 0; i<d.size();i++){
            this.setDado(d.get(i),this.rand());
        }
    }
    public void tirar5dados(){
        this.setDado(0,this.rand());
        this.setDado(1,this.rand());
        this.setDado(2,this.rand());
        this.setDado(3,this.rand());
        this.setDado(4,this.rand());
    }
    public int rand(){
        double num = (Math.random()*4+1);
        return (int)num;
    }
    public void mostrarDados(){
        for(int i = 0;i < 5;i++){
            System.out.println("dado "+ i + ": " + this.getDado(i));
        }
    }
}
