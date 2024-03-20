package ref;

public class NullMain3 {

    //멤버 변수가 Null인 케이스
    public static void main(String[] args) {
        BigData bigData = new BigData();
        //신규 객체 생성 시, 초기값 설정
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data); //참조형 초기값 = null

        //NullPointerException 발생
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
