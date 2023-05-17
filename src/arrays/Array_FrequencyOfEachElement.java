package arrays;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Array_FrequencyOfEachElement {
    public static void main(String[] args) {
        String [] testArray = {"Apple","Banana","Apple","Cherry", "Apple"};
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < testArray.length; i++) {


            if (!list.contains(testArray[i])) {


                int count = 1;
                for (int j = i + 1; j < testArray.length; j++) {

                    if (testArray[i].equalsIgnoreCase(testArray[j])) {
                        count++;

                    }
                }
                list.add(testArray[i]);
                System.out.println(testArray[i] + " = " + count);

            }


        }

    }
}
/*
    Given the array return the output
                testArray = {"Apple","Banana","Apple","Cherry"}
                Output Example
                Apple = 2
                Banana = 1
                Cherry = 1
     */