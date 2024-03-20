package ref;

public class NullMain4 {

    //멤버 변수가 Null인 케이스 해결
    public static void main(String[] args) {
        BigData bigData = new BigData();
        //해결하기 위해서 bigData의 data에 참조할 곳(참조값)을 줌
        bigData.data = new Data();

        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        System.out.println("bigData.data.value = " + bigData.data.value);
    }

    //결론
    // - NullPointerException이 발생하면 null 값에 '.'을 찍었다고 생각하면 됨 (Null에 접근)
}
