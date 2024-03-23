package construct;

public class MemberDefaultMain {

    public static void main(String[] args) {
        //생성자 없는 케이스
        // - 이 경우, 자바가 기본 생성자 만들어 줌 (빈 생성자)
        // - 생성자를 만들든 만들지 않든 생성자는 무조건 호출이 됨
        MemberDefault memberDefault = new MemberDefault();
    }

}
