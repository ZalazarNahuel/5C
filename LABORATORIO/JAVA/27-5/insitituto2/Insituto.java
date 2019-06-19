package insitituto2;

import java.util.HashSet;

public class Insituto {

    private HashSet<Alumno> alumnos ;

    public Insituto(){
        alumnos = new HashSet<Alumno>();
    }
    public void addAlumno(Alumno a){
        alumnos.add(a);
    }
    public void mayoresEdad(){
        for (Alumno a: alumnos) {
            if(a.getEdad()>17){
                System.out.println(a.getEdad());
            }
        }
    }
}
