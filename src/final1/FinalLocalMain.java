package final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        //final 지역 변수
        final int data1;
        data1 = 10; //(final의 경우) 최초 한번만 할당 가능
//        data1 = 20; //컴파일 오류: 값 변경 불가능

        //final 지역 변수2
        final int data2 = 10; //동시에 변수 선언 및 초기값 설정 가능
//        data2 = 20; //컴파일 오류: 초기값 이미 설정하였으므로 불가능

        method(10); //인수로 넘긴 파라미터의 경우 final로, 이미 10으로 주었기 때문에 값 변경 불가능 (값 고정)
    }

    static void method(final int parameter) {
        //매개변수 값(Parameter) 변경 불가능 > 메서드 호출 시점에 사용된 값이 끝까지 사용됨
//        parameter = 20; //컴파일 오류

    }
}
