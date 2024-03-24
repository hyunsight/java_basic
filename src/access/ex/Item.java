package access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    //캡슐화 고려
    // - 자기 자신 데이터를 가지고 계산하는 메서드의 경우, 자기 자신 클래스(Item) 안에서 생성
    // - 속성과 기능이 근처에 있는 거를 쓰는게 좋은 캡슐화
    // - 추후 수정, 변경 등이 발생해도 본인만 수정하면 됨
    public int getTotalPrice() {
        return price * quantity;
    }
}
