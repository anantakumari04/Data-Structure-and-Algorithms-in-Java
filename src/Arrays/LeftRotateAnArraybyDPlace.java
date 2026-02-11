package Arrays;

import java.util.Scanner;

public class LeftRotateAnArraybyDPlace {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");

        int n = sc.nextInt();

        System.out.print("Enter elements of an array: ");

        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter d number: ");
        int d = sc.nextInt();

        d = d%n;

        int[] temp = new int[d];

        for(int i = 0; i<d; i++){
            temp[i] = arr[i];
        }

        for(int i = d; i<n; i++){
            arr[i-d] = arr[i];
        }

        for(int i = n-d; i<n; i++){
            arr[i] = temp[i-(n-d)];
        }
        for(int i = 0; i<n;i++){
            System.out.println(arr[i]);
        }


    }
}
