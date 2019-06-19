package habitacion;
public class Main {


    public static void main(String[] args){
        Objeto ventana = new Objeto(21,"Azul","Vidrio");
        Objeto television = new Objeto(14,"Negro","Plastico");
        Objeto ropero = new Objeto(25,"Marron","Madera");
        Objeto cama = new Objeto(15,"Marron","Madera");
        Objeto silla = new Objeto(7,"Marron","Madera");
        Objeto mesa = new Objeto(19,"Marron","Madera");
        Objeto parlante = new Objeto(3,"Azul","Plastico");
        Objeto estante = new Objeto(4,"Marron","Madera");
        Objeto mueble = new Objeto(8,"Marron","Madera");

        Habitacion h1 = new Habitacion();
        h1.addObjeto(ventana);
        h1.addObjeto(television);
        h1.addObjeto(ropero);
        h1.addObjeto(cama);
        h1.addObjeto(silla);
        h1.addObjeto(mesa);
        h1.addObjeto(parlante);
        h1.addObjeto(estante);
        h1.addObjeto(mueble);

    }
}
