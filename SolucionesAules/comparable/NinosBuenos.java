import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Kid implements Comparable<Kid>{
    int bueno, pesoRegalo;
    Kid(int bueno, int pesoRegalo) {
        this.bueno = bueno;
        this.pesoRegalo = pesoRegalo;
    }
    public String toString() {
        return bueno + " " + pesoRegalo;
    }
    @Override
    public int compareTo(Kid other){
        if (this.bueno == other.bueno) return this.pesoRegalo - other.pesoRegalo;
        return other.bueno - this.bueno;
    }
}

public class NinosBuenos {

    private static String repartir(ArrayList<Kid> listaNinyos){
        Collections.sort(listaNinyos);
        StringBuilder orden = new StringBuilder();
        for (int i = listaNinyos.size() - 1; i >= 0; i--)
            orden.append(listaNinyos.get(i)).append("\n");
        return orden.toString();
    }

    public static void main(String[] args) {
        ArrayList<Kid> ninos = new ArrayList<>();
        ninos.add(new Kid(80, 2));
        ninos.add(new Kid(100, 12));
        ninos.add(new Kid(100, 1));
        System.out.println(repartir(ninos));
        ninos.clear();
        ninos.add(new Kid(1, 1));
        ninos.add(new Kid(1, 1));
        System.out.println(repartir(ninos));

        ninos.clear();
        ninos.add(new Kid(90, 100));
        ninos.add(new Kid(90, 80));
        ninos.add(new Kid(80, 100));
        ninos.add(new Kid(70, 90));
        ninos.add(new Kid(70, 80));

        System.out.println(repartir(ninos));
    }

    public static void mainAceptaElReto(String[] args) {

        final Scanner s = new Scanner(System.in);

        int ninyos;
        ArrayList<Kid> listaNinyos = new ArrayList<>();
        while (true) {

            ninyos = s.nextInt();
            if (ninyos == 0) break;

            for (int i = 0; i < ninyos; i++) {
                int b = s.nextInt();
                int p = s.nextInt();
                listaNinyos.add(new Kid(b, p));
            }

            Collections.sort(listaNinyos);

            for (int i = listaNinyos.size() - 1; i >= 0; i--)
                System.out.println(listaNinyos.get(i));

            listaNinyos.clear();
            System.out.println();
        }

    }

}
