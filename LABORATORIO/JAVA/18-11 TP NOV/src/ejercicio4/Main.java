package ejercicio4;

public class Main {
    public static void main(String[] args){
        Sistema s = new Sistema();
        Persona p = new Persona("pedro","gomez");
        BebidaAlcoholica fernet = new BebidaAlcoholica("fernet",10);
        BebidaAzucarada coca = new BebidaAzucarada("coca cola",35);
        p.addBebida(fernet,1);
        p.addBebida(coca,2);
        s.addPersona(p);

        Persona p1 = new Persona("pablo","rosst");
        BebidaNeutra agua = new BebidaNeutra("agua",20,0);
        p1.addBebida(agua,3);
        s.addPersona(p1);

        System.out.println("Coeficiente total persona 1: "+s.calcularCoefPer(p));
        System.out.println("Coeficiente total persona 2: "+s.calcularCoefPer(p1));
        System.out.println("Persona de mejor coeficiente: "+s.mayorCoeficiente().getNombre());
        System.out.println("Persona de peor coeficiente: "+s.menorCoeficiente().getNombre());
    }
}
