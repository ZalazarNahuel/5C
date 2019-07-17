import java.util.ArrayList;
import java.util.Stack;

public class Calculadora {

    private Programa programa;
    private Stack<Integer> pila = new Stack<Integer>();
    private ArrayList<Integer> memoriaInt = new ArrayList<Integer>();
    private ArrayList<String> memoriaString = new ArrayList<String>();

    public Calculadora(){

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

    public void ejecutarRutina(Rutina r1){
        for(int j=0;j<r1.getSizeInstrucciones();j++){
            Instruccion i1= r1.getInstrucciones(j);
            switch (i1.getNombreInstruccion()){
                case "PUSH":
                    pila.push(i1.getValor());
                    break;
                case "ADD":
                    if(pila.empty()==true){
                        pila.push(0);
                    }
                    else if(pila.size()>1){
                        int num= pila.pop() + pila.pop();
                        pila.push(num);
                    }
                    break;
                case"SUB":
                    if(pila.empty()==true){
                        pila.push(0);
                    }
                    else if(pila.size()>1){
                        int num1 = pila.pop();
                        int num2 = pila.pop();
                        pila.push(num2-num1);
                    }
                    break;
                case"MUL":
                    if(pila.empty()==true){
                        pila.push(0);
                    }
                    else if(pila.size()>1){
                        int num= pila.pop() * pila.pop();
                        pila.push(num);
                    }
                    break;
                case"WRITE":
                    if(pila.empty()==true){
                        memoriaInt.set(memoriaString.indexOf(i1.getVariable()),0);
                    }
                    else{
                        memoriaInt.set(memoriaString.indexOf(i1.getVariable()),pila.pop());
                    }
                    break;
                case"READ":
                    if(memoriaString.contains(i1.getVariable())==false){
                        pila.push(0);
                    }
                    else{
                        pila.push(memoriaInt.get(memoriaString.indexOf(i1.getVariable())));
                    }
                    break;
            }
        }
    }

    public void ejecutar(String nombreRutina){
        for(int i=0;i<this.getRutinasPrograma().size();i++){
            if(nombreRutina==this.getRutinaPrograma(i).getNombre()){

            }
        }
    }
}
