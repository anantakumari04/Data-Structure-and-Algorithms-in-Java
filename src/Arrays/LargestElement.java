package Arrays;

import java.util.Scanner;

public class LargestElement {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an array: ");

        int n = sc.nextInt();

        System.out.println("Enter elements in an array: ");

        int arr[]= new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int mx = arr[0];

        for(int i = 0; i<n; i++){
            if(arr[i]>mx){
                mx = arr[i];
            }
        }
        System.out.print("Max in an array is: "+mx);

    }

}
