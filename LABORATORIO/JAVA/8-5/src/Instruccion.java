public class Instruccion {




    private int valor=0;
    private String variable;
    private String nombreInstruccion;

    public  Instruccion(String instruccion){
        nombreInstruccion = instruccion;
        valor = 0;
        variable = "";
    }
    public  Instruccion(String instruccion, String variablex){
        nombreInstruccion = instruccion;
        variable= variablex;
        valor=0;
    }
    public  Instruccion(String instruccion, int valorx){
        nombreInstruccion = instruccion;
        valor= valorx;
        variable="";
    }

    public int getValor() {
        return valor;
    }
    public String getNombreInstruccion() {
        return nombreInstruccion;
    }
    public String getVariable(){
        return variable;
    }
}
