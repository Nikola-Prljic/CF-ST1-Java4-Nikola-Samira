package Nikola;

import java.util.Scanner;

public class main8 {
    public static void main(String[] args){
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        for(int a = 0; a < numbers.length; a++) {
            System.out.println("enter number");
            numbers[a] += scanner.nextInt();
        }
        //int[] numbers = new int[]{5, 30, 2, 32, -16, 60, -100};
        //calculate sum of all array elements
        int sum = 0;
        for(int i=0; i < numbers.length ; i++)
            sum = sum + numbers[i];
        //calculate average value
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);
    }

}
