package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        /**
         * 배열을 사용하여 코드 중복은 줄였지만, 여전히 문제가 존재한다.
         *
         * 문제점:
         * - 한 학생의 데이터가 3개의 배열(예: 이름, 나이, 성적 등)로 분리되어 관리된다.
         * - 따라서 한 학생의 정보를 수정하거나 삭제할 때, 3개의 배열을 모두 동일하게 갱신해야 한다.
         *
         * 결론:
         * - 데이터 일관성을 유지하기 어렵고, 사람이 관리하기에는 비효율적인 구조이다.
         */

        /**
         * String 타입 묶기
         */
        String[] studentNames = {"학생1", "학생2"};

        /**
         * int형 타입 묶기
         */
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        /**
         * 출력
         */
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름: " + studentNames[i] + "나이: " + studentAges[i] + "성적: " + studentGrades[i]);
        }
    }
}
