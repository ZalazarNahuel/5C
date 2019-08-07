import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

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
    public ArrayList<Plato> getPlatos(){
        return this.platos;
    }
    public Plato getPlato(int i){
        return this.getPlatos().get(i);
    }

    public void agregarMesa(Mesa m1){
        mesas.add(m1);
    }
    public void agregarPlatoAPreparar(Plato p1) {
        platos.add(p1);
    }

    public HashMap<String,Integer> getMenu(){
        HashMap<String,Integer> menu = new HashMap<String,Integer>();
        for(int i=0;i<this.getPlatos().size();i++){
            boolean platoExiste = false;
            for(Map.Entry<String,Integer> elemento : menu.entrySet()){
                if(elemento.getKey() == this.getPlato(i).getNombre()){
                    menu.put(this.getPlato(i).getNombre(),elemento.getValue()+this.getPlato(i).getCantidad());
                    platoExiste = true;
                }
            }
            if(platoExiste == false){
                menu.put(this.getPlato(i).getNombre(),this.getPlato(i).getCantidad());
            }
        }
        return menu;
    }

    public String getPlatoMasPedido(){

        HashMap<String, Integer> menu = this.getMenu();

        String platoMasPedido = this.getPlato(0).getNombre();

        for(Map.Entry<String,Integer> elemento : menu.entrySet() ){
            if(menu.get(platoMasPedido)<elemento.getValue()){
                platoMasPedido = elemento.getKey();
            }
        }

        return platoMasPedido;
    }

    public String getPlatoMenosPedido(){

        HashMap<String, Integer> menu = this.getMenu();

        String platoMenosPedido = this.getPlato(0).getNombre();

        for(Map.Entry<String,Integer> elemento : menu.entrySet() ){
            if(menu.get(platoMenosPedido)>elemento.getValue()){
                platoMenosPedido = elemento.getKey();
            }
        }

        return platoMenosPedido;
    }
}
