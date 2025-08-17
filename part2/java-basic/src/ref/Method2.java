package ref;

public class Method2 {
    public static void main(String[] args) {
        Student std1 = createStudent("학생1", 15, 90);
        System.out.println("========== std1= " + std1);     // ========== std1= ref.Student@23fc625e
        Student std2 = createStudent("학생2", 16, 80);
        System.out.println("========== std2= " + std2);     // ========== std2= ref.Student@3f99bd52

        printStudent(std1);
        printStudent(std2);
    }

    static Student createStudent(String name, int age, int grade) {
        Student std = new Student();
        System.out.println("std= " + std);
        std.name = name;
        std.age = age;
        std.grade = grade;

        return std; // 참조값 반환
    }

    static void printStudent(Student std) {
        System.out.println("이름: " + std.name + ", 나이: " + std.age + ", 성적: " + std.grade);
    }
}
