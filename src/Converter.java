import java.util.HashMap;

public class Converter {
    HashMap<String, String> engToMorse;
    public Converter(){
        engToMorse = new HashMap<>();
        engToMorse.put("A","*-");
        engToMorse.put("B", "-***");
        engToMorse.put("C", "-*-*");
        engToMorse.put("D", "-**");
        engToMorse.put("E", "*");
    }
    public String getMorse(String eng) {
        return engToMorse.get(eng);
    }
}


