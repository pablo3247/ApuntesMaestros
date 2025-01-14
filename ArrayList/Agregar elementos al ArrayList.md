## Vamos a agregar los elementos que nos va a escribir la persona que ejecute el programa y luego los vamos imprimir por pantalla!
### Enunciado

Realiza un programa que permita al usuario añadir marcas de coches mediante la consola. Si escribe una línea en blanco, se acabará de añadir marcas.

Al final debe imprimirlas ordenadas en líneas separadas
***
### Codigo Explicado :)
```
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class coches {
    public static void main(String[] args) {

        //Pues abrimos el scanner!
        Scanner sc = new Scanner(System.in);

        //Creamos el arrayList como vamos  a almacenar marcas de coches (PALABRAS) pues le ponemos <String>
        ArrayList<String> marcasCoche = new ArrayList<>();

        //Creamos la variable donde pondremos las marcas.
        String marca=" ";

        while (marca != ""){
            marca = sc.nextLine();

            if(marca != ""){
                
                //METEMOS las marcas que entran por el escaner al ARRAYLIST
                marcasCoche.add(marca);

            }

        }

        //Esta funcion ORDENA (alfabeticamente, creo... xD) los valores guardados en el ArrayList
        Collections.sort(marcasCoche);


        //Esto es un for each; pues esto nos printea los valores que hay dentro del array list marcasCoche
        
        //Se pone for(String i :"Nombre del array" )  y despues de los ":" el nombre del arrayList.( Se pone "String i" porque pues es una array de tipo String)
        for(String i:marcasCoche){
            System.out.println(i);
        }




    }
}
```


