import com.google.gson.*;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){

        HashMap<String,Object> pieza = new HashMap<>();
        pieza.put("pieza","alfil");
        pieza.put("color","blanco");

        HashMap<String,Object> Json = new HashMap<>();
        Json.put("pieza",pieza);
        Json.put("ubicacion","C2");
        Json.put("movimiento","D3");
        Json.put("jugador","nahuel");

        String  jsonP = new Gson().toJson(Json);
        System.out.println(jsonP);
    }
}
