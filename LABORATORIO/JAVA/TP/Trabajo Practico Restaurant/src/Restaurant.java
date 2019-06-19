import java.util.ArrayList;

public class Restaurant {


    private String nombre;
    private String cocinero;
    private ArrayList<Mesa> mesas = new ArrayList<Mesa>();
    private ArrayList<Plato> platos = new ArrayList<Plato>();

    public Restaurant(String nombrex, String cocinerox){
        cocinero=cocinerox;
        nombre=nombrex;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCocinero(String cocinero) {
        this.cocinero = cocinero;
    }

    public String getNombre() {
        return nombre;
    }
    public String getCocinero() {
        return cocinero;
    }
    public Mesa getMesa(int i){
        return this.mesas.get(i);
    }

    public void agregarMesa(Mesa m1){
        mesas.add(m1);
    }
    public void agregarPlatoAPreparar(Plato p1) {
        platos.add(p1);
    }

    public String getPlatoMasPedido(){
        ArrayList<String> menuPlatos = new ArrayList<String>();
        ArrayList<Integer> cantidad = new ArrayList<Integer>();

        menuPlatos.add((platos.get(0)).getNombre());
        cantidad.add((platos.get(0)).getCantidad());


        for(int i=1;i<platos.size();i++){
            boolean platoExiste = false;
            for(int j=0;j<menuPlatos.size();j++){
                if(menuPlatos.get(j)==(platos.get(i)).getNombre()){
                    cantidad.set(j,((cantidad.get(j))+((platos.get(i)).getCantidad())));
                    platoExiste=true;

                }
            }

            if(platoExiste==false){
                menuPlatos.add((platos.get(i)).getNombre());

                cantidad.add((platos.get(i)).getCantidad());
            }
        }

        String platoMasPedido = menuPlatos.get(0);
        int cantPlatoMasPedido = cantidad.get(0);

        for(int i=1;i<menuPlatos.size();i++){
            if(cantPlatoMasPedido<cantidad.get(i)){
                cantPlatoMasPedido = cantidad.get(i);
                platoMasPedido = menuPlatos.get(i);
            }
        }

        return platoMasPedido;
    }

    public String getPlatoMenosPedido(){
        ArrayList<String> menuPlatos = new ArrayList<String>();
        ArrayList<Integer> cantidad = new ArrayList<Integer>();

        menuPlatos.add((platos.get(0)).getNombre());
        cantidad.add((platos.get(0)).getCantidad());


        for(int i=1;i<platos.size();i++){
            boolean platoExiste = false;
            for(int j=0;j<menuPlatos.size();j++){
                if(menuPlatos.get(j)==(platos.get(i)).getNombre()){
                    cantidad.set(j,((cantidad.get(j))+((platos.get(i)).getCantidad())));
                    platoExiste=true;
                }
            }
            if(platoExiste==false){
                menuPlatos.add((platos.get(i)).getNombre());
                cantidad.add((platos.get(i)).getCantidad());
            }
        }

        String platoMenosPedido = menuPlatos.get(0);
        int cantPlatoMenosPedido = cantidad.get(0);

        for(int i=1;i<menuPlatos.size();i++){
            if(cantPlatoMenosPedido>cantidad.get(i)){
                cantPlatoMenosPedido = cantidad.get(i);
                platoMenosPedido=menuPlatos.get(i);
            }
        }

        return platoMenosPedido;
    }
}
