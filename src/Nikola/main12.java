package Nikola;

import java.util.Arrays;
public class main12 {
    public static void main(String[] args){
        String[] foodPortion;
        foodPortion = new String[]{" x 1dl milk", " x slice of bread", " gr chicken breast", " gr salad"};
        int i;
        //for(i = 0; i < foodPortion.length; i++){
        //    System.out.println(foodPortion[i]);
        //}
        int[] kcalPerPortion = new int[] {62, 74, 165, 33};

        int[] breakfast = new int[]{2, 3};
        int[] lunch = new int[]{0, 1, 2, 1};
        int[] dinner = new int[]{2, 3};

        System.out.println("    Breakfast");
        System.out.println("=================");

            for(i = 0; i < breakfast.length; i++) {
               System.out.println(breakfast[i] + foodPortion[i]);
            }
        System.out.println("      Lunch");
        System.out.println("=================");

            for(i = 1; i < lunch.length; i++) {
                System.out.println(lunch[i] + foodPortion[i]);
            }
        System.out.println("     Dinner");
        System.out.println("=================");

            for(i = 0; i < dinner.length; i++) {
                System.out.println(dinner[i] + foodPortion[i]);
            }

        System.out.println("=================");
        int breakfastcal = kcalPerPortion[0] + kcalPerPortion[1];
        int lunchcal = kcalPerPortion[1] + kcalPerPortion[2] + kcalPerPortion[3];
        int dinnercal = kcalPerPortion[0] + kcalPerPortion[1];
        int daycal = breakfastcal + lunchcal + dinnercal;
        System.out.println("Breakfest : " + breakfastcal + " kcal");
        System.out.println("Lunch : " + lunchcal + " kcal");
        System.out.println("Dinner : " + dinnercal  + " kcal");
        System.out.println("Today : " + daycal + " kcal");
    }


}
