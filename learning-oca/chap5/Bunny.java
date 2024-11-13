 interface Hop {
    static int getJumpHeight() {
      return 8;
    }
   }
  

    public class Bunny implements Hop {
        public Bunny(){
            printDetails();
        }

    public void printDetails() {
      System.out.println(Hop.getJumpHeight());
    }

    public static void main(String[] args) {
        Bunny bunny = new Bunny();
    }
   }