package extends1.overriding;

//부모클래스
public class Car {

    public void move() {
        System.out.println("차를 이동합니다.");
    }

    //추가
    public void openDoor() {
        System.out.println("문을 엽니다.");
    }
}
