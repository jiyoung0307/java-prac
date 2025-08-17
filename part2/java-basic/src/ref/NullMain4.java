package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();

        bigData.data = new Data();  // 여기에서 참조할 값을 주었기 때문에 데이터를 가지고 있음

        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);   // bigData.data = ref.Data@3a71f4dd

        /** NullPointerException 발생 */
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
