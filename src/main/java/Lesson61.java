import java.util.ArrayList;

/*
1. Create ArrayList and print it.
*/
public class Lesson61 {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        for(int i : myArrayList) {
            System.out.println(i);
        }
    }
}