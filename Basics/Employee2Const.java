class Employee {
    String name;
    double salary;

    Employee(String n) {
        name = n;
        salary = 0;
    }

    Employee(String n, double s) {
        name = n;
        salary = s;
    }

    void show() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

public class Employee2Const {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ravi");
        Employee e2 = new Employee("Priya", 50000);
        e1.show();
        e2.show();
    }
}
