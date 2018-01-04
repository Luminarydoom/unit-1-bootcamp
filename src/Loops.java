import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {

  public static void main(String args[]) {
  //  sumNumbers("a22bbb3");
  //  wordEnds("abc1xyz1abc", "abc");
   // numberpuzzle();
    digits();
  }
  public static void digits(){
    for(int i = 10 ; i <=99 ; i++){
      int digit2 = i%10;
      int digit1 = i/10;
      System.out.println(i +", "+ digit1+ "+"+digit2 +" = "+ (digit1+digit2));
    }

  }

  private static void numberpuzzle(){
    System.out.println("list of combinations");
    for(int i = 0; i<200 ;i++){
      for(int j =0; j<200;j++){
        if(i+j == 60 && i-j == 14){
          System.out.println(i +" "+ j);
        }
      }
    }
  }

  public static int sumNumbers(String str) {
    int sum = 0;
    for (int i = 0; i < str.length(); i++) { //Iterate through String
      if (Character.isDigit(str.charAt(i))) { //if character at position is a digit
        int count = 0;
        for (int j = i; j < str.length(); j++) { //inner loop
          if (Character.isDigit(
              str.charAt(j))) { //if digit at following positions are also digits add to count
            count++; //keep track of the number with multiple digits size
          } else {
            break; //end inner loop
          }
        }
        sum += Integer.parseInt(str.substring(i,
            i + count));// keeping track of sum make the number with multiple digits a substring
        i += count; //updates the count to value past the multiple digit number;
      }
    }
    return sum;
  }

  public static String notReplace(String str) {
    StringBuilder result = new StringBuilder();
    int length = str.length();
    for (int i = 0; i < length; i++) {
      if (i - 1 >= 0 && Character.isLetter(str.charAt(i - 1))
          //if character in string is wrapped around other letters
          || i + 2 < length && Character.isLetter(str.charAt(i + 2))
          ) {
        result.append(str.charAt(i)); //add character to result string
      } else if (i + 1 < length && str.substring(i, i + 2).equals(
          "is")) { //if substring result "is" and you are not causing a null pointer exception
        result.append("is not"); //add is not to result append
        i++; //next character
      } else {
        result.append(str.charAt(i)); //otherwise just add character
      }
    }
    return result.toString();
  }

  public static String wordEnds(String str, String word) {
    int stringLength = str.length();
    int wordLength = word.length();
    StringBuilder result = new StringBuilder();
    int length = stringLength - wordLength + 1; // we want to compare sub strings but need to avoid nullpointer
    for (int i = 0; i < length; i++) {
      String tmp = str.substring(i, i + wordLength);  // substring size of word string
      if (i > 0 && tmp.equals(word)) { // there is no letter prior to the left corner so we cant add a letter before this because of null pointers
        result.append(str.substring(i - 1, i)); //
      }
      if (i < stringLength - wordLength && tmp.equals(word)) { // else as long as the string is not in the right corner we can take a letter after it else null pointer
        result.append(str.substring(i + wordLength, i + wordLength + 1));
      }
    }
    return result.toString();
  }
}
