package Arrays;

import java.util.Scanner;

public class IfArrayisSorted {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an array: ");

        int n = sc.nextInt();

        System.out.println("Enter elements in an array: ");

        int arr[]= new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        boolean flag = false;

        for(int i = 1; i<n; i++){
            if(arr[i]>=arr[i-1]){
                flag = true;
            }
            else{
                flag = false;
                break;
            }


        }

        if(flag){
            System.out.println("Array is sorted");
        }
        else
            System.out.println("Array is not sorted.");

    }
}
