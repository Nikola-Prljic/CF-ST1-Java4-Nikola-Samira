package Nikola;

import java.util.Arrays;
import java.util.Scanner;

public class main3 {
    public static void main(String[] args){

        Scanner SCA = new Scanner(System.in);

        System.out.print("Enter your number : ");
        int inp1 = SCA.nextInt();

        System.out.print("Enter your number : ");
        int inp2 = SCA.nextInt();

        int sum;
        if (inp2 > inp1){
            sum = inp2 - inp1;
            int[] arrayEins = new int[sum];


            for (int i = 0; i < arrayEins.length; i++, inp1=inp1+1) {
                arrayEins[i] = inp1;
                if (inp1 % 2 != 0){
                    System.out.println(arrayEins[i]);
                }
            }
        }
        else {
            sum = inp1 - inp2;
            int[] arrayEins = new int[sum];

            for (int i = 0; i < arrayEins.length; i++, inp2=inp2+1) {
                arrayEins[i] = inp2;
                if (inp2 % 2 != 0){
                    System.out.println(arrayEins[i]);
                }
            }
        }
    }
}
