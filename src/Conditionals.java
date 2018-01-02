/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals {

  public static void main(String args[]) {
    System.out.println(isOdd(8));
    isMultipleOfThree(24);
    System.out.println("Is 24 odd and multiple of three: " + isOddAndIsMultipleOfThree(24));
    isOddAndIsMultipleOfThree2(27);
    fizzMultipleOfThree(27);
  }

  private static void fizzMultipleOfThree(int i) {
    if (i % 3 == 0) {
      System.out.println("Fizz");
    } else {
      System.out.println(i);
    }
  }

  private static boolean isOddAndIsMultipleOfThree2(int i) {
    return isOdd(i) && isMultipleOfThree(i);
  }

  private static boolean isOddAndIsMultipleOfThree(int i) {
    return i % 2 != 0 && i % 3 == 0;
  }

  private static boolean isMultipleOfThree(int i) {
    return i % 3 == 0;
  }

  private static boolean isOdd(int i) {
    return i % 2 != 0;
  }


}
