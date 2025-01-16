package programacio.estructuraDatos;
import programacio.utilidades.Utilidades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Telefono {
    public static void main(String[] args) {
        String telefono="";
        Map<String, String> agenda = new HashMap< String, String >();
        agenda.put ("Pepe", "667761");
        agenda.put ("Juan", "+0034 44001");
        agenda.put("Luis", "634987");
        do{
            telefono = Utilidades.leerCadena("Introduzca un contacto (cadena vacía para acabar)");
            if (telefono.length() != 0)
                System.out.println(agenda.getOrDefault(telefono, "No existe ese país en la base de datos"));
        }while (telefono.length() != 0);
    }
}
