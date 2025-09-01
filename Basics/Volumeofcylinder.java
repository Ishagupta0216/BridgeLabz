import java.util.*;

class Volumeofcylinder {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("radius - ");
        double r = sc.nextDouble();
        System.out.println("height - ");
        double h = sc.nextDouble();
        double volume = 3.1416 * r * r * h;
        System.out.println("Volume = " + volume);
    }
}
