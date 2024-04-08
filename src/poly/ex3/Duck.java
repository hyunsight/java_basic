package poly.ex3;

public class Duck extends  AbstractAnimal {
    //추상 클래스/메서드 덕분에 개발자가 오버라이딩 깜빡하여 발생할 수 있는 문제 방지 (컴파일 오류)

    @Override
    public void sound() {
        System.out.println("꽉꽉");
    }
}
