import java.util.ArrayList;

public class Mesa {


    private int numDeMesa;
    private ArrayList<Plato> platosPedidos = new ArrayList<Plato>();

    public Mesa(){
        numDeMesa=0;
    }

    public int getNumDeMesa() {
        return numDeMesa;
    }
    public ArrayList<Plato> getPlatosPedidos(){
        return platosPedidos;
    }

    public void setNumDeMesa(int numDeMesa) {
        this.numDeMesa = numDeMesa;
    }

    public void agregarPedidoDeClienteActual(Plato p1){
        platosPedidos.add(p1);
    }

    public void clienteDesocupaMesa(){
        platosPedidos.clear();
    }
}
