public class Main {
    public static void main(String[] args){


        Micro micro = new Micro(0,1,130);
        Jefe p1 = new Jefe("jose");
        Obsecuente p2 = new Obsecuente("pepito",p1);
        if(micro.subirPasajero(p1)){
            System.out.println("se subio ");
        }
        else{
            System.out.println("no se subio");
        }
        if(micro.subirPasajero(p2)){
            System.out.println("se subio ");
        }
        else{
            System.out.println("no se subio");
        }
        if(micro.getPrimero() == null){
            System.out.println("ta vacio");
        }
        else{
            System.out.println(micro.getPrimero().getNombre());
        }


    }
}
