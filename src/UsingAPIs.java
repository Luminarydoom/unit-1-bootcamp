import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class UsingAPIs {

  public static void main(String args[]) throws IOException {

    File file = new File("./res/files/mobyDick.txt");
    File file2 = new File("./res/files/taleofTwoCities.txt");

    BufferedReader reader = new BufferedReader(new FileReader(file));
    HashSet<String> wordCountHashSet = new HashSet<>();

    String line = reader.readLine();
    while (line != null) {
      if (!line.trim().equals("")) {
        String[] words = line.replaceAll("[^A-Za-z0-9]", "").toLowerCase().split(" ");
        wordCountHashSet.addAll(Arrays.asList(words));
      }
      line = reader.readLine();
    }
    System.out.println("How many unique words in Moby dick? "+ wordCountHashSet.size());
  }

}

