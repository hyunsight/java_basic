package pack;

//import pack.a.User;
//import pack.a.User2;

//package a 안에 있는 모든 클래스를 사용하고 싶은 경우
import pack.a.*;

public class PackageMain2 {

    public static void main(String[] args) {
        Data data = new Data();
        //import 사용으로 패키지 명 생략 가능
        User user = new User();
        User2 user2 = new User2();
    }
}

