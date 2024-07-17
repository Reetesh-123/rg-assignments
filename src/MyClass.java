interface MyInterface {
    // Abstract method
    void abstractMethod();

    // Default method
    default void defaultMethod() {
        System.out.println("Default method in MyInterface");
    }

    // Static method
    static void staticMethod() {
        System.out.println("Static method in MyInterface");
    }
}
public class MyClass implements MyInterface {
    // Implementing the abstract method
    @Override
    public void abstractMethod() {
        System.out.println("Abstract method implementation in MyClass");
    }

    // Overriding the default method
    @Override
    public void defaultMethod() {
        System.out.println("Overridden default method in MyClass");
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        // Calling the abstract method
        myClass.abstractMethod(); // Output: Abstract method implementation in MyClass

        // Calling the overridden default method
        myClass.defaultMethod(); // Output: Overridden default method in MyClass

        // Calling the static method from the interface
        MyInterface.staticMethod(); // Output: Static method in MyInterface
    }
}
