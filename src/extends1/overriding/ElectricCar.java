package extends1.overriding;

public class ElectricCar extends Car {
    //부모 기능 재정의
    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
