class TestVar {
    int x = 10;

    void show() {
        int x = 20;
        System.out.println("Local x - " + x);
        System.out.println("Instance x - " + this.x);
    }
}

public class LocalvsInstance {
    public static void main(String[] args) {
        TestVar obj = new TestVar();
        obj.show();
    }
}
