package access.a;

public class PublicClass {
    public static void main(String[] args) {
        //자기 자신의 클래스 생성 / 사용 가능
        PublicClass publicClass = new PublicClass();

        //같은 패키지 안의 클래스 생성 / 사용 가능
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}

class DefaultClass1 {

}

class DefaultClass2 {

}
