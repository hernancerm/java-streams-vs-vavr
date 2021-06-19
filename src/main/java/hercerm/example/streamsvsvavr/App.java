package hercerm.example.streamsvsvavr;

import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        // Java 8+ streams
        List<Person> persons0 = List.of(
                new Person(20, "Martha"),
                new Person(18, "Julio"),
                new Person(28, "Dana")
        );

        List<String> names0 = persons0.stream()
                .filter(p -> p.age > 12)
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println("\nUsing Java 8+ streams");
        names0.forEach(System.out::println);

        // Vavr
        io.vavr.collection.List<Person> persons1 = io.vavr.collection.List.ofAll(persons0.stream());
        io.vavr.collection.List<String> names1 = persons1
                .filter(p -> p.getAge() > 12)
                .map(Person::getName);

        System.out.println("\nUsing Vavr");
        names1.forEach(System.out::println);
    }

    public static class Person {
        private final int age;
        private final String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }
}
