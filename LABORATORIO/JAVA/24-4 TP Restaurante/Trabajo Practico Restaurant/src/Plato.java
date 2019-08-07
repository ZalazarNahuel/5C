public class Plato {




    private String nombre;
    private int numDeMesa;
    private int numPedido;
    private int cantidad;


    public Plato(){
        nombre="";
        numDeMesa=0;
        numPedido=0;
        cantidad=0;
    }

    public String getNombre() {
        return this.nombre;
    }
    public int getCantidad() {
        return this.cantidad;
    }
    public int getNumDeMesa() {
        return this.numDeMesa;
    }
    public int getNumPedido() {
        return this.numPedido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setNumDeMesa(int numDeMesa) {
        this.numDeMesa = numDeMesa;
    }
    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }
}
