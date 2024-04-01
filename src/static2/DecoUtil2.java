package static2;

public class DecoUtil2 {
    //정적 메서드/클래스 메서드
    //- 별도 객체 생성 없이 클래스(명) 통해 바로 호출 가능
    //- 클래스 소속(관리)이 됨
    public static String deco(String str) {
        String result = "*" + str + "*";
        return result;
        //return "*" + str + "*"; 와 동일
    }
}
