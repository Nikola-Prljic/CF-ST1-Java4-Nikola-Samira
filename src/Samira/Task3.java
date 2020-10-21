package Samira;
import java.util.Scanner;
public class Task3 {
    public static void main(String args[]){
        int first;
        int second;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        first = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        second = input.nextInt();
        for (int i = first; i < second; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }



    }


}
}
