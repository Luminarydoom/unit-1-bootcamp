import com.stripe.model.Customer;
import com.sun.deploy.util.ArrayUtil;
import com.sun.tools.javac.util.ArrayUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import sun.print.CUPSPrinter;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class UsingAPIs {


  public static void main(String args[]) throws IOException {

    File file3 = new File("./res/files/test1.txt");
    File file = new File("./res/files/mobyDick.txt");
    File file2 = new File("./res/files/taleofTwoCities.txt");
//    //verboseComparison(file, file2);
//    // combiningSets(file, file2);
//
    System.out.println(verbosityCalculator(file));
//    System.out.println(words);
//    System.out.println(words.size());
//    Customer customer = new Customer();
//    customer.setEmail("nylesewasi-8505@yopmail.com");

  }

//  public static void verboseComparison(File file, File file2) {
//    try {
//      int mobyUniqueVocab = verbosityCalculator(file).size();
//      int twoCitiesUniqueVocab = verbosityCalculator(file2).size();
//      if (mobyUniqueVocab > twoCitiesUniqueVocab) {
//        System.out.println("Moby dick is more verbose");
//        System.out.println(verbosityCalculator(file).size());
//      } else {
//        System.out.println("Tale of two cities is more verbose");
//      }
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//  }

//  public static void combiningSets(File file, File file2) {
//    try {
//      HashSet<String> unionOfBoth = new HashSet<>();
//      unionOfBoth.addAll(verbosityCalculator(file));
//      unionOfBoth.addAll(verbosityCalculator(file2));
//      System.out.println("Union of both texts: \n" + unionOfBoth);
//      System.out.println("Total size: " + unionOfBoth.size());
//      HashSet<String> intersectionOfBoth = new HashSet<>();
//      intersectionOfBoth.addAll(verbosityCalculator(file));
//      intersectionOfBoth.retainAll(verbosityCalculator(file2));
//      System.out.println("Intersection of both texts: \n" + intersectionOfBoth);
//      System.out.println("Total size: " + intersectionOfBoth.size());
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//
//  }

  private static int verbosityCalculator(File file) throws IOException {
//    BufferedReader reader = new BufferedReader(new FileReader(file));
//    HashSet<String> wordCountHashSet = new HashSet<>();
//
//    String line = reader.readLine();
//    int lineNumber = 0;
//    while (line != null) {
//      lineNumber++;
//      if (!line.trim().isEmpty()) {
//        //accounts for carriage return
//        String[] words = line.replaceAll("[,.:;?!—()\\[\\]_*]", " ").toLowerCase().split(" ");
//        for(String word: words) {
//          if (word.length() == 1 && !word.equals("a") && !word.equals("i")) {
//            System.out.println(lineNumber + ": " + word);
//          }
//          wordCountHashSet.add(word);
//        }
//      }
//      line = reader.readLine();
//    }
//
//    return wordCountHashSet;

    HashSet<String> uniqueWords = new HashSet<>();
    Scanner scanner = new Scanner(file);
    int linecount =1;
    while (scanner.hasNext()) {
        linecount++;
      String word = scanner.next().replaceAll("[\\W]", " ").replaceAll("[^a-zA-Z]", "")
          .toLowerCase();

      if (!uniqueWords.contains(word)) {
        if (word.length() > 1 || word.equals("a") || word.equals("i")) {
          uniqueWords.add(word);
          System.out.println(linecount+" "+ word);
        }
      }
    }

    scanner.close();



    return uniqueWords.size();
  }
}

