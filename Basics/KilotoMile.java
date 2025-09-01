import java.util.*;

class KilotoMile {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("kilometers - ");
        double km = sc.nextDouble();
        double miles = km * 0.621371;
        System.out.println("Miles = " + miles);
    }
}
