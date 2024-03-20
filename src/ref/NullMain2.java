package ref;

public class NullMain2 {

    public static void main(String[] args) {
        Data data = null;
        data.value = 10; //객체 접근 > 주소 없음(Null) > NullPointerException 예외 발생 > 프로그램 종료 (밖으로 빠져나감)
        //Null 발생한 기준 이후의 코드(아래)는 실행되지 않음
        System.out.println("data = " + data.value);
    }
}
