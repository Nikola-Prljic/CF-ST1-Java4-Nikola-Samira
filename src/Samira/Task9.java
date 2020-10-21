package Samira;

public class Task9 {
    public static void main(String[] args) {
        int[] array = {2, 10, 12, 15, 24, 32};
        int index =0;
        for(int i=0; i<array.length; i++){
            if(array[i]==24){
                index=i;
            }

        }
        System.out.println("index is " + index);
    }

}
