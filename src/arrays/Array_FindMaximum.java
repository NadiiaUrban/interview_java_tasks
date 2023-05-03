package arrays;

public class Array_FindMaximum {

    public static int findMaximum(int[]arr){

        int max= Integer.MIN_VALUE;

        for (int each : arr) {
            if (each > max){
                max=each;
            }

        }
        return max;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

        System.out.println(findMaximum(arr));


    }
}

  /*
        Write a function that can find the maximum number from an int Array
     */
