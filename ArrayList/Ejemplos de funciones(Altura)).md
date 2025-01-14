## Altura

### Enunciado

Programa Java que pida por teclado las alturas de N alumnos de una clase y las guarde en un ArrayList de tipo Double.

A continuación el programa calculará la altura media de todos los alumnos, cuántos alumnos hay más altos que la media y cuantos más bajos. Para resolverlo vamos a utilizar 6 métodos además del método main:

    Método numeroAlumnos(): este método pide por teclado el número de alumnos de la clase y devuelve dicho número al programa principal.

    Método leerAlturas(): pide por teclado las alturas de los N alumnos y las almacena en el ArrayList. Este método recibe como parámetros el ArrayList inicialmente vacío y el número de alumnos a leer.
    
    Método calcularMedia(): calcula y devuelve la media de los alumnos de la clase. Este método recibe como parámetro el ArrayList con las alturas de todos los alumnos.
     
    Método calcularAlumnosAlturaSuperior: Este método recibe como parámetro el ArrayList con las alturas de todos los alumnos y devuelve el número de alumnos con una altura superior a la media
  
    Método calcularAlumnosAlturaInferior: Este método recibe como parámetro el ArrayList con las alturas de todos los alumnos y devuelve el número de alumnos con una altura inferior a la media
  
    Método mostrarResultados(): muestra por pantalla todas las alturas y calcula y muestra el número de alumnos con altura superior e inferior a la media. Recibe como parámetros el ArrayList con las alturas de todos los alumnos y la media calculada anteriormente.

***

### Codigo comentado :D

```
import java.util.ArrayList;
import java.util.Scanner;

public class altura {
    public static void main(String[] args) {

        ArrayList<Double> alturas = new ArrayList<>();

        //INVOCAMOS a esta funcion y le metemos lo que nos pide!
        mostrarResultados(leerAlturas(alturas,numeroAlumnos()),calcularMedia(alturas));

    }

        public static int numeroAlumnos(){
            //Se abre un scanner
            Scanner sc = new Scanner(System.in);
            // se pide y devuelve el numero  que se haya escrito en el escanner!
            System.out.println("Dime cuantos alumnos hay!");
            return sc.nextInt();
        }

        //Este metodo devuelve una arraylist con datos y recibe una arrayLista vacia y la cantidad de alumnos
        public static ArrayList<Double> leerAlturas(ArrayList<Double> alturas,int alumnos){

            Scanner sc = new Scanner(System.in);
        // bucle for que se repetira tantas veces como haya "alumnos"

            for (int i = 0; i < alumnos; i++) {
                //Agrega a la lista los datos que el usuario ponga en el scanner!
                System.out.println("Dime su altura!");
                alturas.add(sc.nextDouble());
            }
            //Devuelve el arrayList lleno con los datos
            return alturas;
        }

        //Este metodo devuelve la media con una variable Double y recibe el array list con todas las alturas!
        public static Double calcularMedia(ArrayList<Double> alturas){
        //Declaramos variable donde guardaremos la suma de todas las alturas
                        //Al declarar un Double se pone una D despues del numero ej: 0D
            Double suma=0D;

        //recorremos el arraylist
            for(Double i:alturas){
                //Guardamos i en summa y luego sumamos "suma" con el resto de i y esto se repite en bucle.
                suma = i+suma;
            }

            //Devolvemos la media que se sca al dividir la suma de alturas con la cantidad de alturas.
            return suma/alturas.size();
        }


        public static int calcularAlumnosAlturaSuperior(ArrayList<Double> altura, Double media){
        int contador=0;
            for(Double i:altura){

                if(i> media){
                    contador++;
                }
            }
            return contador;

        }
    public static int calcularAlumnosAlturaInferior(ArrayList<Double> altura, Double media){
        int contador=0;
        for(Double i:altura){

            if(i< media){
                contador++;
            }
        }
        return contador;

    }
    //esta recibe el array list y la media y printea los resultados.
    public static void mostrarResultados(ArrayList<Double> altura, Double media){

        //Mostrar todas las alturas

        for(Double i: altura){
            System.out.print(i+", ");
        }

        System.out.println();
        System.out.println("Hay "+calcularAlumnosAlturaSuperior(altura,media) +" alumnos altos!");

        System.out.println("Hay "+calcularAlumnosAlturaInferior(altura,media) +" alumnos bajos!");


    }


}

```



