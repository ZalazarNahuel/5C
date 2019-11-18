public class Main {

    public static void main(String[] args){
        Mesa m1 = new Mesa(20.3,"marron","madera");
        Ropero r1 = new Ropero(10.20,"marron","madera");
        Cama c1 = new Cama(10.20,"marron","madera");
        Ventana v1 = new Ventana(10.20,"marron","madera");

        m1.mostrar();
        r1.mostrar();
        c1.mostrar();
        v1.mostrar();
    }
}
//los 4 atributos que tenian las clases estan en elemento ya que son atributos que tienen en comun
// se usa super para el constructor de la clase que descienden 
