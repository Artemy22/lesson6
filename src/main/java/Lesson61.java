import java.util.ArrayList;

/*
1. Create ArrayList and print it.
*/
public class Lesson61 {
    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("First");
        myArrayList.add("Second");
        myArrayList.add("Third");
        for(String i : myArrayList) {
            System.out.println(i);
        }
    }
}