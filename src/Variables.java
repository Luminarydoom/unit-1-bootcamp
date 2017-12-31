/**
 * Created by alexandraqin on 4/14/15.
 */
public class Variables {

    public static void main(String args[]) {
        usingVariables();
        System.out.println("Is 6 odd? " + isOdd(6));
        printHelloWorld();
        System.out.println(greatestCommonFactor(18, -4));
    }

    private static int greatestCommonFactor(int a, int b) {
        a = a *-1;
        b = b* -1;
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b == 0) {
            return a;
        }
        return greatestCommonFactor(b  , a % b);
    }

    private static void printHelloWorld() {
        System.out.println("Hello World");
    }

    private static boolean isOdd(int i) {
        return i % 2 != 0;
    }

    private static void usingVariables() {
        int classNumber = 113;
        double eulersNumber = 2.71828;
        String major = "Computer Science";
        System.out.println("This is room # " + classNumber);
        System.out.println("e is close to " + eulersNumber);
        System.out.println("I am learning a bit of " + major);
    }
}
