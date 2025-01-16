import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TelefonosII {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> agenda = new HashMap<>();
        ArrayList<String> telefonos = new ArrayList<>();
        telefonos.add("667761");
        telefonos.add("+0034 44001");
        agenda.put("Pepe", telefonos);
        //telefonos = new ArrayList<>();
        telefonos.add("94884");
        telefonos.add("34535");
        agenda.put("Juan", telefonos);
        int a = 1;
    }
}
