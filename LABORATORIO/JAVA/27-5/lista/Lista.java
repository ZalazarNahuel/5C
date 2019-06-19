package lista;

import java.util.ArrayList;

public class Lista {
    private ArrayList<Invitado> invitados;

    public Lista(){
        invitados = new ArrayList<Invitado>();
    }

    public void addInvitados(Invitado i){
        invitados.add(i);
    }
    public void invitadosConA(){
        for(int i = 0 ;i < invitados.size();i++){
            if(invitados.get(i).getNombre().charAt(0) == 'a' || invitados.get(i).getNombre().charAt(0) == 'A'){
                System.out.println(invitados.get(i).getNombre());
            }
        }
    }
}
