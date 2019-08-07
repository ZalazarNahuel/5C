public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    public Horario(){
        hora=0;
        minuto=0;
        segundo=0;
    }
    public Horario(int horaX, int minutoX, int segundoX){
        hora = horaX;
        minuto = minutoX;
        segundo = segundoX;
    }

    public int getHora(){
        return this.hora;
    }
    public int getMinuto(){
        return this.minuto;
    }
    public int getSegundo(){
        return this.segundo;
    }
    public void setHora(int horaX){
        this.hora= horaX;
    }
    public void setMinuto(int minutoX){
        this.minuto= minutoX;
    }
    public void setSegundo(int segundoX){
        this.segundo= segundoX;
    }
    public boolean HorarioEsMenor(Horario h2){
        boolean esMenor=true;
        if(this.getHora() < h2.getHora()){
            esMenor = true;
        }
        else if(this.getHora() > h2.getHora()){
            esMenor = false;
        }
        else if(this.getHora()==h2.getHora()){
            if(this.getMinuto()<h2.getMinuto()){
                esMenor = true;
            }
            else if (this.getMinuto()==h2.getMinuto()){
                if(this.getSegundo()<h2.getSegundo()){
                    esMenor = true;
                }
                else{
                    esMenor = false;
                }
            }
            else{
                esMenor = false;
            }
        }
        return esMenor;
    }
    public boolean HorarioEsIgual(Horario h2){
        boolean EsIgual = this.getHora() == h2.getHora() && this.getMinuto() == h2.getSegundo() && this.getSegundo() == h2.getSegundo();
        return EsIgual;
    }
}
