public class Persona {
    private  String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private String sexo;
    private String ocupacion;

    public Persona(String nombrex, String apellidox, int edadx, int dnix, String sexox, String ocupacionx){
        this.nombre = nombrex;
        this.apellido = apellidox;
        this.edad = edadx;
        this.dni = dnix;
        this.sexo = sexox;
        this.ocupacion = ocupacionx;
    }
    public Persona(){
        this("","",0,0,"","");
    }

    // GETTERS
    public String getNombre(){
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getDni() {
        return dni;
    }

    public String getApellido() {
        return apellido;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public String getSexo() {
        return sexo;
    }

    //SETTERS
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //METODOS
    public boolean esMayorEdad(){
        if(this.getEdad()>=18) return true;
        return false;
    }

    public boolean nombreContieneA(){
        if(this.getNombre().contains("a") || this.getNombre().contains("A")) return true;
        return false;
    }

    public boolean dniMayor38Millones(){
        if (this.getDni()>38000000) return true;
        return false;
    }

    public void imprimirDatos(){
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Apellido: " + this.getApellido());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Dni: " + this.getDni());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Ocupacion: " + this.getOcupacion());

    }
}
