package instituto;

import java.util.ArrayList;

public class Instituto {

    private ArrayList<Profesor> profesores;

    public Instituto(){
        profesores = new ArrayList<Profesor>();
    }

    public void addProfesor(Profesor p){
        profesores.add(p);
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }
}
