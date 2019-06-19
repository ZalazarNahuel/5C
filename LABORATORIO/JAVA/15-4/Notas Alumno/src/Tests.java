public class Tests {
    public static void main(String[] args){



        Materia m1 = new Materia("Literatura",5,"xx");
        Alumno a1 = new Alumno("n","z");
        a1.AgregoNotas(6);
        m1.AgregoAlumno(a1);
        (m1.getAlumno(0)).AgregoNotas(9);
        System.out.println((m1.getAlumno(0)).PromedioNotas());

    }
}
