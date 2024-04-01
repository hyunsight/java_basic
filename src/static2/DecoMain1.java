package static2;

public class DecoMain1 {

    public static void main(String[] args) {
        String s = "hello java";
        DecoUtil1 utils = new DecoUtil1();
        String deco = utils.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);

        //현재 DecoUtil은 기능만 제공함 (별도 멤버 변수 없음)
        //- 인스턴스만 계속 생성하더라도 기능만 사용함
        //- 따라서 객체 생성이 의미가 없음
        //- 객체를 여러개 생성하는 목적은 각각 다르게 설정하기 위함 > 그러나 메서드만 호출하기 위한 객체 생성 시에는 여러개 객체 만들어도 동일함 (값, 로직 모두 동일)
    }
}
