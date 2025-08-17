package class1;

public class ClassStart5 {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        // Student[] students = new Student[] {student1, student2};
        Student[] students = {student1, student2};

        /* 리팩토링 1 - 기본 for문 사용 : 인덱스 제어 필요할 때 유용
           - 인덱스를 직접 제어하면서 배열의 각 요소에 접근
           - 배열의 크기(students.length)를 기준으로 0부터 끝까지 반복
           - 인덱스를 활용해 특정 위치의 요소만 다루거나 조건을 걸기 유리
         */
        for (int i = 0; i < students.length; i++) {
            System.out.println("이름: " + students[i].name + " 나이: " + students[i].age + " 성적: " + students[i].grade);
        }

        /* 리팩토링 2 - 기본 for문 + 지역 변수 활용 : 코드 가독성 개선
           - 배열에서 꺼낸 요소를 Student 타입 변수(s)에 담아 사용
           - 코드가 조금 더 간결해지고, students[i]를 여러 번 쓰지 않아도 됨
         */
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }

        /* 향상된 for문 (for-each) : 단순 순회 시 가장 깔끔
           - 배열의 모든 요소를 순서대로 순회할 때 사용
           - 인덱스가 필요 없을 때 가장 간단한 형태
           - 내부적으로는 배열을 처음부터 끝까지 순서대로 탐색
         */
        for (Student s : students) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}
