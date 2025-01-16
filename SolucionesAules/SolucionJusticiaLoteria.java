import java.util.*;

public class JusticiaLoteria {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int localidades;
        boolean justo;
        ArrayList<Localidad> listaLocalidades = new ArrayList<>();

        while (true) {
            //Pedimos número de tareas
            localidades = s.nextInt(); // Lee la cantidad de localidades
            if (localidades == 0) break; // Si es 0, termina el programa

            // Leer los datos de las localidades
            for (int i = 0; i < localidades; i++) {
                listaLocalidades.add(new Localidad(s.nextInt(), s.nextInt())); // Añade una localidad con los valores de invertido y ganado
            }

            // Verifica si el orden es justo
            justo = justicia(listaLocalidades);

            // Imprime el resultado
            System.out.println(justo ? "SI" : "NO");

            // Limpiar la lista para el siguiente conjunto de localidades
            listaLocalidades.clear();
        }

        s.close(); // Cierra el scanner
    }
    // Método que verifica si el orden de las localidades es justo.
    private static boolean justicia(ArrayList<Localidad> listaLocalidades) {
        boolean justo = true;
        Collections.sort(listaLocalidades);

        for (int i = 0; i < listaLocalidades.size() - 1; i++) {
            Localidad actual = listaLocalidades.get(i);
            Localidad next = listaLocalidades.get(i + 1);
            if (actual.invertido == next.invertido)
                // Si ha invertido lo mismo que el siguiente, debe haber ganado más o lo mismo que el siguiente
                justo = actual.ganado >= next.ganado;
            else // Como ha invertido más (está ordenado de mayor a menor) debe haber ganado más
                justo = actual.ganado > next.ganado;
            if (!justo) break;
        }
        return justo;
    }
}
class Localidad implements Comparable<Localidad> {
    int invertido, ganado;

    Localidad(int invertido, int ganado) {
        this.invertido = invertido;
        this.ganado = ganado;
    }
    @Override
    public String toString() {
        return invertido + " " + ganado;
    }
    //compareTo se utiliza automáticamente cuando se llama a la función Collections.sort()
    @Override
    public int compareTo(Localidad other) {
        if (this.invertido == other.invertido) return other.ganado - this.ganado;
        return other.invertido - this.invertido;
    }
}
