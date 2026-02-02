package Arrays;

import java.util.Scanner;

public class LeftRotateanArraybyOnePlace
{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");

        int n = sc.nextInt();

        System.out.print("Enter elements of an array: ");

        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int temp = arr[0];
        for(int i = 1; i<n; i++){
            arr[i-1] = arr[i];

        }

        arr[n-1] = temp;
        for(int k = 0; k<n; k++){

            System.out.print(arr[k]);
        }



    }
}
