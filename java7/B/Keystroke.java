package hand.band;

public class Keystroke {
    public void exclamationPoint() {
        System.out.println(" ! ");
    }
}

1
package hand;

2

class Greet {
    3
    public static void main(String[] args) {
   4     String greeting = "Hello";
   5     System.out.println(greeting);
   6     Keystroke stroke = new Keystroke();
   7     stroke.exclamationPoint();
   8 }9
}

// What three modifications, made independently enable the code to coimpil;e and
// run? (Choose three.)
// a. line 6 replaced with hand.band.Keystroke stroke = new Keystroke();
// c. line 6 replaced with hand.band.Keystroke stroke = new
// hand.band.Keystroke();
// d. import hand.*; added after line 1
/// e. import hand.band.*; added after line 1
// f. import hand.band.Keystroke; added after line 1
