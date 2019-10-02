public abstract class  Empleado {
    int sueldoBasico;
    int valorAportes;
    int eleccion;
    public Empleado(int aportesx,int eleccionx){
        sueldoBasico = 25000;
        valorAportes = aportesx;
        eleccion = eleccionx;
    }
    public int getSueldoBasico(){
        return this.sueldoBasico;
    }
    public int getValorAportes(){
        return this.valorAportes;
    }

    public int getEleccion() {
        return eleccion;
    }

    public  int calcularSueldo(){
        int sueldo = getSueldoBasico()+getEleccion()-getValorAportes();
        return sueldo;
    }
}
