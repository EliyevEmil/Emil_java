package lesson107;

public class Main8 {
    public static void main(String[] args) {

        Student s1 = new Student("Ali", 12, 87.5);
        Student s2 = new Student("Murad", 12, 45.0);
        Student s3 = new Student("Leyla", 12, 72.0);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println();

        yoxla(s1);
        yoxla(s2);
        yoxla(s3);

        System.out.println();

        Student maxStudent = s1;

        if (s2.grade() > maxStudent.grade()) {
            maxStudent = s2;
        }

        if (s3.grade() > maxStudent.grade()) {
            maxStudent = s3;
        }

        System.out.println("Ən yüksək bal: " + maxStudent.name() + " - " + maxStudent.grade());
    }

    public static void yoxla(Student student) {
        if (student.isPassed()) {
            System.out.println(student.name() + " keçdi");
        } else {
            System.out.println(student.name() + " kəsildi");
        }
    }
}