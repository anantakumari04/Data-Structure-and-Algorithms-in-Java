import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter a number for square print: ");
//        int n = sc.nextInt();
//
//        for(int i = 0; i<n; i++){
//            for(int j = 0; j<n; j++){
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }

        Scanner  sc = new Scanner(System.in);
//
//        System.out.println("Enter a number for right angle triangle print: ");
//
//        int n = sc.nextInt();
//
//        for(int i = 0; i<n; i++){
//            for(int j = 0; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }


//        System.out.print("Enter a num for 123 print: ");
//         int n = sc.nextInt();
//
//         for(int i = 1; i<=n; i++){
//
//             for(int j = 1; j<=i; j++){
//                 System.out.print(j + " ");
//             }
//             System.out.println(" ");
//
//         }


//        System.out.print("Enter a num for 1 22 333 pattern: ");
//
//        int n = sc.nextInt();
//
//        for(int i = 1; i<=n; i++){
//            for(int j = 1; j<=i; j++){
//                System.out.print(i+" ");
//            }
//            System.out.println(" ");
//        }

//        System.out.println("Enter a num for reverse right angle triangle: ");
//
//        int n = sc.nextInt();
//
//        for(int i = 1; i<=n; i++){
//            for(int j = 0; j<n-i+1; j++){
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }

        System.out.print("Enter a num for triangluar pattern: ");

        int n = sc.nextInt();

        for(int i =0 ;i<n; i++){

            //space

            for(int j = 0; j<n-i-1; j++){
                System.out.print(" ");

            }
            //star
            for(int j = 0; j<2*i+1; j++){
                System.out.print("*");

            }
            //space
            for(int j = 0; j<n-0-1; j++){
                System.out.print(" ");

            }

            System.out.println();

        }





    }
}