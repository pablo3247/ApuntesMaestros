package EstructurasDeDatos;

import java.io.*;
import java.util.*;

public class Anagrams {
    public static void main(String[] args) throws IOException {
        //Buscara grupos de al menos 15 palabras
        String res = anagrams(15);
        System.out.println(res);
    }
    public static String anagrams(int minGroupSize) throws IOException{
        StringBuffer sb = new StringBuffer();
        // Lee palabras de un archivo
        // Simula multimap (Una clave con múltiples valores)
        Map<String, List<String>> m = new HashMap<>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("/home/l.sabaterribes/Escritorio/spanish-dict.txt"));
            //BufferedReader Lee las palabras desde el archivo de texto.
            String word;
            while ((word = reader.readLine()) != null) {
                //convierte una cadena (String) en una versión "estandarizada"
                // donde sus caracteres están ordenados alfabéticamente
                String alpha = alphabetize(word); // Obtiene la forma ordenada alfabéticamente
                List<String> l = m.get(alpha); //l-->es una lista de palabras que son anagramas de la clave
                                               // Busca la lista correspondiente en el mapa
                if (l == null)
                    m.put(alpha, l = new ArrayList<>()); // Si no existe, crea una nueva lista
                l.add(word); // Si existe, añade la palabra
            }
        } catch (IOException e) {
            System.err.println(e); //Si ocurre un error al leer el archivo, imprime el error
            System.exit(1); // Termina el programa
        } finally {
            reader.close(); //Cierra correctamente el fichero al finalizar
        }

        // Imprime
        for (List<String> l : m.values())
            if (l.size() >= minGroupSize) //Si es mayor o igual que 15=minGroupSize, lo añade
                sb.append(l.size() + ": " + l + "\n");

        return sb.toString();
    }

    private static String alphabetize(String s) {
        char[] a = s.toCharArray();//Convierte a Array
        Arrays.sort(a); // Ordena los caracteres alfabéticamente
        return new String(a); // Convierte el Array ordenado en una cadena
    }
