public class TelevisionCurvo extends Television{
    private int curvo;

    public TelevisionCurvo(int curvox){
        curvo = curvox;
    }
    public TelevisionCurvo(){
        this(2);
    }
    public TelevisionCurvo(int curvox, double preciox){
        this(curvox);
        super.setPrecio(preciox);
        
    }
}