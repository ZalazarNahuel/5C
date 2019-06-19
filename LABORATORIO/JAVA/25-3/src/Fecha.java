public class Fecha {
    private int dia;
    private int mes;
    private int ano;

    public Fecha(){
        dia=0;
        mes=0;
        ano=0;
    }
    public Fecha(int diaX, int mesX,int anoX){
        dia=diaX;
        mes=mesX;
        ano=anoX;
    }

    public int getDia(){
        return this.dia;
    }
    public int getMes(){
        return this.mes;
    }
    public int getAno(){
        return this.ano;
    }

    public void setAno(int anoX) {
        this.ano = anoX;
    }
    public void setMes(int mesX) {
        this.mes = mesX;
    }
    public void setDia(int diaX) {
        this.dia = diaX;
    }

    public void agregoDias(int dias){
        this.dia = this.getDia()+dias;
    }
    public void agregoMes(int meses){
        this.mes = this.getMes()+meses;
    }
    public void agregoAno(int anos){
        this.ano = this.getAno()+anos;
    }
    public int diferenciaDeDias(Fecha f2){
        if(this.getDia()>f2.getDia()){
            return this.getDia()-f2.getDia();
        }
        else{
            return f2.getDia()-this.getDia();
        }
    }
    public boolean sonDistintos(Fecha f2){
        boolean loSon = this.getAno() != f2.getAno() || this.getDia() != f2.getDia() || this.getMes() != f2.getMes();
        return loSon;
    }
    public boolean anteriorALaOtra(Fecha f2){
        if(this.getAno()<f2.getAno()){
            return true;
        }
        else if(this.getAno()==f2.getAno()){
            if(this.getMes()<f2.getMes()){
                return true;
            }
            else if (this.getMes()==f2.getMes()){
                if(this.getDia()<f2.getDia()){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

}
