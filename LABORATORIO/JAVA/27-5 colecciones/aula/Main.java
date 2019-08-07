public class Main {

    public static void main(String[] args){
        Aula a1 = new Aula();
        a1.addElemento(new Elemento("alumnos",25));
        a1.addElemento(new Elemento("computadoras",19));
        a1.addElemento(new Elemento("mesas",9));
        a1.addElemento(new Elemento("sillas",29));
        a1.addElemento(new Elemento("profesores",1));
        a1.mostrarElementos();
    }

}
