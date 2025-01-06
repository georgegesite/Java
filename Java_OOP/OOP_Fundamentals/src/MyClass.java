public class MyClass {
    private int attribute1;
    private String attribute2;
    
    // Default constructor
    public MyClass() {
        // Initialize default values
        attribute1 = 0;
        attribute2 = "Default";
    }

    // Constructor with one parameter
    public MyClass(int value1) {
        attribute1 = value1;
        attribute2 = "Default";
    
    }

    // Constructor with two parameters
    public MyClass(int value1, String value2) {
        attribute1 = value1;
        attribute2 = value2;
    }

    // Getters for the attributes

    public int getAttribute() {
        return attribute1;
    }

    public String getAttribute2 () {
        return attribute2;
    }

    
}