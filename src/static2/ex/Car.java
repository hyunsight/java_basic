package static2.ex;

public class Car {
    private String name;
    private static int totalCars;

    //단축키: alt + enter > 생성자 직접 생성하기 전 객체 생성된 부분에서 단축키 사용 시 자동으로 생성자 생성
    public Car(String name) {
        System.out.println("차량 구입, 이름: " + name);
        this.name = name;
        totalCars++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + totalCars);
    }
}

