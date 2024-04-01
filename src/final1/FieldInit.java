package final1;

public class FieldInit {

    //상수
    //- static + final 사용
    //- static final 사용 시, 변수명 대문자로 작성
    static final int CONST_VALUE = 10;

    final int value = 10;

    //위와 같이 초기값을 이미 설정한 경우, 생성자를 통해 값 초기화 불가능: final 설정 및 이미 값 할당된 상태이므로
    //- final은 값 한번 설정되면 이후 값 변경 불가능
//    public FieldInit(int value) {
//        this.value = value; //컴파일 오류 발생
//    }
}
