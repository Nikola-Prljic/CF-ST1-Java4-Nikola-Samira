package Nikola;

import java.util.Arrays;

public class main11 {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 25, 36, 56, 77, 14, 29, 49};

        for (int i = 0; i < array.length-1; i++)
        {
            for (int j = i+1; j < array.length; j++)
            {
                if ((array[i] == array[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+array[j]);
                }
            }
        }
    }
}
