package Arrays;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");

        int n = sc.nextInt();

        System.out.print("Enter elements of an array: ");

        int arr[] = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int i = 0;

        for(int j = 1; j<n; j++){
            if(arr[j] != arr[i]){

                arr[i+1] = arr[j];
                i++;

            }
        }

        for(int k = 0; k<=i; k++){

            System.out.print(arr[k]);
        }

    }
}
