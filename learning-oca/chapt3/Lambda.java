import java.util.ArrayList;

interface Predicate<T> {
    boolean test(T t);
}

class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Lambda {
    public static void printImportantData(ArrayList<Person> dataList, Predicate<Person> p) {
        for (Person d : dataList) {
            if (p.test(d)) {
                System.out.println("Name: " + d.name + ", Age: " + d.age);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Person> al = new ArrayList<>();
        al.add(new Person("John", 20));
        al.add(new Person("Doe", 17));

        printImportantData(al, (Person d)->{ return d.age>18; } );
        printImportantData(al, (Person d) -> d.age > 18); 
        printImportantData(al, d->d.age>1);
    }
}
