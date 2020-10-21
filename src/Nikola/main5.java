package Nikola;

import java.util.Scanner;
import java.util.stream.IntStream;

public class main5 {
    public static void main(String[] args) {
        Scanner SCA = new Scanner(System.in);
        System.out.print("Your number ");
        int n1 = SCA.nextInt();

        int[] arr = new int[]{2, 2, 2, 3, 10, 11, 15, 20, 22,28, 33, 44, 72};

        boolean result = IntStream.of(arr).anyMatch(x -> x == n1);

        if (result) {
            System.out.println("Your number is in the array and is number " + n1);
        } else {
            System.out.println("Nothing found");
        }

        int n = arr.length;
        int x = n1;
        if (countOccurrences(arr, n, x) == 0){
            System.out.println("Noting found");
        }
        else {
            System.out.print(countOccurrences(arr, n, x));
        }



    }
        static int binarySearch(int arr[], int l,
        int r, int x)
        {
            if (r < l)
                return -1;

            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, l,
                        mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }

        // Returns number of times x
        // occurs in arr[0..n-1]
        static int countOccurrences(int arr[],
        int n, int x)
        {
            int ind = binarySearch(arr, 0,
                    n - 1, x);

            // If element is not present
            if (ind == -1)
                return 0;

            // Count elements on left side.
            int count = 1;
            int left = ind - 1;
            while (left >= 0 &&
                    arr[left] == x)
            {
                count++;
                left--;
            }

            // Count elements
            // on right side.
            int right = ind + 1;
            while (right < n &&
                    arr[right] == x)
            {
                count++;
                right++;
            }

            return count;
        }


        // Driver code

    }

