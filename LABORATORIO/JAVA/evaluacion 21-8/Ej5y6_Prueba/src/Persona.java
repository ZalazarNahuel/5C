public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private String sexo;
    private String ocupacion;



    public Persona(String nom, String ape, int edadx, int dnix, String sex, String ocu){

        this.nombre = nom;
        this.apellido = ape;
        this.edad = edadx;
        this.sexo = sex;
        this.ocupacion = ocu;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    boolean Mayor(edad){

        boolean mayoredad = edad;

        if(edad >= 18){

            mayoredad = true;
            return mayoredad;

        }

        else{

            return mayoredad;

        }

    }

    boolean ContieneA(nombre){

        boolean a = false;

        if(nombre.contains("a")){

            a= true;
            return a;

        }

        else{

            return a;

        }

    }

    boolean MenoraTOM(dni){

        boolean tom = false;

        if(dni < 38000000){

            tom = true;
            return tom;

        }

        else{

            return tom;

        }

    }


}




