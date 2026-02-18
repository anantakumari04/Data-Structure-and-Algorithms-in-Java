package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionOfTwoArrays {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of 1st array: ");
        int n1 = sc.nextInt();

        System.out.print("Enter size of 2nd array: ");

        int n2 = sc.nextInt();

        System.out.print("Enter elements for 1st array");

        int[] a = new int[n1];

        for(int i = 0 ; i<n1; i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Enter elements for 2nd array");

        int[] b = new int[n2];

        for(int i = 0 ; i<n2; i++){
            b[i] = sc.nextInt();
        }

        ArrayList<Integer> answer = new ArrayList<>();

        int i = 0, j = 0;

        while(i<n1 && j<n2){
            if(a[i]<b[j])
                i++;
            else if(b[j]<a[i]){
                j++;
            }
            else{
                answer.add(a[i]);
                i++;
                j++;
            }
        }

        for (int k = 0; k<answer.size();k++){
            System.out.print(answer.get(k)+" ");

        }

    }

}
