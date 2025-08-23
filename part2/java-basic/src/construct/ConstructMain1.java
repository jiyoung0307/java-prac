package construct;

/**
 * 생성자의 장점
 * - 중복 호출 제거
 * - 생성자 호출 필수(제약) -> 메소드를 실수로 호출하지 않아도 프로그램은 작동함
 * - 객체를 생성할 때 직접 정의한 생성자가 있다면 직접 정의한 생성자를 반드시 호출해야 함
 * 참고로, 생성자를 메소드 오버로딩처럼 여러 개 정의할 수 있는데, 이 경우 하나만 호출하면 됨
 *
 */
public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1",15,90);
        MemberConstruct member2 = new MemberConstruct("user2",16,80);

        MemberConstruct[] members = {member1, member2};
        for (MemberConstruct s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}
