import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        Optional<String> nonEmptyOptional = Optional.of("Hello, Optional!");

        Optional<String> emptyOptional = Optional.empty();

        nonEmptyOptional.ifPresent(value -> System.out.println("Value is: " + value));

        String defaultValue = emptyOptional.orElse("Default Value");
        System.out.println("Value is: " + defaultValue);

        String valueOrSupplier = emptyOptional.orElseGet(() -> "Value from Supplier");
        System.out.println("Value is: " + valueOrSupplier);

        Optional<String> transformedValue = nonEmptyOptional.map(value -> value.toUpperCase());
        transformedValue.ifPresent(value -> System.out.println("Transformed Value is: " + value));

        Optional<Integer> length = nonEmptyOptional.flatMap(value -> Optional.of(value.length()));
        length.ifPresent(value -> System.out.println("Length is: " + value));
    }
}
