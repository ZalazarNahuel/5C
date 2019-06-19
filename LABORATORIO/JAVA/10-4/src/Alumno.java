public class Alumno {




    private String nombre;
    private String apellido;
    private int[] fecha = new int[3];
    private int[] listaNotas = new int[5];

    public Alumno(){
        nombre="";
        apellido="";
        for(int i=0;i<3;i++){
            fecha[i]=0;
        }
        for(int i=0;i<5;i++){
            listaNotas[i]=0;
        }
    }
    public Alumno(String nombreX,String apellidoX,int[] fechaX,int[] listaNotasX){
        nombre=nombreX;
        apellido=apellidoX;
        for(int i=0;i<3;i++){
            fecha[i]=fechaX[i];
        }
        for(int i=0;i<5;i++){
            listaNotas[i]=listaNotasX[i];
        }
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int[] getFecha(){
        return this.fecha;
    }
    public int[] getListaNotas(){
        return this.listaNotas;
    }

    public void setNombre(String nombreX){
        this.nombre=nombreX;
    }
    public void setApellido(String apellidoX) {
        this.apellido = apellidoX;
    }
    public void setFecha(int fecha1,int fecha2, int fecha3 ) {
        this.fecha[0] = fecha1;
        this.fecha[1] = fecha2;
        this.fecha[2] = fecha3;
    }
    public void setListaNotas(int nota1,int nota2, int nota3, int nota4, int nota5 ) {
        this.listaNotas[0] = nota1;
        this.listaNotas[1] = nota2;
        this.listaNotas[2] = nota3;
        this.listaNotas[3] = nota4;
        this.listaNotas[4] = nota5;
    }

    public int notaMenor(){
        int[] notas = this.getListaNotas();
        int notaMenor = notas[0];
        for(int i=0;i<5;i++){
            if(notas[i]<notaMenor){
                notaMenor=notas[i];
            }
        }
        return notaMenor;
    }
    public int notaMayor(){
        int[] notas = this.getListaNotas();
        int notaMayor = notas[0];
        for(int i=0;i<5;i++){
            if(notas[i]>notaMayor){
                notaMayor=notas[i];
            }
        }
        return notaMayor;
    }
    public int notaPromedio(){
        int[] notas = this.getListaNotas();
        int promedio=0;
        for (int i=0;i<5;i++){
            promedio = promedio + notas[i];
        }
        promedio = promedio/5;
        return promedio;
    }
}
