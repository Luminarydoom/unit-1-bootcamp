/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {

  public static void main(String args[]) {
    Cat garfield = new Cat("Garfield");
    garfield.setFavoriteFood("Lasagna");
    garfield.setAge(39);
    Cat pinkPanther = new Cat("Pink Panther");
    pinkPanther.setFavoriteFood("Croissant");
    pinkPanther.setAge(53);
    Cat catwoman = new Cat("Catwoman");
    catwoman.setFavoriteFood("Sushi");
    catwoman.setAge(27);

    Person person = new Person("Jon");
  }

  public boolean isOlder(Cat cat1, Cat cat2) {
    return cat1.getAge() > cat2.getAge();
  }

  public void makeBestFriends(Cat cat1, Cat cat2) {
    cat2.setFavoriteFood(cat1.getFavoriteFood());
  }

  public Cat makeKitten(Cat cat, Cat cat1) {
    String kitty = cat.getName() + cat1.getName();
    Cat kitten = new Cat(kitty);
    kitten.setAge(0);
    return kitten;
  }

  public void adoption(Cat cat, Person person) {
    cat.setOwner(person);
  }
}
