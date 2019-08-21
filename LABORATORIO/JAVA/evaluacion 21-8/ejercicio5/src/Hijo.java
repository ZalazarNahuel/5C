public class Hijo extends Persona {
    private String escuela;
    private String juegoFavorito;

    public Hijo(){
        super();
        this.escuela = "";
        this.juegoFavorito="";
    }
    public Hijo(String nombrex, String apellidox, int edadx, int dnix, String ocupacionx, String escuelax, String juegoFavoritox){
        super(nombrex,apellidox,edadx,dnix,"masculino",ocupacionx);
        this.escuela=escuelax;
        this.juegoFavorito = juegoFavoritox;
    }

    //GETTERS
    public String getEscuela(){
        return this.escuela;
    }

    public String getJuegoFavorito(){
        return this.juegoFavorito;
    }

    //SETTERS
    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public void setJuegoFavorito(String juegoFavorito) {
        this.juegoFavorito = juegoFavorito;
    }

    //METODOS
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Escuela: " + this.getEscuela());
        System.out.println("Juego Favorito: " + this.getJuegoFavorito());
    }
}
