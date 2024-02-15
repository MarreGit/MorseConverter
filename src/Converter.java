import java.util.HashMap;

public class Converter {
    private HashMap<String, String> engToMorse;
    private HashMap<String, String> morseToEng;
    public Converter(){
        engToMorse = new HashMap<>();
        engToMorse.put("A","*-");
        engToMorse.put("B", "-***");
        engToMorse.put("C", "-*-*");
        engToMorse.put("D", "-**");
        engToMorse.put("E", "*");

        morseToEng = new HashMap<>();
        morseToEng.put("*-","A");
        morseToEng.put("-***", "B");
    }
    public String getMorse(String eng) {
        return engToMorse.get(eng);
    }

    public String getEng(String morse) {
        return morseToEng.get(morse);
    }
}


