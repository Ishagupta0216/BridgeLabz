import java.util.*;

class Simpleinterest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Principal - ");
        float p = sc.nextFloat();
        System.out.print("Rate -  ");
        float r = sc.nextFloat();
        System.out.print("Time - ");
        float t = sc.nextFloat();
        float si = (p * r * t) / 100;
        System.out.println("Simple Interest = " + si);
    }
}
