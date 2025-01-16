package EstructurasDeDatos;
import java.io.*;
import java.util.*;

public class CountCountries {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Map<String, Integer> paises = countCountries();
        //getOrDefault--> Si España no esta en la lista devuelve -1, esto evita los null
        System.out.println(countCountries().getOrDefault("España", -1));
    }
    /* Main con control de errores
    public static void main(String[] args) {
    try {
        Map<String, Integer> paises = countCountries();
        System.out.println(countCountries().getOrDefault("España", -1));
    } catch (IOException e) {
        System.err.println("Error al procesar el archivo de países: " + e.getMessage());
    }
    */
    public static Map<String, Integer> countCountries() throws IOException{
        Map<String, Integer> map = new HashMap<String, Integer>();

        BufferedReader reader = new BufferedReader(new FileReader("/home/l.sabaterribes/Escritorio/Colfuturo-Seleccionados.csv"));
        String line;
        String[] separarLinea; //String para separar la linea de texto en varias partes
        StringBuffer sb = new StringBuffer();
        line = reader.readLine();
        while ((line = reader.readLine()) != null) {
            separarLinea = line.split(","); //Separa la linea de texto en varias partes
            //el 7º del csv guarda el país del alumno
            Integer freq = map.get(separarLinea[6]);
            //Aumentamos en uno la frecuencia
            map.put(separarLinea[6], freq == null ? 1 : freq + 1);
        }
        reader.close();//Cierra correctamente el fichero al finalizar
        return map;
    }
}
