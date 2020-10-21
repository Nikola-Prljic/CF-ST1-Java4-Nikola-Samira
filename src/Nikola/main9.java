package Nikola;

import java.util.Scanner;

public class main9 {
    public static int  findIndex (int[] array, int t) {
        if (array == null) return -1;
        int len = array.length;
        int i = 0;
        while (i < len) {
            if (array[i] == t) return i;
            else i = i + 1;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Type in the number of the array");
        for(int i=0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
        Scanner SCA = new Scanner(System.in);
        int number = SCA.nextInt();
        System.out.println("Index position of " + number + " is: " + findIndex(array, number));


    }
}
