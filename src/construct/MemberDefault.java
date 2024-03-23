package construct;

public class MemberDefault {
    String name;

    //자바에서 기본 생성자 생성
//    public MemberDefault() {}

    //사용자 정의한 기본 생성자 생성
    // - 이 경우, 자바에서 기본 생성자 별도로 생성하지 않음
    // - 또다른 생성자 하나라도 있으면 자바에서는 기본 생성자 만들지 않음 (별도로 기본 생성자 생성 필요)
    MemberDefault() {
        System.out.println("생성자 호출");
    }
}
