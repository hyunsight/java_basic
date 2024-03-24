package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if(itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        //실제 실행 로직 (진짜 로직)
        items[itemCount] = item;
        itemCount++;
        //items[itemCount++] = item;도 가능
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i]; //items에서 item을 꺼냄
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
        }
        System.out.println("전체 가격 합: " + calculateTotalPrice());
    }

    //displayItems()안에서 작성해도 되나, 추후 유지보수 고려하였을 때 아래와 같이 전체 가격 합 메서드를 별도로 빼놓음
    // - 내부에서만 사용하므로 private 접근자로 생성
    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];//items에서 item을 꺼냄
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }

}
