public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        Car myCar = new Car();
        //        myCar.setMakeAndModel("Ford", "F150");  // setter method
        System.out.println(myCar.make);
        System.out.println(myCar.model);
        System.out.println(myCar.color);
        myCar.drive();

        System.out.println();
        Car myCar2 = new Car();
        myCar2.make = "Ford";
        myCar2.model = "F150";
        myCar2.color = "black";
        myCar2.price = 60000.00;
        myCar2.year = 1975;


        System.out.println(myCar2.make);
        System.out.println(myCar2.model);
        System.out.println(myCar2.color);
        System.out.println(myCar2.price);
        System.out.println(myCar2.year);

    }
}
