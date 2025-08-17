package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = new Data();
        System.out.println("1. data = " + data);    // 1. data = ref.Data@23fc625e

        data = new Data();
        System.out.println("2. data = " + data);    // 2. data = ref.Data@3f99bd52

        data = null;
        System.out.println("3. data = " + data);    // 3. data = null
    }
}
