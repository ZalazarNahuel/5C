import java.util.ArrayList;
public class Alumno {




    private String nombre;
    private String apellido;
    private ArrayList<Integer> fecha = new ArrayList<Integer>();
    private ArrayList<Integer> listaNotas = new ArrayList<Integer>();
    private ArrayList<Materia> materia = new ArrayList<materia>();

    public Alumno(){
        nombre="";
        apellido="";
    }
    public Alumno(String nombreX,String apellidoX,ArrayList<Integer> fechaX,int nota){
        nombre=nombreX;
        apellido=apellidoX;
        for(int i=0;i<3;i++){
            fecha.add(fechaX.get(i));
        }
        listaNotas.add(nota);
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public ArrayList<Integer> getFecha(){
        return this.fecha;
    }
    public ArrayList<Integer> getListaNotas(){
        return this.listaNotas;
    }


    public void setNombre(String nombreX){
        this.nombre=nombreX;
    }
    public void setApellido(String apellidoX) {
        this.apellido = apellidoX;
    }
    public void setFecha(int fecha1,int fecha2, int fecha3 ) {
        this.fecha.add(0,fecha1);
        this.fecha.add(1,fecha2);
        this.fecha.add(2,fecha3);
    }
    public void setListaNotas(int nota) {
        this.listaNotas.add(nota);
    }
    public void setMateria(String nombreX, int nota){
        this.materia.
        this.materia.
    }

    public int notaMenor(){
        ArrayList<Integer> notas = this.getListaNotas();
        int notaMenor = notas.get(0);
        for(int i=0;i<notas.size();i++){
            if(notas.get(i)<notaMenor){
                notaMenor=notas.get(i);
            }
        }
        return notaMenor;
    }
    public int notaMayor(){
        ArrayList<Integer> notas = this.getListaNotas();
        int notaMayor = notas.get(0);
        for(int i=0;i<notas.size();i++){
            if(notas.get(i)>notaMayor){
                notaMayor=notas.get(i);
            }
        }
        return notaMayor;
    }
    public int notaPromedio(){
        ArrayList<Integer> notas = this.getListaNotas();
        int promedio=0;
        for (int i=0;i<notas.size();i++){
            promedio = promedio + notas.get(i);
        }
        promedio = promedio/notas.size();
        return promedio;
    }
}