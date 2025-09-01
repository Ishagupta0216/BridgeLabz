import java.util.*;

class PeriofRec {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("length - ");
        int l = sc.nextInt();
        System.out.print("width - ");
        int w = sc.nextInt();
        int peri = 2 * (l + w);
        System.out.println("Perimeter = " + peri);
    }
}
