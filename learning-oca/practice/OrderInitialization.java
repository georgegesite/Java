class OrderInitialization {
    // Step 1: Static Initializers
    static {
        System.out.println("1. Static Initializer Block");
    }

    // Static Variable
    static int staticVar = printStaticVariable();

    // Instance Initializer
    {
        System.out.println("3. Instance Initializer Block");
    }

    // Instance Variable
    int instanceVar = printInstanceVariable();

    // Constructor
    OrderInitialization() {
        System.out.println("4. Constructor");
    }

    static int printStaticVariable() {
        System.out.println("2. Static Variable Initialization");
        return 10;
    }

    int printInstanceVariable() {
        System.out.println("5. Instance Variable Initialization");
        return 20;
    }

    public static void main(String[] args) {
        new OrderInitialization();
        System.out.println("6. main() Method");

    }
}
