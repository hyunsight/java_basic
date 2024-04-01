package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
//        instanceValue++; //인스턴스 변수 접근, compile error
//        instanceMethod(); //인스턴스 메서드 접근, compile error
        //[자기 자신 내부에서 접근 시]
        //인스턴스 변수 및 메서드는 힙영역에서 생성되므로 접근 불가 (참조값 정보 있어야 함)
        //- 여러개 인스턴스 생성되었을 때 어떤 인스턴스를 참조해야할지도 불명확
        //- 인스턴스는 참조값으로 접근, static은 클래스(명)으로 접근

        staticValue++; //정적 변수 접근 (가능)
        staticMethod(); //정적 메서드 접근 (가능)
    }

    public static void staticCall(DecoData data) {
        //[자기 자신 외부에서 접근 시]
        //외부에서 참조값 넘겨옴 > 해당 참조값 통해 접근 가능 (참조값/주소 아므로) > instance 변수 및 메서드 호출 가능
        data.instanceValue++;
        data.instanceMethod();
    }

    public void instanceCall() {
        instanceValue++; //인스턴스 변수 접근 (가능)
        instanceMethod(); //인스턴스 메서드 접근 (가능)

        staticValue++; //정적 변수 접근 (가능), DecoData.staticValue++;와 동일 (생략)
        staticMethod(); //정적 메서드 접근 (가능), DecoData.staticMethod();와 동일 (생략)
    }


    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }


}
