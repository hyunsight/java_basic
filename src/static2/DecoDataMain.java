package static2;

import static static2.DecoData.staticCall; //특정(지정) static 메서드 호출 가능
//import static static2.DecoData.*; //static 메서드 전체 호출 가능

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출3");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        staticCall(data1);

        //추가1
        //인스턴스를 통한 접근
        //- 사용 가능하나, 권장하지 않음 (인텔리제이에서도 추천하지 않음)
        //- 인스턴스(힙 영역) 접근 후 static인 것 확인하고 메서드 영역에 있는 static 영역으로 접근 (즉, 우회)
        DecoData data3 = new DecoData();
        staticCall();

        //클래스를 통한 접근
        //- 바로 메서드 영역에 있는 static 영역으로 접근
        staticCall();

        //추가2
        //static import
        //- 정적 메서드 여러번 호출 필요할 때(자주 쓸 때), 매번 클래스명을 계속해서 쓰기 불편함
        //- 단축키: optiona + enter > static import
//        DecoData.staticCall();
//        DecoData.staticCall();
//        DecoData.staticCall();
//        DecoData.staticCall();
//        DecoData.staticCall();

        //static import(또는 import static) 사용 후
        //- static2.DecoData.staticCall 해당 static을 사용한다고 선언
        //- 이 경우, 클래스명을 적지 않고 생략 가능
        staticCall();
        staticCall();
        staticCall();
        staticCall();
        staticCall();

    }
}
