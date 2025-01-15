## Repartir regalos

### Enunciado 

Un gordo quiere repartir juguetes a todos los niños de la mejor calle del mundo: la tuya. Para ello, consulta una lista de los portales de esa calle en los que debe dejar regalos.

La forma en la que reparte los regalos es peculiar. Aterriza con su trineo en un portal determinado (que no tiene por qué ser uno en los que tiene que dar regalos), y luego sigue las siguientes reglas:

    Reparte los regalos al portal que tiene más cerca de su posición actual.
    La distancia entre dos portales es el valor absoluto de su resta. Es decir, la distancia entre el portal 10 y el portal 8 es 2 (10 − 8 = 2), lo mismo que la distancia entre el portal 8 y el portal 10 (valor absoluto de 8 − 10).
    Si dos portales están a igual distancia, siempre va hacia el que tiene el número más grande.

¿Cuál es el orden en el que visita los portales?

***

### Codigo comentado :v

```
import java.util.ArrayList;

public class repartiendoRegalos {
    public static void main(String[] args) {

        //Creamos un arrayList de numeros enteros

        ArrayList<Integer> portales = new ArrayList<>();

        //Este seria el portal inicial(donde no repaerte regalo)
        int portalInicial =3;

        //Agregamos al array los portales que visita!
        portales.add(2);
        portales.add(4);
        portales.add(7);



        // le damos el valor a aterriza donde "aterriza al inicio"
        int aterriza = portalInicial;

        //Bucle para recorrer el array list
        for (int i = 0; i < portales.size()-1; i++) {

                //Medimos la distancia entre el portal donde aterriza y el siguiente
                int distancia1 = aterriza - portales.get(i); //La primera vez i seria 2
            //Medimos la distancia entre el portal donde aterriza y el siguiente del siguiente

                int distancia2 = aterriza - portales.get(i+1); //La primera vez i seria 4

                //Estos dos if, en caso de que la distancia de un numero negativo, al multiplicarlo por -1 me lo pasa a positivo :)
                if (distancia1 < 0) {
                    distancia1 = distancia1 * -1;
                }
                if (distancia2 < 0) {
                    distancia2 = distancia2 * -1;
                }


                //Si la distancia 1 que seria -> distancia1 = aterriza - portales.get(i);
                //Es menor que la distancia2 pues aterrizaria en portales.get(i)
                if(distancia1 < distancia2){
                    //Declaramos donde aterriza
                    aterriza = portales.get(i);

                    //Elminamos donde aterrizaba antes
                    portales.remove(i);

                    //Añandimos el portal donde aterriza ahora en la posicion i(la primera vez seria 0) para que se vaya escribiendo ordenadamente
                    portales.add(i,aterriza);

                }
                //Lo mismo que antes pero si ambas distancias son iguales, elige el portal mas grande
                else if(distancia1 == distancia2){
                    if(portales.get(i)>portales.get(i+1)){
                        aterriza = portales.get(i);

                        portales.remove(i);

                        portales.add(i,aterriza);
                    }
                    else{
                        aterriza = portales.get(i+1);

                        portales.remove(i+1);

                        portales.add(i,aterriza);
                    }
                }
                //Lo mismo que antes pero en este caso elegimos la distancia2 y i+1
                else{
                    aterriza = portales.get(i+1);

                    portales.remove(i+1);
                    portales.add(i,aterriza);

                }

            }

        //Printeamos la Arraylist
        System.out.println(portales);

    }
}
```












