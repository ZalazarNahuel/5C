package microsEnum;

public enum Empleado {
    APURADO, CLAUSTROFOBICO, FIACA, MODERADO(7), OBSECUENTE(FIACA);

    private int lugaresRequeridos;
    private Empleado tipoDeJefe;

    private Empleado() {
    }

    private Empleado(int lugaresRequeridos) {
        this.lugaresRequeridos = lugaresRequeridos;
    }

    private Empleado(Empleado tipoDeJefe) {
        this.tipoDeJefe = tipoDeJefe;
    }

    public int getLugaresRequeridos() {
        return lugaresRequeridos;
    }

    public Empleado getTipoDeJefe() {
        return tipoDeJefe;
    }

    public void setLugaresRequeridos(int lugaresRequeridos){
        this.lugaresRequeridos = lugaresRequeridos;
    }

    public void setTipoDeJefe(Empleado tipoDeJefe){
        this.tipoDeJefe = tipoDeJefe;
    }
}
