import java.util.ArrayList;
import java.util.Collections;

/*
"6. Create ArrayList of Strings. Add 10 different Strings to it.
Using any cycle find the longest String in the list and print it out.
If there are several String with the same legth - print each from a new line."
*/

public class Lesson66 {
    public static void main(String[] args) {

        int myStringLenght = 0;
        int forCount = 0;

        ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("Michael");
        myArrayList.add("Valentin");
        myArrayList.add("Konstantin");
        myArrayList.add("Vorobooshek");
        myArrayList.add("Dmitry");
        myArrayList.add("Artem");
        myArrayList.add("Vladimir");
        myArrayList.add("Greebochki");
        myArrayList.add("Feelki");
        myArrayList.add("JesusChrist");

        ArrayList<Integer> myArrayListInt = new ArrayList<Integer>();
        for (String i : myArrayList) {
            myArrayListInt.add(i.length());
        }

        Collections.sort(myArrayListInt);
        for (String i : myArrayList) {
            if (i.length() == myArrayListInt.get(myArrayListInt.size() - 1)) {
                System.out.println("The most long string is: " + i);
            }
        }
    }
}