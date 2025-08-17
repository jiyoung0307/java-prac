package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10;    // 참조할 객체 인스턴스가 존재하지 않기 때문에 NullPointerException 예외 발생
        System.out.println("data = " + data.value);
    }
}
