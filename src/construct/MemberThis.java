package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        //this. 생략 가능: 지역 변수(메소드 매개변수)에 없으므로
        // - 이 경우, 자바에서 '자동으로' this.을 붙임
        nameField = nameParameter;
        //this. 항상 사용하는 코딩 스타일도 존재 (결과는 동일)
        // - 코드 안에서 멤버 변수에 접근할 경우, 무조건 'this' 붙이는 방식
        // - 이 경우, 멤버 변수를 사용한다는 것을 눈으로 쉽게 확인할 수 있으므로 과거에 많이 사용 > 단, 현재는 권장하지 않음
        // - 즉, this는 꼭 필요한 경우에만 사용
//        this.nameField = nameParameter;
    }
}
