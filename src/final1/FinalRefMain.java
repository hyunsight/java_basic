package final1;

public class FinalRefMain {

    public static void main(String[] args) {
        /*
        final Data data; //참조형 > final 선언
        data = new Data();
//        data = new Data(); //컴파일 오류 (final로 인해), 참조 대상 변경할 수 없음 (변수에는 참조값 들어있음)
        */

        final Data data = new Data();
//        data = new Data(); //컴파일 오류

        //단, 참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
