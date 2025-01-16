import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Objeto implements Comparable<Objeto> {
    String nombre;
    int valor;
    int peso;
    int id;

    public Objeto(int id, String nombre, int valor, int peso) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
        this.peso = peso;
    }

    public int compareTo(Objeto other) {
        //Todo igual, va el sacado antes (cuyo id sea menor)
        if ((this.valor == other.valor) && (this.peso == other.peso)) return (this.id - other.id);
        //Lo ordeno por valor de mayor a menor
        if (this.valor != other.valor) return other.valor - this.valor;
        //Lo ordeno por peso de menor a mayor
        return (this.peso - other.peso);
    }
}

public class Tutankamon {
    private static String ordenar(List<Objeto> objetos){
        StringBuilder sb = new StringBuilder();
        Collections.sort(objetos);
        for (Objeto objeto : objetos) {
            sb.append(objeto.nombre).append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        List<Objeto> inventario = new ArrayList<>();
        int indice = 0;
        inventario.add(new Objeto(indice++, "flecha", 5, 1));
        inventario.add(new Objeto(indice++, "sandalias", 10, 2));
        inventario.add(new Objeto(indice++, "sarcofago", 1000, 1000));
        inventario.add(new Objeto(indice++, "mascara", 1000, 10));
        inventario.add(new Objeto(indice++, "arco", 10, 2));
        System.out.println(ordenar(inventario));
    }

    public static void mainAceptaElReto(String[] args) {

        Scanner s = new Scanner(System.in);
        List<Objeto> l;
        while (true) {
            l = new ArrayList<Objeto>();
            int i = 0;
            int c = s.nextInt();
            if (c == 0) break;
            s.nextLine();
            for (int k = 0; k < c; k++) {
                String nombre = s.next();
                int valor = s.nextInt();
                int peso = s.nextInt();
                s.nextLine();
                l.add(new Objeto(i++, nombre, valor, peso));
            }
            Collections.sort(l);

            for (int j = 0; j < l.size(); j++) {
                System.out.print(l.get(j).nombre);
                if (j != l.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        s.close();

    }
}