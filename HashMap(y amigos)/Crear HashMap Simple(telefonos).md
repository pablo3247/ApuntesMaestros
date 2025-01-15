## Vamos a crear un hashmap simple, la clave sera un pais y el value que pondremos sera la capital

### Enunciado
Declara un HashMap que almacene el país y la capital de varios países Europeos. Luego realiza un programa que pida un País al usuario y muestre su capital.

## Codigo comentado ;)

```
import java.util.HashMap;
import java.util.Scanner;

public class paisCapital {
    public static void main(String[] args) {

        //Creamos el hashmap porque <String,Strin> vamos a almacenar palabras (Pais,Capital)
        HashMap<String,String> paisCapital = new HashMap<>();

        //Agregamos (Clave, valor) es decir la (key, value)
        paisCapital.put("España","Madrid");
        paisCapital.put("Francia","Paris");
        paisCapital.put("Alemania","Berlin");

        //Creamos el scanner
        Scanner sc = new Scanner(System.in);

        //Variable para guardar lo que pongan en el scanner
        String pais;
        System.out.println("Dime un pais!");
        pais = sc.nextLine();

        //       paisCapital.get(pais)  Nos devuelve el valor que tenga la clave que le pongamos ej: (España) nos devolvera Madrid
        //                              Le ponemos (pais) porque ahi se pondra el pais que ponga la persona en el scanner

        System.out.println(paisCapital.get(pais));

        
    }
}

```
