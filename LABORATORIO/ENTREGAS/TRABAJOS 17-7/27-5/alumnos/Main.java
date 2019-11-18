public class Main{
    public static void main(String[] args){
        Instituto i = new Instituto();

        i.addAlumno(new Alumno(18));
        i.addAlumno(new Alumno(19));
        i.addAlumno(new Alumno(13));
        System.out.println(i.cantAlumnosMayores());
    }
}