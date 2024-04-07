package poly.basic;

//upcasting vs downcasting
public class CastingMain3 {

    public static void main(String[] args) {
        Child child = new Child();

        Parent parent1 = (Parent) child; //원래는 다른 타입에 들어갈 때 casting을 해줘야 함. 단, 업케스팅은 생략 가능, 생략 권장(기본)
        Parent parent2 = child; //업캐스팅 생략 (자바가 알아서, 자동으로 캐스팅해줌)

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
