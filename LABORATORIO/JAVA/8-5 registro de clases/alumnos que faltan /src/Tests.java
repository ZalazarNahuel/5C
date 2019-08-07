public class Tests {
    public static void main(String[] args){



        Alumno a1 = new Alumno();
        a1.setNombre("Nahuel");
        a1.setApellido("Zalazar");
        a1.AgregoAsistencia(0);
        a1.AgregoAsistencia(1);
        a1.AgregoAsistencia(1);
        a1.AgregoAsistencia(1);
        a1.AgregoAsistencia(1);

        Alumno a2 = new Alumno();
        a2.setNombre("Franco");
        a2.setApellido("Carbone");
        a2.AgregoAsistencia(0);
        a2.AgregoAsistencia(0);
        a2.AgregoAsistencia(0);
        a2.AgregoAsistencia(1);
        a2.AgregoAsistencia(1);

        Alumno a3 = new Alumno();
        a3.setNombre("Santi");
        a3.setApellido("Conde");
        a3.AgregoAsistencia(0);
        a3.AgregoAsistencia(0);
        a3.AgregoAsistencia(0);
        a3.AgregoAsistencia(0);
        a3.AgregoAsistencia(0);


        RegistroAsistencia r1 = new RegistroAsistencia();
        r1.AgregoAlumnos(a1);
        r1.AgregoAlumnos(a2);
        r1.AgregoAlumnos(a3);

        r1.AlumnoFaltoMas();
        r1.AlumnoFaltoMenos();


    }
}
