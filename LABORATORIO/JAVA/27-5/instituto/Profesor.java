package instituto;

import java.util.ArrayList;

public class Profesor {
    private ArrayList<Materia> materias;

    public Profesor(){
        materias = new ArrayList<Materia>();
    }

    public ArrayList<Materia> getMaterias(){
        return materias;
    }
    public void addMateria(Materia m){
        materias.add(m);
    }
}
