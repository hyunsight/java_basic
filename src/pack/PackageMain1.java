package pack;

public class PackageMain1 {

    public static void main(String[] args) {
        //본인과 같은 패키지인 경우, 클래스명만 작성
        // - 패키지 경로 생략
        Data data = new Data();

        //본인과 다른 패키지인 경우, 풀네임으로 작성
        // - 풀네임 (full name): 패키지명 + 클래스명
        pack.a.User user = new pack.a.User();
    }
}


