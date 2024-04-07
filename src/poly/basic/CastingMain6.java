package poly.basic;

public class CastingMain6 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();

        //Child 인스턴스인 경우 childMethod() 실행
        if (parent instanceof Child child) { //변수 선언 동시 가능 (보장이 되기 때문에 다운 캐스팅 포함 > 생략 가능)
            //Child c = parent;와 동일
            System.out.println("Child 인스턴스 맞음");
//            Child child = (Child) parent;
            child.childMethod();
        } else {
            System.out.println("Child 인스턴스 아님");
        }

    }
}
