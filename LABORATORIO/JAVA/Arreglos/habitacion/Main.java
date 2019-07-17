public class Main {


    public static void main(String[] args){
        
        Habitacion h1 = new Habitacion();
        h1.addElemento(new Elemento("ventana",21,"Azul","Vidrio"));
        h1.addElemento(new Elemento("television",14,"Negro","Plastico"));
        h1.addElemento(new Elemento("ropero",25,"Marron","Madera"));
        h1.addElemento(new Elemento("cama",15,"Marron","Madera"));
        h1.addElemento(new Elemento("silla",7,"Marron","Madera"));
        h1.addElemento(new Elemento("mesa",19,"Marron","Madera"));
        h1.addElemento(new Elemento("parlante",3,"Azul","Plastico"));
        h1.addElemento(new Elemento("estante",4,"Marron","Madera"));
        h1.addElemento(new Elemento("mueble",8,"Marron","Madera"));

        h1.mostrarElementos();

    }
}