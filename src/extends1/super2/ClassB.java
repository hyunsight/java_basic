package extends1.super2;

public class ClassB extends ClassA {

    public ClassB(int a) {
        //추가
        //- 첫줄에 super 대신 this 사용 가능, 단 super()는 반드시 1회 호출 필요
//        this(a, 0); //자기 자신의 생성자 중 다른 생성자 호출, 다른 생성자 호출 시 super() 호출하므로 가능

        super(); //부모의 기본 생성자(매개 변수 없는 경우) 생략 가능 > 자바가 자동으로 생성해줌
        System.out.println("ClassB 생성자 a = " + a);
    }

    public ClassB(int a, int b) {
        super(); //기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a = " + a + ", b = " + b);
    }
}
