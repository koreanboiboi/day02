package myapp;

import java.util.Arrays;

public class SumAll {
    public static void main(String[] args) {
        

        int [] arr = new int [] {5,7,3,-10,4};

        System.out.println(Arrays.toString(arr));

        int sum = 0;
        for (int i = 0; i <arr.length; i++){
            sum += arr[i];
        } System.out.printf("The sum is: %d\n ", sum);
    }

    
}
