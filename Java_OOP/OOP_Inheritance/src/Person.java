class Person {
    private String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hello, I'm " + fullName + " and I'm " + age + " years old.");
    }
}