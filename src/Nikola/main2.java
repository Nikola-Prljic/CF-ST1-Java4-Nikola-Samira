package Nikola;

public class main2 {
    public static void main(String[] args){
        int i = 0;
        int[] array = new int [101];

        for(i = 1; i < array.length; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
