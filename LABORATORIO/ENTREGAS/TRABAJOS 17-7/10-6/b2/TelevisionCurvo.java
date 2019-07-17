public class TelevisionCurvo extends Television{
    private int curvo;

    public TelevisionCurvo(int curvox){
        curvo = curvox;
    }
    public TelevisionCurvo(){

    }
    public TelevisionCurvo(int curvox, double preciox){
        this(curvox);
        super.setPrecio(preciox);
        
    }
}