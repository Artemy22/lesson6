import java.util.ArrayList;

/*
"5. Create ArrayList of Strings. Add 5 different Strings to it.
Using any cycle print all the values of the ArrayList to the console."
*/

public class Lesson65 {
    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("First");
        myArrayList.add("Second");
        myArrayList.add("Cat");
        myArrayList.add("Dog");
        myArrayList.add("Ball");
        System.out.println("myArrayList has size: " + myArrayList.size());
        for (String i : myArrayList) {
            System.out.println(i);
        }
    }
}