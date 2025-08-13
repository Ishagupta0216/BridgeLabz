import java.util.*;

class PowerCalc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("base - ");
        int base = sc.nextInt();
        System.out.print("exponent - ");
        int exp = sc.nextInt();
        double ans = Math.pow(base, exp);
        System.out.println("Result = " + ans);
    }
}
