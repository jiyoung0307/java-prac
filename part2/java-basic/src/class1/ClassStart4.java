package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        /**
         * 배열을 사용하면 특정 타입의 데이터를 연속된 구조로 묶어서 관리할 수 있다.
         *
         * 적용:
         * - Student 클래스도 하나의 타입이므로, Student 객체들을 배열로 묶어 관리할 수 있다.
         * - 이를 통해 여러 학생 데이터를 하나의 데이터 구조에서 다룰 수 있다.
         *
         * 결론:
         * - 배열을 활용하면 Student 객체들을 체계적으로 관리할 수 있다.
         */

        Student student1 = new Student();   // student1는 참조값을 보관하는 것이 역할임
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        /**
         * Student 객체를 담을 수 있는 배열을 생성하고, 해당 배열에 student1과 student2 인스턴스를 저장한다.
         *
         * 설명:
         * - Student 타입의 변수는 Student 인스턴스의 참조값을 저장한다.
         * - Student 배열의 각 요소도 Student 타입 변수이므로, Student 인스턴스의 참조값을 저장한다.
         * - student1, student2는 Student 인스턴스의 참조값을 가진다.
         * - 배열 생성 시, 요소에는 아직 참조값이 할당되지 않았으므로 기본값인 null로 초기화된다.
         */
        Student[] students = new Student[2];
        students[0] = student1;   // 배열 첫 번째 요소에 student1 참조값 저장
        students[1] = student2;   // 배열 두 번째 요소에 student2 참조값 저장

        /**
         * 참고:
         * - 자바에서 대입 연산은 변수에 저장된 값을 복사하는 방식으로 이루어진다.
         *   예: students[0] = x001, students[1] = x002 (x001, x002는 인스턴스 참조값)
         */

        System.out.println("이름: " + students[0].name + " 나이: " + students[0].age + " 성적: " + students[0].grade);
        System.out.println("이름: " + students[1].name + " 나이: " + students[1].age + " 성적: " + students[1].grade);
    }
}
