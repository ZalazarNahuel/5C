public class Libro {




    private Materia[] listaMateria=new Materia[8];
    private int pos;

    public Libro(){
        pos=0;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public void AgregoMateria(String nombre, Materia m1){
        m1.setNombre(nombre);
        listaMateria[this.getPos()]=m1;
        this.setPos(this.getPos()+1);
    }
}
