package aula;

public class Main {

    public static void main(String[] args){
        Elemento alumnos = new Elemento(25);
        Elemento computadoras = new Elemento(19);
        Elemento mesas = new Elemento(9);
        Elemento sillas = new Elemento(29);
        Elemento profesores = new Elemento(1);
        Aula a1 = new Aula();
        a1.addElemento(alumnos);
        a1.addElemento(computadoras);
        a1.addElemento(mesas);
        a1.addElemento(sillas);
        a1.addElemento(profesores);
    }

}
