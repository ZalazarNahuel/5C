import java.util.ArrayList;
import java.util.Stack;

public class Calculadora {

    private Programa programa;
    private Stack<Integer> pila ;
    private ArrayList<Integer> memoriaInt ;
    private ArrayList<String> memoriaString ;

    public Calculadora(){
        programa = new Programa();
        pila = new Stack<Integer>();
        memoriaInt = new ArrayList<Integer>();
        memoriaString = new ArrayList<String>();
    }

    public void addMemoria(String nombre, int valor){
        memoriaInt.add(valor);
        memoriaString.add(nombre);
    }

    public void getMemoriaString(){
        for(int i=0;i<memoriaString.size();i++){
            System.out.println(memoriaString.get(i));
        }
    }
    public void getMemoriaInt(){
        for(int i=0;i<memoriaInt.size();i++){
            System.out.println(memoriaInt.get(i));
        }
    }
    public int getPilaUltimo(){
        return pila.peek();

    }
    public int getValor(String variable){
        int pos=0;
        for(int i = 0;i < memoriaString.size();i++){
            if(variable == memoriaString.get(i)){
                pos=i;
            }
        }
        return memoriaInt.get(pos);
    }
    public Programa getPrograma(){
        return this.programa;
    }
    public ArrayList<Rutina> getRutinasPrograma(){
        return this.getPrograma().getRutinas();
    }

    public void cargarPrograma(Programa p1){
        this.programa = p1;
    }

    public Rutina getRutinaPrograma(int i){
        return this.getRutinasPrograma().get(i);
    }

    public void push(Instruccion i1){
        pila.push(i1.getValor());
    }
    public void add(){
        if(pila.empty()==true){
            pila.push(0);
        }
        else if(pila.size()>1){
            int num= pila.pop() + pila.pop();
            pila.push(num);
        }
    }
    public void sub(){
        if(pila.empty()==true){
            pila.push(0);
        }
        else if(pila.size()>1){
            int num1 = pila.pop();
            int num2 = pila.pop();
            pila.push(num2-num1);
        }
    }

    public void mul(){
        if(pila.empty()==true){
            pila.push(0);
        }
        else if(pila.size()>1){
            int num= pila.pop() * pila.pop();
            pila.push(num);
        }
    }

    public void write(Instruccion i1){
        if(pila.empty()==true){
            memoriaInt.set(memoriaString.indexOf(i1.getVariable()),0);
        }
        else{
            memoriaInt.set(memoriaString.indexOf(i1.getVariable()),pila.pop());
        }
    }

    public void read(Instruccion i1){
        if(memoriaString.contains(i1.getVariable())==false){
            pila.push(0);
        }
        else{
            pila.push(memoriaInt.get(memoriaString.indexOf(i1.getVariable())));
        }
    }

    public void ejecutarInstruccion(Instruccion i1){
        switch (i1.getNombreInstruccion()){
            case "PUSH":
                this.push(i1);
                break;
            case "ADD":
                this.add();
                break;
            case"SUB":
                this.sub();
                break;
            case"MUL":
                this.mul();
                break;
            case"WRITE":
                this.write(i1);
                break;
            case"READ":
                this.read(i1);
                break;
        }
    }

    public void ejecutarRutina(Rutina r1){
        for(int i=0;i<r1.getSizeInstrucciones();i++){
            ejecutarInstruccion(r1.getInstrucciones(i));
        }
    }

    public void ejecutar(String nombreRutina){
        for(int i=0;i<this.getRutinasPrograma().size();i++){
            if(nombreRutina==this.getRutinaPrograma(i).getNombre()){
                this.ejecutarRutina(this.getRutinaPrograma(i));
            }
        }
    }
}
