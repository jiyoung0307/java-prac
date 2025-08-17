package ref;

/**
 * 기본형과 변수 대입
 */
public class VarChange1 {

    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("====================");

        // a 변경
        a = 20;
        System.out.println("변경 a= 20");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("====================");

        // b 변경
        b = 30;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

    }
}
