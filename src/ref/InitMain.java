package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData(); //객체(인스턴스) 생성하면서 자바가 자동으로 멤버 변수 초기화 진행
        System.out.println("value1 = " + data.value1);
        System.out.println("value2 = " + data.value2);
    }
}
