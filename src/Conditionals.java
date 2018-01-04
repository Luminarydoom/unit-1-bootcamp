import java.util.Arrays;
import java.util.List;

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


  public static boolean evenlySpaced(int a, int b, int c) {
    int[] space = {a, b, c};
    Arrays.sort(space);
    if (space[2] - space[1] == space[1] - space[0]) {
      return true;
    } else {
      return false;
    }
  }

  public static String alarmClock(int day, boolean vacation) {
    if (vacation) {
      if (day > 0 && day < 6) {
        return "10:00";
      } else {
        return "off";
      }
    } else {
      if (day > 0 && day < 6) {
        return "7:00";
      } else {
        return "10:00";
      }
    }
  }

  public int greenLotteryTicket(int a, int b, int c) {
    if (a == b && b == c) {
      return 20;
    }
    if (a == b || b == c || c == a) {
      return 10;
    }
    return 0;
  }

  public int blackJack(int a, int b) {
    if (a == 21 && b == 21) {
      a = 0;
      b = 0;
    }

    if (a > 21) {
      a = 0;
    }
    if (b > 21) {
      b = 0;
    }

    if (a > b) {
      return a;
    } else {
      return b;
    }
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
