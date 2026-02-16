package Arrays;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class UnionOfTwoSortedArrays {

     public static void main(String[] args) {

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
         System.out.print("Enter elements for 1st array");

         int[] b = new int[n2];

         for(int i = 0 ; i<n2; i++){
             b[i] = sc.nextInt();
         }

         int i = 0, j = 0;

         ArrayList<Integer> answer = new ArrayList<>();


         while (i < n1 && j < n2) {

             if (a[i] == b[j]) {
                 if (answer.size() == 0 || answer.get(answer.size() - 1) != a[i]) {
                     answer.add(a[i]);
                 }
                 i++;
                 j++;
             }
             else if (a[i] < b[j]) {
                 if (answer.size() == 0 || answer.get(answer.size() - 1) != a[i]) {
                     answer.add(a[i]);
                 }
                 i++;
             }
             else {
                 if (answer.size() == 0 || answer.get(answer.size() - 1) != b[j]) {
                     answer.add(b[j]);
                 }
                 j++;
             }
         }
         while(j<n2){
             if(answer.size()==0 || answer.get(answer.size()-1) != b[j]){
                 answer.add(b[j]);
             }
             j++;
         }



         while(i<n1){
             if(answer.size()==0 || answer.get(answer.size()-1) != a[i]){
                 answer.add(a[i]);
             }
             i++;

         }

         System.out.println("Union of 2 arrays: ");
         for(int k = 0; k<answer.size(); k++){
             System.out.print(answer.get(k) + " ");
         }


     }
}
