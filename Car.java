class CarInfo {
    String brand;
    int speed;
    static int wheels = 4;

    CarInfo(String b, int s) {
        brand = b;
        speed = s;
    }

    void show() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + ", Wheels: " + wheels);
    }
}

public class Car {
    public static void main(String[] args) {
        CarInfo c1 = new CarInfo("BMW", 122);
        CarInfo c2 = new CarInfo("Audi", 159);
        CarInfo c3 = new CarInfo("Maruti", 92);

        c1.show();
        c2.show();
        c3.show();

        c1.wheels = 6; 
        c2.show(); 
    }
}
