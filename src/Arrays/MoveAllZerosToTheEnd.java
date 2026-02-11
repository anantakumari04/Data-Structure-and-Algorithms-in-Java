package Arrays;

import java.util.Scanner;

public class MoveAllZerosToTheEnd {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");

        int n = sc.nextInt();

        System.out.print("Enter elements of an array: ");

        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int j = -1;

        for(int i = 0; i<n; i++){
            if(arr[i]==0){
                j = i;
                break;
            }
        }

        if(j==-1){
         for(int i = 0; i<n;i++){
             System.out.println(arr);
         }
        }

        for(int i = j+1; i<n; i++){
            if(arr[i]!=0){

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            j++;
            }
        }

        for(int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }


    }
}
