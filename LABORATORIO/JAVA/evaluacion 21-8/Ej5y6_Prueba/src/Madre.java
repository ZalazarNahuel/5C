import java.util.HashSet;

public class Madre extends Persona {

    private String empresa;
    private HashSet<String> hijos;

    public Madre(String emp, String var1, String var2, int var3, int var4, String var5, String var6){

        super(var1,var2,var3,var4,var5,var6);
        this.empresa = emp;

    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public HashSet<String> getHijos() {
        return hijos;
    }

    public void setHijos(HashSet<String> hijos) {
        this.hijos = hijos;
    }

}
