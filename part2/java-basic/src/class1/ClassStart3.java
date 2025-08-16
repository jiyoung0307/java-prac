package class1;

public class ClassStart3 {
    public static void main(String[] args) {
    /**
     * 클래스, 객체, 인스턴스 개념 정리(클래스 → 객체 생성 → 참조값 → 변수 저장 → 활용)
     *
     * - 새로운 개념(예: 학생)을 코드로 표현하려면 클래스를 정의한다.
     * - 클래스를 실제로 사용하려면 new 키워드로 메모리에 객체를 생성해야 한다.
     * - 생성된 객체는 메모리 내 특정 위치에 저장되며, 해당 위치를 가리키는 값이 "참조값"이다.
     * - 참조값을 클래스 타입 변수에 저장하면, 변수를 통해 객체에 접근할 수 있다.
     * - 변수에 저장된 참조값을 이용해 객체의 필드(속성)에 접근하거나 값을 변경할 수 있으며,
     *   일반 변수처럼 활용할 수 있다.
     */

        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("student1: " + student1);    // class1.Student@23fc625e
        System.out.println("student2: " + student2);    // class1.Student@3f99bd52

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade);
    }
}
