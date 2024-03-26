package static1;

public class Data3 {
    public String name;
    public static int count; //static

    public Data3(String name) {
        this.name = name;
        count++; //count 변수는 메서드 영역, 즉 클래스에서 직접 관리하는 변수이므로 원래는 Data3.count++로 작성해야 하나, 자기 자신 클래스 안이므로 Data3. 생략 가능
    }
}
