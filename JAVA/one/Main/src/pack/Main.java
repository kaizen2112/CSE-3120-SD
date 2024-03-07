package pack;
public class Main {

    public static void main(String[] args) {

        Student kunal = new Student();

        Student kazi = kunal;
        kunal.roll = 13;
        System.out.println(kazi.name);
        System.out.println(kazi.roll);
        System.out.println(kazi.marks);

        Student zawad = new Student(24, "Kazi Zawad", 90.9f);
        System.out.println(zawad.name);
        System.out.println(zawad.roll);
        System.out.println(zawad.marks);

        Student one = new Student();
        Student two = one;
        one.name = "Bkcd";
        System.out.println(one.name);
        System.out.println(two.name);

    }
}

class Student {
    int roll;
    String name;
    float marks;

    Student() {
        this.roll = 14;
        this.name = "Kazi Tasrif";
        this.marks = 89.5f;
    }

    Student(int rno, String nam, float mrks) {
        this.roll = rno;
        this.name = nam;
        this.marks = mrks;
    }
}
