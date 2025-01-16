import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Portales {

    public static void main(String[] args) {

        ArrayList<Integer> portales = new ArrayList<>(Arrays.asList(2, 4));
        System.out.println(repartir(0, portales));

        portales = new ArrayList<>((Arrays.asList(2, 5, 1)));
        System.out.println(repartir(3, portales));

        portales = new ArrayList<>((Arrays.asList(2, 4, 7)));
        System.out.println(repartir(3, portales));
    }
    private static int siguiente(ArrayList<Integer> portals, int desde){
        int diff, min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < portals.size(); i++) {
            //Calcular el mínimo desde el actual
            diff = Math.abs(portals.get(i) - desde);
            if (diff <= min ){
                min = diff;
                index = i;
            }
        }
        return portals.get(index);
    }
    public static String repartir(int aterriza, ArrayList<Integer> portales) {
        String result = "";
        int actual = aterriza;
        Collections.sort(portales);
        while (!portales.isEmpty()) {
            actual = siguiente(portales, actual);
            result += actual + " ";
            portales.remove(Integer.valueOf(actual));
        }
        return result;
    }

}
