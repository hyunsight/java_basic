package poly.ex3;

public class AbstractMain {

    public static void main(String[] args) {
        //추상클래스 생성 불가
        //- 일반 클래스와 동일하나, 생성이 불가하다는 제약이 추가된 클래스로 보면 됨
//        AbstractAnimal animal = new AbstractAnimal(); //컴파일 오류

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(duck);
    }

    private static void soundAnimal(AbstractAnimal animal) { //다형적 참조
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
