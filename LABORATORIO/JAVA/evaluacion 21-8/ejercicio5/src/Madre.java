import java.util.HashSet;

public class Madre extends Persona {
    String empresa;
    HashSet<Hijo> hijos;

    public Madre(){
        super();
        this.empresa = "";
        this.hijos = new HashSet<Hijo>();
    }
    public Madre(String nombrex, String apellidox, int edadx, int dnix, String ocupacionx, String empresax){
        super(nombrex,apellidox,edadx,dnix,"femenino",ocupacionx);
        this.empresa = empresax;
        this.hijos = new HashSet<Hijo>();
    }

    //GETTERS
    public String getEmpresa(){
        return this.empresa;
    }

    public HashSet<Hijo> getHijos(){
        return this.hijos;
    }

    //SETTERS
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setHijos(HashSet<Hijo> hijos) {
        this.hijos = hijos;
    }

    //METODOS
    public HashSet<Hijo> hijosMenores(){
        HashSet<Hijo> hijosMenores = new HashSet<Hijo>();
        for(Hijo hijo : hijos){
            if(!hijo.esMayorEdad()){
                hijosMenores.add(hijo);
            }
        }
        return hijosMenores;
    }
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Empresa: " + this.getEmpresa());
        System.out.println("Hijos:");
        for(Hijo hijo: this.getHijos()){
            System.out.println(hijo.getNombre());
        }

    }
}
