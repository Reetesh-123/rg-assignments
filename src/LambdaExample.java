import java.util.Arrays;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Using a lambda expression to print each name
        names.forEach(name -> System.out.println(name));

        // Using a lambda expression to filter and print names that start with 'C'
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(name -> System.out.println("Name starting with A: " + name));
    }
}
