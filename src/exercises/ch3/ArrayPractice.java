package exercises.ch3;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        ArrayPractice arrayPractice = new ArrayPractice();
        //arrayPractice.printOddNumber();
        //arrayPractice.splitString();
        arrayPractice.splitStringToSentences();
    }

    public void printOddNumber() {
        //1, 1, 2, 3, 5, 8 integers
        int[] myArrayOfInts = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i < myArrayOfInts.length; i++) {
            //if num not divisible by 2, we know it's odd
            //use mod (%)
            if (myArrayOfInts[i] % 2 == 1) {
                System.out.println(myArrayOfInts[i]);
            }
        }

    }

    public String[] splitString() {
        String providedString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] splitStrings = providedString.split(" ");
        //System.out.println(Arrays.toString(splitStrings));
        return splitStrings;
    }

    public void splitStringToSentences() {
        String providedString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] splitStrings = providedString.split("\\.");
        System.out.println(Arrays.toString(splitStrings));

    }
}