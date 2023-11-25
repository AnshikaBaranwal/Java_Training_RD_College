

import java.util.Scanner;

public class PowerOfTwo {
    static boolean Power(int n) {
        if (n == 1) {
            return true;
        } else if (n % 2 != 0 || n == 0) {
            return false;
        } else {
            return Power(n / 2);
        }
    }

        public static void main (String[]args){
            boolean isPower = Power(16);
            if (isPower) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
            
        