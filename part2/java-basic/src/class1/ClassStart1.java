package class1;

public class ClassStart1 {
    public static void main(String[] args) {
        /**
         * 문제 상황:
         * - 학생이 추가될 때마다 매번 새로운 변수를 선언해야 하는 불편함이 발생한다.
         *
         * 해결 방법:
         * 1. 단순히 반복문을 사용하는 것은 적절하지 않다.
         *    → 이유: 학생마다 변수 이름이 달라서 반복문으로 처리하기 어렵다.
         *
         * 2. 변수 이름을 통일할 필요가 있다.
         *    → 같은 데이터 타입의 값을 하나로 묶어 관리할 수 있는 배열을 사용하면 된다.
         *
         * 결론:
         * - 배열을 사용하면 학생 수가 늘어나더라도 동일한 방식으로 데이터를 관리할 수 있어 문제를 해결할 수 있다.
         */
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;

        System.out.println("이름: " + student1Name + "나이: " + student1Age + "성적: " + student1Grade);
        System.out.println("이름: " + student2Name + "나이: " + student2Age + "성적: " + student2Grade);
    }
}
