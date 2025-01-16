import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

class Pais implements Comparable<Pais>{
    private String pais;
    private int analfabetos;

    Pais(String pais, int analfabetos) {
        this.pais = pais;
        this.analfabetos = analfabetos;
    }

    public int getAnalfabetos() {
        return analfabetos;
    }

    public void setAnalfabetos(int analfabetos) {
        this.analfabetos = analfabetos;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString(){
        return this.pais + " - " + this.analfabetos;
    }
    @Override
    public int compareTo(Pais other){
        return other.getAnalfabetos() - this.analfabetos;
    }
}
public class Ejercicio {
    public static void main(String[] args) throws IOException {
        ArrayList<Pais> paises = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("files/illiterate.csv"));
        String linea;
        String[] datos;
        br.readLine();
        while((linea = br.readLine()) != null){
            datos = linea.split(",");
            paises.add(new Pais(datos[5], Integer.parseInt(datos[8])));
        }

    }
}
