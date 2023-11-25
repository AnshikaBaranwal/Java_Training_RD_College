import java.util.Scanner;

public class PowerOfThree{
    static boolean Power(int n) {
        if (n == 1) {
            return true;
        } else if (n % 3 != 0 || n == 0) {
            return false;
        } else {
            return Power(n / 3);
        }
    }

        public static void main (String[]args){
            boolean isPower = Power(27);
            if (isPower) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
            
        
    

