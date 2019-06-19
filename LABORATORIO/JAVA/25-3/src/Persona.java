public class Persona {


    private String nombre;
    private int edad;
    private int dni;
    private int telefono;
    private String direccion;

    public Persona(){
        nombre="";
        edad=0;
        dni=0;
        telefono=0;
        direccion="";
    }

    public  Persona(String nombreX){
        nombre=nombreX;
        edad=65;
        dni=33776457;
        telefono=45730405;
        direccion="Condarco 2155";
    }
    public Persona(String nombreX,int edadX,int dniX, int telefonoX,String direccionX){
        nombre=nombreX;
        edad=edadX;
        dni=dniX;
        telefono=telefonoX;
        direccion=direccionX;
    }

    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public int getDni(){
        return this.dni;
    }
    public int getTelefono(){
        return this.telefono;
    }
    public String getDireccion(){
        return this.direccion;
    }

    public void setNombre(String nombreX){
        this.nombre=nombreX;
    }
    public void setEdad(int edadX){
        this.edad=edadX;
    }
    public void setDni(int dniX){
        this.dni=dniX;
    }
    public void setTelefono(int telefonoX){
        this.telefono=telefonoX;
    }
    public void setDireccion(String direccionX){
        this.direccion=direccionX;
    }

    public boolean esMayorDeEdad(){
        boolean esMayor = this.getEdad()>=18;
        return esMayor;
    }
    public boolean sonLaMismaPersona(Persona ps2){
        boolean sonLaMisma = this.getNombre() == ps2.getNombre() && this.getEdad()==ps2.getEdad() && this.getDni()==ps2.getDni() && this.getDireccion()==ps2.getDireccion() && this.getTelefono()==ps2.getTelefono();
        return sonLaMisma;
    }
    public boolean tienenLaMismaEdad(Persona ps2){
        boolean EdadIgual = this.getEdad() == ps2.getEdad();
        return EdadIgual;
    }
    public boolean tienenElMismoNombre(Persona ps2){
        boolean NombreIgual = this.getNombre() == ps2.getNombre();
        return NombreIgual;
    }
    public boolean TelefonoIgual(Persona ps2){
        boolean TelefonoIgual = this.getTelefono() == ps2.getTelefono();
        return TelefonoIgual;
    }
}
