## Clave con varios valores  (telefonos2)

EL metodo para almacenar varios valores bajo una misma clave es declarar como ArrayList<> el parametro de valores


```
HashMap<String, ArrayList<String>> agenda = new HashMap<>();
```

### Enunciado 

Queremos tener un guía de teléfonos que asocie varios o un numero a un contacto. El programa debe pedir un contacto y mostrar su número asociado

### Codigo comentado

```
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class telefonos2 {
    public static void main(String[] args) {
        //Creamos el HashMap
        HashMap<String, ArrayList<String>> agenda = new HashMap<>();

        //Creamos el arrayList donde iran los telefonos
        ArrayList<String> telefonos = new ArrayList<>();

        //agregamos los telefono al arrayList
        telefonos.add("123451");
        telefonos.add("654433");

        //AGREGAMOS el nombre y el array list(que tendra los numeros agregados anteriormente)
        agenda.put("Pepe",telefonos);

        // DESPUES de agregarlos, esta linea REINICIA DE 0 el arraylist(por lo que denuevo esta vacia)
        telefonos = new ArrayList<>();



        

        //Se repite el proceso de arriba para la otra clave (Manuel)

        telefonos.add("98767");
        telefonos.add("45463");
        telefonos.add("654433");

        agenda.put("Manuel",telefonos);

        telefonos = new ArrayList<>();





        //Se repite el proceso de arriba para la otra clave (Paco)

        telefonos.add("45463");
        agenda.put("Paco",telefonos);



        Scanner sc = new Scanner(System.in);

        String persona = sc.nextLine();

        System.out.println(agenda.get(persona));




    }
}

```


