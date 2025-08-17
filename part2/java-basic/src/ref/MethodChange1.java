package ref;

/**
 * 기본형과 메서드 호출
 * - 대원칙: 자바는 항상 변수의 값을 복사해서 대입한다.
 */

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메소드 호출 전: a = " + a);   // 메소드 호출 전: a = 10
        // a의 값(10)을 복사해서 메서드의 매개변수 x에 전달
        changePrimitive(a);     // 메소드 호출, 값 전달: 10
        System.out.println("메소드 호출 후: a = " + a);   // 메소드 호출 후: a = 10 (변경되지 않음)
    }

    static void changePrimitive(int x) {
        // a의 값이 복사되어 x에 전달됨 (x = 10)
        x = 20; // x의 값을 변경해도 main의 a에는 영향 없음
        // 메서드가 종료되면 x는 사라진다.
    }
}
