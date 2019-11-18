public class Main{
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.addInvitados(new Invitado("Nahuel"));
        lista.addInvitados(new Invitado("Alejandro"));
        lista.addInvitados(new Invitado("analia"));
        lista.addInvitados(new Invitado("roberto"));
        lista.invitadosConA();
    }
}