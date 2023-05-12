package arrays;

public class Array_FirstDuplicatedElement {

    public static int findFirstDuplicate(int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == array[j]) {

                    return array[i];
                }
            }
        }
        return -1; //no duplicates found
    }

    public static void main(String[] args) {

        int[] arr ={1,2,3,5,6,7,7};
        System.out.println(findFirstDuplicate(arr));


    }


}
  /*
    write a program that can find the first duplicated element from the array
     */