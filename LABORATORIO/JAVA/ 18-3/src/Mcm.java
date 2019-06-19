public class Mcm {

    private int num1;
    private int num2;

    public Mcm(int numero1, int numero2){
        this.num1=numero1;
        this.num2=numero2;
    }
    public Mcm(){
        this.num1=0;
        this.num2=0;
    }

    public int getNum1() {
        return this.num1;
    }
    public int getNum2() {
        return this.num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int numMayor(){
        if(this.num1>this.num2){
            return this.num1;
        }
        else{
            return this.num2;
        }
    }

    public int numeroMCM(){
        boolean encontrar=true;
        int numeroX=1;
        int multiplo=0;
        while(encontrar){
            multiplo=this.numMayor()*numeroX;
            if(multiplo%this.getNum1()==0 && multiplo%this.getNum2()==0){
                encontrar=false;
            }
            else{
                numeroX++;
            }
        }
        return multiplo;
    }
}
