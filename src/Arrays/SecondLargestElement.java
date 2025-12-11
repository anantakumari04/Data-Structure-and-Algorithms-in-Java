package Arrays;

import java.util.Scanner;

public class SecondLargestElement {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an array: ");

        int n = sc.nextInt();

        System.out.println("Enter elements in an array: ");

        int arr[] = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int lar = arr[0];
        int secondlar = -1;

        for(int i = 0; i<n; i++){
            if(arr[i]>lar){
                secondlar = lar;
                lar = arr[i];
            }
            else if(arr[i] < lar && arr[i] > secondlar){
                secondlar = arr[i];
            }
        }
        System.out.print("Second largest element in an array is: "+secondlar);




    }
}
