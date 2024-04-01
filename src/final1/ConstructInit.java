package final1;

public class ConstructInit {
    final int value;

    //final 멤버 변수의 경우, 생성자 통해 값 할당 필요 (이후 값 변경 불가능)
    //- field를 사용할 경우, 생성자를 통해 한번 초기화
    public ConstructInit(int value) {
        this.value = value;
    }
}
