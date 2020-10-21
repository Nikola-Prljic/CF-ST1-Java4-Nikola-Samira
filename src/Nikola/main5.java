package Nikola;

import java.util.Scanner;
import java.util.stream.IntStream;

public class main5 {
    public static void main(String[] args){
        Scanner SCA = new Scanner(System.in);
        System.out.print("Your number ");
        int n = SCA.nextInt();

        int[] array = new int[]{3, 10, 22, 33, 44, 72, 15, 20, 11, 28};
        //for (int i = 0; i < array.length; i++) {
         //   if(contains(array, n)){
          //      System.out.println("Hello A");
          //  }
          //  System.out.print(array[i] + " ");
        //}
        boolean result = IntStream.of(array).anyMatch(x -> x == n);

        if (result) {
            System.out.println("Your number is in the array and is number " + n );
        } else {
            System.out.println("Nothing found");
        }
    }
}
