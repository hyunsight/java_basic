package extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        //부모가 기본 생성자가 없으면 super()를 직접 정의 필요
        //- super()를 생략할 수 있는 경우는 기본 생성자인 경우에만 가능 (기본 생성자 없는 경우 직접 정의 필요)
        super(10, 20);
        System.out.println("ClassC 생성자");
    }
}
