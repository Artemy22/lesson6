import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
/*
Create an array of 15 random integers from the segment [0;   9].
Display the array on the screen.
Count how many in the array of even elements and display this number on the screen on a separate line.
*/

public class Lesson64 {
    public static void main(String[] args) {
        int evenElements = 0;
        int indexA = 0;
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        for (int i = 0; i < 15; i++) {
            int randomInt = (int) (10.0 * Math.random());
            myArrayList.add(randomInt);
        }
        for (int arrInt : myArrayList) {
            System.out.println("index: " + indexA + " value: " + arrInt);
            ++indexA;
            if (arrInt % 2 == 0 && arrInt > 0) {
                evenElements++;
            }
        }
        System.out.println("even: " + evenElements);
    }
}