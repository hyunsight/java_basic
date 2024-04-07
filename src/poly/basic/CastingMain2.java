package poly.basic;

public class CastingMain2 {

    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child(); //x001

        //- 단, 자식의 기능은 호출할 수 없다. 컴파일 오류 발생
//        poly.childMethod();

        //다운캐스팅 (down-casting, 부모 타입 -> 자식 타입)
        Child child = (Child) poly; //x001, 강제 타입 (다운) 변환
        child.childMethod();

        //일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅 (새로운 변수에 담아서 다운캐스팅하는 과정이 번거로우므로)
        //- 연산자 우선순위에 따라 괄호 추가
        ((Child) poly).childMethod();

    }
}
