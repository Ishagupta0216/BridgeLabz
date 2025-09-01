class Student {
    String name;
    int marks;

    Student(String n, int m) {
        name = n;
        marks = m;
    }

    void checkResult() {
        if (marks >= 40)
            System.out.println(name + " Passed");
        else
            System.out.println(name + " Failed");
    }
}

public class StudentRes {
    public static void main(String[] args) {
        Student s1 = new Student("Amit", 55);
        Student s2 = new Student("Rita", 30);
        s1.checkResult();
        s2.checkResult();
    }
}
