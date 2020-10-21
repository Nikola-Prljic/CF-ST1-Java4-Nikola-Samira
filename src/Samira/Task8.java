package Samira;

public class Task8 {


    public static void main(String[] args){
        double[] array = {2, 10, 12, 15, 24, 32, 40, 55, 59, 62};
        double total = 0;
        for(int i = 0; i < array.length; i++){
            total += array[i];
        }
        System.out.println(total/array.length);

    }
}
