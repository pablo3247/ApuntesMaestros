## Vamos a repartir los elementos de un array list entre varios "piratas" podremos elegir entre cuantos.

## Codigo 🏴‍☠️

```
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class botin {
    public static void main(String[] args) {

        HashMap<Integer, ArrayList<String>> reparto = new HashMap<>();

        //agregamos los billetes a repartir!
        ArrayList<String> billetes = new ArrayList<>();
        billetes.add("50");
        billetes.add("20");
        billetes.add("100");
        billetes.add("200");
        billetes.add("500");
        billetes.add("10");
        billetes.add("50");

        //En este array guardaremos solo billetes que le tocan a cada uno
        ArrayList<String> repartidos = new ArrayList<>();

        //Declaramos la gente entre la que ser reparte los billetes
        int piratas = 3;

        //Recorremos los piratas
        for (int i = 0; i < piratas; i++) {

            //Para cada pirata (i) se recorre los billetes segun la cantidad de piratas (j=j+piratas) En este caso el pirata 0 tendra el billete 0,3,6(indicee del array billetes)
            for (int j = i; j < billetes.size(); j=j+piratas) {

                repartidos.add(billetes.get(j));
            }
            // Se añade el numero del pirata (i)  y el array donde se han guardado los billetes que le toca
            reparto.put(i,repartidos);

            //se reinicia el array donde guardamos los billetes de cada pirata, para guardar los del proximo pirata,
            repartidos = new ArrayList<>();

        }


        System.out.println(reparto);


    }
}

```
