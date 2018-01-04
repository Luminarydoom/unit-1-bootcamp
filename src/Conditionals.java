import java.util.Objects;

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

  private static boolean personFromLondon(Person person) {
    return Objects.equals(person.getCity(), "London");
  }

  private static void personPrintName(Person person) {
    String personName = person.getName();
    if (personName.length() > 5) {
      System.out.println(personName);
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

  public static boolean cigarPartySuccess(int cigars, boolean isWeekend) {
    if (isWeekend) {
      return cigars >= 40;
    } else {
      return cigars >= 40 && cigars <= 60;
    }
  }

  public static int caughtSpeeding(int speed, boolean isBirthday) {
    if (isBirthday) {
      if (speed <= 65) {
        return 0;
      } else if (speed <= 85) {
        return 1;
      } else {
        return 2;
      }
    } else {
      if (speed <= 60) {
        return 0;
      } else if (speed <= 80) {
        return 1;
      } else {
        return 2;
      }
    }
  }
}
