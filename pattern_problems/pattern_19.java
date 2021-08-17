package pattern_problems;

import java.util.Scanner;

public class pattern_19 {

	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = n/2;
        int nsp = 1;
        int rows = 1;
        while (rows <= n) {
            if (rows == 1 || rows == n) {
                for (int cst = 1; cst <= n; cst++) {
                    System.out.print("*");
                }
            } else {
                for (int cst = 1; cst <= nst; cst++) {
                    System.out.print("*");
                }
                for (int csp = 1; csp <= nsp; csp++) {
                    System.out.print(" ");
                }
                for (int cst = 1; cst <= nst; cst++) {
                    System.out.print("*");
                }
                if (rows <= n / 2) {
                    nst -= 1;
                    nsp += 2;
                } else {
                    nst += 1;
                    nsp -= 2;
                }

            }

            System.out.println();

            rows++;

        }
    }

}
