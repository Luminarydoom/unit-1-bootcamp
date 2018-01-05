import com.sun.org.apache.xpath.internal.operations.String;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.concurrent.Callable;
import javax.print.attribute.HashDocAttributeSet;
import javax.sound.midi.Soundbank;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class DataStructures {

  public static void main(String args[]) {
    Random random = new Random();
    ArrayList<Cat> catArrayList = new ArrayList<>();
    Cat cat = new Cat("Nugget");
    catArrayList.add(cat);
    Cat cat1 = new Cat("Ginger");
    catArrayList.add(cat1);
    Cat cat2 = new Cat("Salem");
    catArrayList.add(cat2);
    Cat cat3 = new Cat("Congress");
    catArrayList.add(cat3);
    Cat cat4 = new Cat("Whisker's");
    catArrayList.add(cat4);

    for (int i = 0; i < catArrayList.size(); i++) {
      System.out.println("Cat name: " + catArrayList.get(i).getName());
    }

    ArrayList<Integer> integers = new ArrayList<>();
    for (int i = 0; i < 40; i++) {
      int next = random.nextInt(10) + 1;
      integers.add(next);
    }
    ArrayList<String> stringArrayList = new ArrayList<>();
    stringArrayList.add("Origin");
    stringArrayList.add("Hello");
    stringArrayList.add("Speed");
    stringArrayList.add("Origin");
    stringArrayList.add("Origin");
    stringArrayList.add("Keyboard");
    stringArrayList.add("hook");
    stringArrayList.add("loop");
    stringArrayList.add("Speed");
    mostFrequentElement(stringArrayList);
  }

<<<<<<< HEAD
  public static void mostFrequentElement(ArrayList<Integer> integers) {

    Map<Integer, Integer> integerMap = new HashMap<>();
    for (int i = 0; i < integers.size(); i++) {
      Integer count = integerMap.get(integers.get(i));
      integerMap.put(integers.get(i), count == null ? 1 : count + 1);
    }
    int max = Collections.max(integerMap.values());
    for (Entry<Integer, Integer> entry : integerMap.entrySet()) {
      if (entry.getValue() == max) {
        System.out.println(integerMap);
        System.out.println(entry.getKey() + " appears " + max + " times");
      }
    }
=======
  public static void mostFrequentElement(ArrayList<String> str) {

//    HashMap<Integer, Integer> integerMap = new HashMap<>();
//    for (int i = 0; i < integers.size(); i++) {
//      Integer count = integerMap.get(integers.get(i));
//      //Integer used to create a ternary operator within the integerMap
//      //Ternary operator accounts for null refrence since current count maybe be null at the beginning of the loop;
//      integerMap.put(integers.get(i), count == null ? 1 : count + 1);
//    }
//    int max = Collections.max(integerMap.values()); //get Max value in the hash map
//    for (Entry<Integer, Integer> entry : integerMap
//        .entrySet()) { // loop through map since collections max just returns value not the key
//      if (entry.getValue() == max) {
//        System.out.println(integerMap);
//        System.out.println(entry.getKey() + " appears " + max + " times");
//      }
//    }
>>>>>>> origin

    HashMap<String , Integer> wordCount = new HashMap<>();

    for (int i = 0; i < str.size(); i++){
      Integer count =wordCount.get(str.get(i));
      i

    }

  }
}
