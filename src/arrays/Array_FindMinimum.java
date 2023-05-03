package arrays;

public class Array_FindMinimum {

    public static int findMin(int[] arr){

        int min = Integer.MAX_VALUE;

        for (int each : arr) {
            if (each < min){
                min=each;
            }

        }
        return min;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        System.out.println(findMin(arr));
    }

}

 /*
    Write a function that can find the minimum number from an int Array
     */
