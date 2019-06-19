import java.util.ArrayList;

public class RegistroAsistencia {


    private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
    private int curso;
    private String especialidad;

    public RegistroAsistencia(){
        curso=0;
        especialidad="";
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void AgregoAlumnos(Alumno alumno){
        this.alumnos.add(alumno);
    }
    public void AlumnoFaltoMas(){
        ArrayList<Alumno> faltoMas = new ArrayList<Alumno>();
        int cant=0;
        faltoMas.add(this.alumnos.get(0));
        for(int i=1;i<this.alumnos.size();i++){
            if((faltoMas.get(0)).Faltas()<(this.alumnos.get(i)).Faltas()){
                for(int j=0;j<=cant;j++){
                    faltoMas.remove(j);
                }
                cant=0;
                for(int j=0;j<=cant;j++){
                    faltoMas.add(j,this.alumnos.get(i));
                }
            }
            else if((faltoMas.get(cant)).Faltas()==(this.alumnos.get(i)).Faltas()){
                cant++;
                faltoMas.add(cant,this.alumnos.get(i));
            }
        }
        System.out.println("Alumno que falto mas");
        for(int i=0;i<=cant;i++){
            System.out.println((faltoMas.get(i)).getNombre());
        }
    }
    public void AlumnoFaltoMenos(){
        ArrayList<Alumno> faltoMenos = new ArrayList<Alumno>();
        int cant=0;
        faltoMenos.add(this.alumnos.get(0));
        for(int i=1;i<this.alumnos.size();i++){
            if((faltoMenos.get(0)).Faltas()>(this.alumnos.get(i)).Faltas()){
                System.out.println("df");
                for(int j=0;j<=cant;j++){
                    faltoMenos.remove(j);
                }
                cant=0;
                for(int j=0;j<=cant;j++){
                    faltoMenos.add(j,this.alumnos.get(i));
                }
            }
            else if((faltoMenos.get(cant)).Faltas()==(this.alumnos.get(i)).Faltas()){
                cant++;
                faltoMenos.add(cant,this.alumnos.get(i));
            }
        }
        System.out.println("Alumno que falto menos");
        for(int i=0;i<=cant;i++){
            System.out.println((faltoMenos.get(i)).getNombre());
        }

    }

    public ArrayList<Alumno> AlumnosLibres(){
        ArrayList<Alumno> alumnoLibre = new ArrayList<Alumno>();
        for(int i=0;i<this.alumnos.size();i++){
            if((this.alumnos.get(i)).Faltas()>15){
                alumnoLibre.add(this.alumnos.get(i));
            }
        }
        return alumnoLibre;
    }
}
