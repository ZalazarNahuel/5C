import java.util.HashSet;

public class Lista {
    private HashSet<Invitado> invitados;

    public Lista(){
        invitados = new HashSet<Invitado>();
    }

    public void addInvitados(Invitado invitado){
        invitados.add(invitado);
    }
    public HashSet<Invitado> getInvitados(){
        return this.invitados;
    }
    public void invitadosConA(){
        for(Invitado invitado : this.getInvitados()){
            if(invitado.getNombre().charAt(0) == 'a' || invitado.getNombre().charAt(0) == 'A' ){
                System.out.println(invitado.getNombre());           
            }
        }
    }
}
