public class TestsHorario {
    public static void main(String[] args){



        Horario h1 = new Horario();
        Horario h2 = new Horario();


        System.out.println("TEST HorarioEsMenor. Caso con horario 1 menor a horario 2");
        h1.setHora(1);
        h1.setMinuto(10);
        h1.setSegundo(2);
        h2.setHora(2);
        h2.setMinuto(10);
        h2.setSegundo(30);
        boolean valorEsperado = true;
        boolean valorObtenido = h1.HorarioEsMenor(h2);
        System.out.println((valorEsperado==valorObtenido)?"Paso el test.\n":"No paso el test.\n");

        System.out.println("TEST HorarioEsMenor. Caso con horario 1 mayor a horario 2");
        h1.setHora(2);
        h1.setMinuto(10);
        h1.setSegundo(50);
        h2.setHora(2);
        h2.setMinuto(10);
        h2.setSegundo(30);
         valorEsperado = false;
         valorObtenido = h1.HorarioEsMenor(h2);
        System.out.println((valorEsperado==valorObtenido)?"Paso el test.\n":"No paso el test.\n");

        System.out.println("TEST HorarioEsIgual. Caso con dos horarios iguales");
        h1.setHora(1);
        h1.setMinuto(10);
        h1.setSegundo(2);
        h2.setHora(1);
        h2.setMinuto(10);
        h2.setSegundo(2);
         valorEsperado = true;
         valorObtenido = h1.HorarioEsIgual(h2);
        System.out.println((valorEsperado==valorObtenido)?"Paso el test.\n":"No paso el test.\n");

        System.out.println("TEST HorarioEsIgual. Caso con dos horarios diferentes");
        h1.setHora(1);
        h1.setMinuto(10);
        h1.setSegundo(2);
        h2.setHora(1);
        h2.setMinuto(10);
        h2.setSegundo(2);
         valorEsperado = false;
         valorObtenido = h1.HorarioEsIgual(h2);
        System.out.println((valorEsperado==valorObtenido)?"Paso el test.\n":"No paso el test.\n");
    }
}
