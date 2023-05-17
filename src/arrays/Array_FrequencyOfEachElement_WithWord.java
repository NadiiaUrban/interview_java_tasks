package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array_FrequencyOfEachElement_WithWord {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,3,2,1,3,2,2,2,4};
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!list.contains(arr[i])) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }

                System.out.println(arr[i] + " is " + String.valueOf(count));
                list.add(arr[i]);

            }

        }



    }
}
    /*
     int[]arr = {1,2,3,4,3,2,1,3,2,2,2,4};
write a program that should count each number and prints a sentence to say how many times a number is repeated example:
        1 is two,
        3 is three,
        4 is two.
        2 is five
     */