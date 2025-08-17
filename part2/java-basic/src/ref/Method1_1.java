package ref;

public class Method1_1 {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.name = "학생1";
        std1.age = 15;
        std1.grade = 90;

        Student std2 = new Student();

        std2.name = "학생2";
        std2.age = 16;
        std2.grade = 80;

        printStudent(std1);
        printStudent(std2);

        System.out.println("이름: " + std1.name + ", 나이: " + std1.age + ", 성적: " + std1.grade);
        System.out.println("이름: " + std2.name + ", 나이: " + std2.age + ", 성적: " + std2.grade);
    }


    static void printStudent(Student std) {
        System.out.println("이름: " + std.name + ", 나이: " + std.age + ", 성적: " + std.grade);
    }
}
