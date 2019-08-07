import java.util.HashSet;
public class Instituto{
    private HashSet<Alumno> alumnos ;

    public Instituto(){
        alumnos =  new HashSet<Alumno>();
    }

    public HashSet<Alumno> getAlumnos(){
        return this.alumnos;
    }
    public int cantAlumnosMayores(){
        int cant =0;
        for(Alumno alumno: this.getAlumnos()){
            if(alumno.getEdad()>17) cant++;
        }
        return cant;
    }

    public void addAlumno(Alumno a){
        alumnos.add(a);
    }


}