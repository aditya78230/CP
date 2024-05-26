// PROGRAM FOR GREATEST COMMON DIVISOR (GCD)

public class GCD {
    public static void main(String[] args) {
        int num1 = 36;
        int num2 = 48;

        int gcd = findGCD(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

// OUTPUT :
// GCD of 36 and 48 is: 12