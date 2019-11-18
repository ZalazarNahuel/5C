package ejercicio4;

import java.util.HashMap;
import java.util.Map;

public class Persona {
    private String nombre;
    private String apellido;
    private int dni ;
    private static int cont;
    private HashMap<Bebida,Integer> bebidas ;

    public Persona(String nombrex, String apellidox){
        nombre = nombrex;
        apellido = apellidox;
        cont++;
        dni = cont;
        bebidas = new HashMap<>();
    }

    public int getDni() {
        return dni;
    }
    public String getApellido() {
        return apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public HashMap<Bebida, Integer> getBebidas() {
        return bebidas;
    }
    public int getCoeficienteTotal(){
        int coeficiente = 0;
        for(Map.Entry<Bebida,Integer> bebida: this.getBebidas().entrySet()){
            coeficiente = coeficiente +( bebida.getValue() * bebida.getKey().calcularCoeficiente() );
        }
        return coeficiente;
    }
    public void addBebida(Bebida b,int cant){
        getBebidas().put(b,cant);
    }
}
