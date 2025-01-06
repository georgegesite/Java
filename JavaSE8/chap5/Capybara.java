 class Rodent {
}
public class Capybara extends Rodent {
 public static void main(String[] args) {
//    Rodent rodent = new Rodent();
//    Capybara capybara = (Capybara)rodent; // Throws ClassCastException at runtime

   Capybara capybara = new Capybara();
   Rodent rodent = capybara;
   Capybara capybara2 = (Capybara)rodent;

 }
}