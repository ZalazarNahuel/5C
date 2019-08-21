import java.util.HashMap;
import java.util.Map;

public class Libreria {
    private HashMap<Editorial,Integer> libros;

    public Libreria(){
        this.libros = new HashMap<Editorial,Integer>();
    }

    public HashMap<Editorial, Integer> getLibros() {
        return libros;
    }

    public void addLibro(Editorial editorial,int cant){
        boolean existe = false;
        for(Map.Entry<Editorial,Integer> libro : libros.entrySet()){
            if (libro.getKey() == editorial){
                libros.replace(editorial,(libro.getValue()+cant));
                existe = true;
            }
        }
        if(existe == false)libros.put(editorial,cant);
    }

    //METODOS
    public int getCantidadLibrosEditorial(Editorial editorial){
        for (Map.Entry<Editorial,Integer> libro : libros.entrySet()){
            if(libro.getKey() == editorial){
                return libro.getValue();
            }
        }
        return 0;
    }

    public Editorial getEditorialMayorVentas(){
        int cant = 0 ;
        Editorial editorial = null ;
        for (Map.Entry<Editorial,Integer> libro : libros.entrySet()){
            if(libro.getValue()>cant){
                cant = libro.getValue();
                editorial = libro.getKey();
            }
        }
        return editorial;
    }

}

