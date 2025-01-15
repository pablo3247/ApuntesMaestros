## contar repeticiones de valores que pone el usuario(frequencia)

El usuario nos va a poner por el scanner varias palabras y al final imprimiremos las palabras junto al numero de veces que se repite

## Codigo 🦩

```
import java.util.HashMap;
import java.util.Scanner;

public class frequencia {
    public static void main(String[] args) {

        HashMap<String,Integer> frequencia = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        //Importante declara la string como " "  CON ESPCIO EN ENTRE LAS COMILLAS!
        String palabra=" ";

        Integer repeticion;

        //EL bucle se repite hasta que el scanner se ponga una linea en blanco ""
        while(palabra != ""){

            palabra = sc.nextLine();

            if(palabra != ""){

                //se le da al integer repeticion el valor que tenga la clave palabra,
                //como la primera vez esta vacia pues se ejecuta el if de que si es null
                repeticion = frequencia.get(palabra);
                //si es null se agrega la palabra y se le da el valor 1
                if(repeticion == null){

                    frequencia.put(palabra,1);

                }else {
                    //si ya existe la palabra repeticion tendra el valor 1 y pues le sumamos 1 porque se a repetido y asi sucesivamente

                    frequencia.put(palabra,repeticion+1);

                }

            }
        }

        //Imprimimos "bonito" el hashmap

        //Se pone frequencia.keySet() para que nos printee las claves, es decir las palabras
        for(String i: frequencia.keySet()){

            //i seran las palabras y ponemos frequencia.get(i)  para que nos de el valor de la palabra!
            System.out.println(i+" - "+frequencia.get(i));

        }

    }
}

```
