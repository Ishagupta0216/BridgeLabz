class Rectangle {
    int length, width;

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    void calculate() {
        int area = length * width;
        int peri = 2 * (length + width);
        System.out.println("Area = " + area + ", Perimeter = " + peri);
    }
}

public class RecConst{
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 3);
        r.calculate();
    }
}
