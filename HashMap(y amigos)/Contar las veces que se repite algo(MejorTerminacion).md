## Contar las veces que se repite algo(MejorTerminacion)


Pues vamos a contar las veces que se repite algo, en este caso el numero final de los boletos de loteria.

Vamos a tener varios boletos y su ultimo digito lo agregaremos a un hashmap como clave y como valor tendremos las veces que se repiten


## Codigo ☣️
```
import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.HashMap;

public class mejorTerminacion {
    public static void main(String[] args) {

        HashMap<String,Integer> repeticiones = new HashMap<>();


        ArrayList<String> boletos = new ArrayList<>();


        boletos.add("00004");
        boletos.add("03847");
        boletos.add("39804");

        String terminacion;

        Integer frequencia;


        //Recorremos los boletos
        for (String i:boletos){

            //Nos guardamos el ultimo digito de los boletos
            terminacion = String.valueOf(i.charAt(i.length()-1));


            //esta linea da el valor a frequncia que tenga en este momento la clave que sea igual a la vairable terminacion
            
            frequencia = repeticiones.get(terminacion);

            //COmo la primera vez el hashMap repeticiones esta VACIO pues frequencia tendra el valor null, si lo tiene pues se agregara la terminacion con el valor 1
            if(frequencia== null){

                repeticiones.put(terminacion,1);

            }
            //si se vuelve a repetir la misma terminacion frequencia tendra el valor 1 y se le sumara 1 mas, por cada vez que se repita
            else {
                repeticiones.put(terminacion,frequencia+1);
            }

        }


        System.out.println(repeticiones);

    }
}
````



