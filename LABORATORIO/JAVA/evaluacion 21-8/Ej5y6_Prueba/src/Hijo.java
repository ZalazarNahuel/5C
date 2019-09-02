public class Hijo extends Persona {

    private String escuela;
    private String juegofav;

    public Hijo(String school, String juego, String var1, String var2, int var3, int var4, String var5, String var6){

        super(var1,var2,var3,var4,var5,var6);
        this.escuela = school;
        this.juegofav = juego;

    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getJuegofav() {
        return juegofav;
    }

    public void setJuegofav(String juegofav) {
        this.juegofav = juegofav;
    }
}
