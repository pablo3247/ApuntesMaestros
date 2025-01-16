import java.util.ArrayList;

public class Problema3 {
    public static void main(String[] args) {
        ArrayList<Person> personas = new ArrayList<>();
        Person persona = new Person("Alejandro", "García", 1968);
        personas.add(persona);
        persona = new Person("Adela", "García", 1998);
        personas.add(persona);
        persona = new Person("Alejandro", "Martínez", 1968);
        personas.add(persona);


        personas.stream()
                .map(Person::getBirthYear)
                .distinct()
                .sorted()
                .forEach(System.out::println);

    }
}
