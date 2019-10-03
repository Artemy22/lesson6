import java.util.ArrayList;
import java.util.HashSet;

/*
"9. Create ArrayList<Integer> and add 100 random numbers (Use Math.random()).
Create HashSet<Integer> and add all unique numbers from the ArrayList."
*/

public class Lesson69 {
    public static void main(String[] args) {

        ArrayList<Integer> myMaxList = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            myMaxList.add((int) (Math.random() * 100));
        }

        HashSet<Integer> myHashSet = new HashSet<Integer>(myMaxList);
        for (int value : myHashSet) {
            System.out.println(value);
        }

        System.out.println("myHashSet has size: " + myHashSet.size());
    }
}