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

        System.out.println("FIRST realisation: ");

        ArrayList<String> myMaxList = new ArrayList<String>();
        int maxLength = 0;
        for (String i : myArrayList) {
            if (i.length() > maxLength) {
                maxLength = i.length();
                myMaxList.clear();
                myMaxList.add(i);
            } else if (i.length() == maxLength) {
                myMaxList.add(i);
            }
        }
        for (String s : myMaxList) {
            System.out.println("The most long string is: " + s);
        }

        System.out.println("SECOND realisation: ");
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