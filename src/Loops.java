import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {

  public static void main(String args[]) {
    sumNumbers("a22bbb3");
  }

  public static int sumNumbers(String str) {
    int sum = 0;
    for (int i = 0; i < str.length(); i++) { //Iterate through String
      if (Character.isDigit(str.charAt(i))) { //if character at position is a digit
        int count = 0;
        for (int j = i; j < str.length(); j++) { //inner loop
          if (Character.isDigit(str.charAt(j))) { //if digit at following positions are also digits add to count
            count++; //keep track of the number with multiple digits size
          } else {
            break; //end inner loop
          }
        }
        sum += Integer.parseInt(str.substring(i, i + count));// keeping track of sum make the number with multiple digits a substring
        i += count; //updates the count to value past the multiple digit number;
      }
    }
    return sum;
  }
}
