//   interface Herbivore {
//   public void eatPlants(); // abstract class
//  }
//   interface Omnivore {
//   public void eatPlants(); // abstract class
//   public void eatMeat();
//  }
//  public class Bear implements Herbivore, Omnivore {

//     public Bear(){
//         this.eatMeat();
//         this.eatPlants();
//     }
//   public void eatMeat() {
//     System.out.println("Eating meat");
//   }
//   public void eatPlants() {
//     System.out.println("Eating plants");
//   }
//   public static void main(String[] args){
//     System.out.println("Code Compiles");

//     Bear bear = new Bear();
//   }
//  }

 interface Herbivore {
    public int eatPlants();
   }
    interface Omnivore {
    public void eatPlants();
   }
   public class Bear implements Herbivore, Omnivore {
    public int eatPlants() {  // DOES NOT COMPILE
      System.out.println("Eating plants: 10");
      return 10;
    }
    public void eatPlants() {  // DOES NOT COMPILE
      System.out.println("Eating plants");
    }
   }