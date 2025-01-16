import java.util.*;

public class Frequency {

    public static String frequency(String[] words){
        Map<String, Integer> mapa = new HashMap<String, Integer>();
        Integer freq;

        for(String word : words) {
            freq = mapa.get(word);
            mapa.put(word, (freq == null) ? 1 : freq + 1);
            /*
            La sentencia de arriba se llama operador ternario y equivale al siguiente if..else
            if (freq == null)
                mapa.put(word, 1);
            else
                mapa.put(word, freq + 1);
            */
        }
        return mapa.toString();
    }
    public static void main(String[] args) {
        System.out.println(frequency(new String[]{"uno", "dos"}));
        System.out.println(frequency(new String[]{"uno", "dos", "tres", "dos", "tres", "tres"}));

    }
}
