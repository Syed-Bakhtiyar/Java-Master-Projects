package collections.map_intro;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "Object orientated");
        System.out.println(languages.get("Java"));
    }
}
