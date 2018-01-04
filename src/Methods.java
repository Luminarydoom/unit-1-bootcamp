import java.util.Random;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {

  public static void main(String args[]) {
    System.out.println(calculateSquare(4));
    System.out.println(calculateSquareRoot(16));
    toLowerCaseMethod("Hello. World!");
    System.out.println(isMultiple(5, 101));
    prettyInteger(7);
    System.out.println(randomInteger(1, 100));
  }

  private static int randomInteger(int i, int j) {
    Random random = new Random();
    return random.nextInt(j) + i;
  }

  private static void prettyInteger(int p) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < p; i++) {
      sb.append('*');
    }
    String a = sb.toString();
    System.out.println(a + " " + p + " " + a);
  }

  private static void toLowerCaseMethod(String string) {
    System.out.println(string.toLowerCase());
  }

  private static double calculateSquareRoot(int i) {
    return Math.sqrt(i);
  }

  private static double calculateSquare(int i) {
    return Math.pow(i, 2);
  }


  public static boolean isMultiple(int a, int b) {
    return b % a == 0;
  }
}
