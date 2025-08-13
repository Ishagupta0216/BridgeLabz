import java.util.*;

class CeltoFar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Celsius Temp-");
        float c = sc.nextFloat();
        float f = (c * 9 / 5) + 32;
        System.out.println("Temp in Far - " + f);
    }
}
