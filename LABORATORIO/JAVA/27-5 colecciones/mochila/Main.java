public class Main{
    public static void main(String[] args) {
        Mochila m = new Mochila();

        m.addUtil(new Util("lapiz",30, "Faber Castel"));
        m.addUtil(new Util("regla",20, "Maped"));
        m.addUtil(new Util("goma",10, "Maped"));

        m.mostrarUtiles();
    }
}