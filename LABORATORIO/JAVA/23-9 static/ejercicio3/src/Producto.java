public class Producto {
    static double descuento = 0.55;
    double precio;

    public Producto(int preciox){
        if(preciox<=2599){
            precio = preciox;
        }
        else {
            precio = (preciox*descuento);
        }
    }


}
