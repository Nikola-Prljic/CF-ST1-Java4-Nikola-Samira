package Samira;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){

        int number;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = input.nextInt();
        for (int i = 1; i <= number; i++){
            sum += i;
        }
        System.out.println("sum is " + sum);

    }
}
