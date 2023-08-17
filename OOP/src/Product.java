public class Product {
    String name;
    float price;

    Product(String ProductName, float ProductPrice) {
        this.name = ProductName;
        this.price = ProductPrice;

        System.out.println(name + " - Product Created");
        System.out.println(price + " - Price of Product");
    }

}