package poly.ex3;

public class HelloAnimal extends AbstractAnimal {
    //부모의 추상 메서드를 오버라이딩하지 않을 시, 자식 클래스도 추상 클래스로 변경 필요! (불완전한 메서드를 가지고 있으므로)

    @Override
    public void sound() {
        System.out.println("HelloAnimal.sound");
    }
}
