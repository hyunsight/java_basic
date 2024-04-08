package poly.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {
    //단축키: option + command + n > inline variable > 변수 선언된 것을 제거하고 합쳐버림
        Animal[] animalArr = {new Dog(), new Cat(), new Caw(), new Duck(), new Pig()};

        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    //단축키2: (추출하고 싶은 코드 범위 선택 후) option + command + m > extract/introduce > extract method > 메서드 자동 추출
    //(새로운 동물이 추가되어도) 변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    //샷건 효과: 하나의 변수를 변경했을 때 변경/영향 범위
    //- 좋은 코드란 샷건 효과가 적은 코드임
    //- 나쁜 코드는 AnimalPolyMain1임

    //남은 문제:
    //- Animal 클래스를 생성할 수 있는 문제
    //  동물이라는 추상적인 개념이 실제로 존재하는 것은 이상함 > 생성된 인스턴스는 작동은 하지만 제대로된 기능을 수행하지는 않음
    //- Animal 클래스를 상속 받는 곳에서 sound() 메서드 오버라이딩을 하지 않을 가능성
}
