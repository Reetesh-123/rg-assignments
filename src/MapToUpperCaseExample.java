import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapToUpperCaseExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Mike", "Tyson", "David");

        // Convert each string in the list to uppercase
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Print the converted list
        upperCaseNames.forEach(System.out::println);
    }
}

