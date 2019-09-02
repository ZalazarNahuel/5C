import java.util.HashMap;
import java.util.Map;

public class Libreria {

    private HashMap<Editorial,Integer> Libros;

    public Libreria(){

        this.Libros = new HashMap<Editorial,Integer>();

    }

    public HashMap<Editorial, Integer> getLibros() {

        return Libros;

    }

    public void addLibro(Editorial editorial,int canti){

        boolean exists = false;

        for(Map.Entry<Editorial,Integer> libro : Libros.entrySet()){

            if (libro.getKey() == editorial){

                Libros.replace(editorial,(libro.getValue()+canti));
                exists = true;

            }
        }

        if(exists == false)Libros.put(editorial,canti);

    }

    public int getCantLibrosEditorial(Editorial editorial){

        for (Map.Entry<Editorial,Integer> libro : Libros.entrySet()){

            if(libro.getKey() == editorial){

                return libro.getValue();
            }
        }

        return 0;
    }

    public Editorial getEditMasVentas(){

        int cant = 0;

        Editorial editorial = null;
        for (Map.Entry<Editorial,Integer> libro : Libros.entrySet()){

            if(libro.getValue()>cant){

                cant = libro.getValue();
                editorial = libro.getKey();

            }
        }

        return editorial;
    }

}
