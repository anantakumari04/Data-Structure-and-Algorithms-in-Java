package Arrays;

import java.util.Scanner;

public class Tryyy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long p = sc.nextLong();
            long q = sc.nextLong();

            if (p == q || 3*p < 2*q) {
                System.out.println("Alice");
            } else {
                System.out.println("Bob");
            }
        }
    }
}
