package ejercicio4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    @Test
    void calcularCoeficienteBebidaNeutra(){
        BebidaNeutra agua = new BebidaNeutra("Agua",20,0);
        assertEquals(20,agua.calcularCoeficiente());
    }
    @Test
    void calcularCoeficienteBebidaAlcoholica(){
        BebidaAlcoholica gancia  = new BebidaAlcoholica("Gancia",5);
        assertEquals(-100,gancia.calcularCoeficiente());
    }
    @Test
    void calcularCoeficienteBebidaAzucarada() {
        BebidaAzucarada sprite = new BebidaAzucarada("Sprite", 30);
        assertEquals(-299,sprite.calcularCoeficiente());
    }
    @Test
    void calcularCoeficientePersona(){
        Persona p = new Persona("nahue","zalazar");
        BebidaAzucarada sprite = new BebidaAzucarada("Sprite",30);
        BebidaAlcoholica gancia  = new BebidaAlcoholica("Gancia",5);
        BebidaNeutra agua = new BebidaNeutra("Agua",20,0);
        p.addBebida(sprite,2);
        p.addBebida(gancia,1);
        p.addBebida(agua,1);

        assertEquals(-678,p.getCoeficienteTotal());
    }
    @Test
    void personaMayorCoeficiente(){
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

        assertEquals(p1,s.mayorCoeficiente());
    }
    @Test
    void personMenorCoeficiente(){
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

        assertEquals(p,s.menorCoeficiente());
    }
}