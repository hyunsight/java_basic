package memory;

public class JavaMemoryMain1 {
    //stack 구조 대표적인 예시

    public static void main(String[] args) {//args: java 프로그램 실행할 때 바깥에서 어떤 옵션들을 넣어줄 수 있음
        System.out.println("main start");
        method1(10);
        System.out.println("main end");
        //단축키: option + 화살표위 > 부분 영역 및 범위 선택/지정 (커서 있는 부분, extend selection)
    }

    static void method1(int m1) {
        System.out.println("method1 start");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1 end");
    }

    static void method2(int m2) {
        System.out.println("method2 start");
        System.out.println("method2 end");

    }
}
