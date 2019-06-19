import java.util.ArrayList;

public class Materia {


    private String nombre;
    private ArrayList<ResgistroMateria> listaElementos = new ArrayList<ResgistroMateria>();
    public Materia(){
        nombre="";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void AgregoRegistro(int dia, int mes,int unidad, int numClase, String temaVisto){
        ResgistroMateria r1 = new ResgistroMateria();
        r1.setDia(dia);
        r1.setMes(mes);
        r1.setNumClase(numClase);
        r1.setUnidad(unidad);
        r1.setTemaVisto(temaVisto);
        listaElementos.add(r1);
    }
}

