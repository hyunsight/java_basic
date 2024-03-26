package static1;

public class DataCountMain3 {

    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count);

        //추가
        //- 인스턴스를 통한 접근 (가능)
        //  :인스턴스 접근 > 해당 변수는 static 변수인 것 확인 > 메서드 영역 안의 static 영역으로 다시 날라감 (실제 인스턴스 영역을 사용하지 X)
        //- 단, 해당 방안은 권장하지 않음 (코드 읽을 때, 인스턴스 변수인지 스태틱 변수인지 한눈에 구분 어려우므로)
        Data3 data4 = new Data3("D");
        System.out.println("D count = " + data4.count);
        //단축키: alt + enter > 액션 및 가이드 제공

        //-클래스를 통한 접근
        // :바로 static 영역으로 접근
        System.out.println("D count = " + Data3.count);
    }
}
