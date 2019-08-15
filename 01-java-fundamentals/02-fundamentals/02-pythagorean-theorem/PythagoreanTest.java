public class PythagoreanTest {
    public static void main(String[] args) {
      Pythagorean iD = new Pythagorean();
      int legA = 5;
      int legB = 6;
  
      double hype = iD.calculateHypotenuse(legA, legB);
  
      String output = String.format("The hypotenuse of a triangle with sides %d and %d is %.2f", legA, legB, hype);
  
      System.out.println(output);
    }
  }
  