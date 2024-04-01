package final1;

public class FinalFieldMain {

    public static void main(String[] args) {
        //final 필드 - 생성자 초기화
        //- final 쓰더라도 변수로서 의미가 있음 (인스턴스마다 값이 다르므로)
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10); //이후로 해당 값 수정 불가 (생성자 통해 딱 한번만 설정 가능)
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        //final 필드 - 필드 초기화
        //- 모든 인스턴스가 같은 값을 사용 > 결과적으로 메모리 낭비 (메모리 중복 및 의미가 없음)
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        //상수
        //- 모든 인스턴스가 같은 값 사용/고정되었을 때의 문제점을 해소하기 위해 static 사용 (같은 값 공유하므로)
        //  : static 영역은 단 하나만 존재하므로 중복 및 메모리 비효율 문제 모두 해결 가능
        //- 바뀌지 않는 공용 변수
        //- 결과적으로 필드에 final(고정) + 필드 초기화를 사용하는 경우, static을 붙여서 사용하는 것이 효과적임
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);
    }
}
