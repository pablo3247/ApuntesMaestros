## HashSet 

Descripción: Es una implementación de un conjunto que no permite elementos
duplicados y está respaldado por un HashMap.

o No mantiene el orden de inserción.

o No permite duplicados.

o Eficiente para verificar la existencia de un elemento.


Asi se crea 
```
Set<String> set1 = new HashSet<>();

```

De esta forma se pueden agregar varios elementos a la vez a la lista.
```
a.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
```

### Vamos a unir 2 HashSet

```
 Set<String> set1 = new HashSet<>();

        set1.add("Buenas");
        set1.add("Tardes");
        set1.add("Paco");

        Set<String> set2 = new HashSet<>();

        set2.add("Buenas");
        set2.add("Tardes");
        set1.add("Carlos");


        set1.addAll(set2);
```

### Vamos a interseccionar 2 xD

Se guardan solo los valores repetidos en ambas listas!
```
 Set<String> set1 = new HashSet<>();

        set1.add("Buenas");
        set1.add("Tardes");
        set1.add("Paco");

        Set<String> set2 = new HashSet<>();

        set2.add("Buenas");
        set2.add("Tardes");
        set1.add("Carlos");


        set1.retainAll(set2);
```


### Vamos a diferenciarlas 2 xD

Se borran los valores repetidos!
```
 Set<String> set1 = new HashSet<>();

        set1.add("Buenas");
        set1.add("Tardes");
        set1.add("Paco");

        Set<String> set2 = new HashSet<>();

        set2.add("Buenas");
        set2.add("Tardes");
        set1.add("Carlos");


        set1.removeAll(set2);
```

