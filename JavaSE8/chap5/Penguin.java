 class Bird {
    public final boolean hasFeathers() {
    return true;
    }
   }
   public class Penguin extends Bird {
    public  boolean hasFeathers() { // DOES NOT COMPILE - cannot override final methods
    return false;
    }
   }