package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        //다른 패키지 내 동일한 이름의 클래스를 사용하고 싶은 경우, 패키지명 직접 작성 필요
        // - 이미 User 이름의 클래스를 임포트하였으므로 겹칠 수 없음 (임포트는 1개만 가능)
        // - 보통 자주 사용하는 클래스는 import하고, 자주 사용하지 않는 클래스를 import하지 않음
        pack.b.User userB = new pack.b.User();

        //단축키: command + shift + g > 경로 검색/이동
    }
}
