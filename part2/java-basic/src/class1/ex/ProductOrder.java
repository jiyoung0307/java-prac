package class1.ex;
/**
 * 문제: 상품 주문 시스템 개발
 */

/**
 * 문제 설명 : 당신은 온라인 상점의 주문 관리 시스템을 만들려고 한다.
 * 먼저, 상품 주무 정보를 담을 수 있는 ProductOrder 클래스를 만들어보자.
 *
 * 요구 사항
 * 1. ProductOrder 클래스는 다음과 같은 멤버 변수를 포함해야 한다.
 * - 상품명 (productName)
 * - 가격 (price)
 * - 주문 수량 (quantity)
 * 2. ProductOrderMain 클래스 안에 main() 메서드를 포함하여, 여러 상품의 주문 정보를 배열로 관리하고, 그 정보들을 출력하고,
 * 최종 결제 금약을 계산하여 출력하자.
 */
public class ProductOrder {
    String productName; // 상품명
    int price;  // 가격
    int quantity;   // 주문 수량
}
