package ejercicio1;

import java.util.ArrayList;

public class Sistema {
    ArrayList<Mascota> mascotas;
    public Sistema(){
        mascotas = new ArrayList<>();
    }
    public boolean checkNombre(String nombre){
        for(int i = 0; i <mascotas.size();i++){
            if(mascotas.get(i).getNombre().equalsIgnoreCase(nombre)){
                return false;
            }
        }
        return true;
    }
    public void altaMascota(Mascota mascota){
        mascotas.add(mascota);
    }
    public void alimentar(Mascota mascota){
        mascota.alimentar();
    }
    public void eliminarMascota(String mascota){
        for(int i = 0;i<getMascotas().size();i++){
            if (getMascotas().get(i).getNombre().equalsIgnoreCase(mascota)) {
                this.getMascotas().remove(i);
            }
        }
    }
    public void saludar(Mascota mascota, String dueno){
        mascota.saludar(dueno);
        if(!mascota.getVivo()){
            System.out.println("Se murio tu mascota");
            eliminarMascota(mascota.getNombre());
        }
    }
    public void modificarNombreMascota(Mascota mascota, String nombre){
        mascota.setNombre(nombre);
    }
    public void modificarDuenoMascota(Mascota mascota, String dueno){
        mascota.setDueno(dueno);
    }
    public ArrayList<Mascota> getMascotas(){
        return mascotas;
    }
    public Mascota getMascotaNombre(String mascota){
        for(int i = 0;i < getMascotas().size();i++){
            if(getMascotas().get(i).getNombre().equalsIgnoreCase(mascota)){
                return getMascotas().get(i);
            }
        }
        return null;
    }
    public boolean esElDueno(String dueno, String mascota){
        if(getMascotaNombre(mascota).getDueno().equalsIgnoreCase(dueno)){
            return true;
        }
        return false;
    }
    public ArrayList<Mascota> getMascotasNombre(String dueno){
        ArrayList<Mascota> ms = new ArrayList<>();
        for(int i = 0; i < getMascotas().size();i++){
            if(getMascotas().get(i).getDueno().equalsIgnoreCase(dueno)){
                ms.add(getMascotas().get(i));
            }
        }
        return ms;
    }



}
