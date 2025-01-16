import java.util.*;

/**
 * @author Rubén Saiz
 * 23/10/2019
 */

class Localidad implements Comparable<Localidad>{
    int invertido, ganado;
    Localidad(int invertido, int ganado){
        this.invertido = invertido;
        this.ganado = ganado;
    }
    public String toString() {
        return invertido + " " + ganado;
    }
    @Override
    public int compareTo(Localidad other){
        if (this.invertido == other.invertido) return other.ganado - this.ganado;
        return other.invertido - this.invertido;
    }
}

public class JusticiaLoteria {

    private static boolean justicia(ArrayList<Localidad> listaLocalidades){
        boolean justo = true;

        Collections.sort(listaLocalidades);

        for (int i = 0; i < listaLocalidades.size() - 1; i++) {
            Localidad actual = listaLocalidades.get(i);
            Localidad next   = listaLocalidades.get(i + 1);
            if (actual.invertido == next.invertido)
                //Si ha invertido lo mismo que el siguiente, debe haber ganado más o lo mismo que el siguiente
                justo = actual.ganado >= next.ganado;
            else //Como ha invertido más (está ordenado de mayor a menor) debe haber ganado más
                justo = actual.ganado > next.ganado;
            if (!justo) break;
        }
        return justo;
    }
    public static void main(String[] args) {

        ArrayList<Localidad> localidades = new ArrayList<>();
        localidades.add(new Localidad(9, 4));
        localidades.add(new Localidad(10, 6));
        localidades.add(new Localidad(9, 5));
        localidades.add(new Localidad(1, 3));
        if (justicia(localidades))
            System.out.println("SÍ");
        else
            System.out.println("NO");

        localidades = new ArrayList<>();
        localidades.add(new Localidad(10, 5));
        localidades.add(new Localidad(20, 5));
        localidades.add(new Localidad(30, 5));
        if (justicia(localidades))
            System.out.println("SÍ");
        else
            System.out.println("NO");


   }

    public static void mainAceptaElReto(String[] args) {

        Scanner s = new Scanner(System.in);

        int localidades;
        boolean justo;
        ArrayList<Localidad> listaLocalidades = new ArrayList<>();
       
        while (true) {

            localidades = s.nextInt();
            if (localidades == 0) break;

            justo = true;
            for (int i = 0; i < localidades; i++)
                listaLocalidades.add(new Localidad(s.nextInt(), s.nextInt()));

            Collections.sort(listaLocalidades);

            for (int i = 0; i < listaLocalidades.size() - 1 && justo; i++) {
                Localidad actual = listaLocalidades.get(i);
                Localidad next   = listaLocalidades.get(i + 1);
                if (actual.invertido == next.invertido)
                    justo = actual.ganado >= next.ganado;
                else
                    justo = actual.ganado > next.ganado;
            }

            listaLocalidades.clear();
            System.out.println( (justo) ? "SI" : "NO" );
        }

    }

}
