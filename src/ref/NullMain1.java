package ref;

public class NullMain1 {

    public static void main(String[] args) {
        Data data = null; //참조형에서만 null 사용 가능
        System.out.println("1. data = " + data);
        data = new Data();
        System.out.println("2. data = " + data);
        data = null; //주소지 제거하고 싶을 때
        System.out.println("3. data = " + data);
    }

    //GC = Garbage Collection
    // - 아무도 참조하지 않는 인스턴스의 최후
    // - 자바는 아무도 참조하지 않는 인스턴스에 대해 자동으로 처리
    // - JVM의 GC가 더이상 사용하지 않는 인스턴스라 판단 후 해당 인스턴스를 자동으로 메모리에서 제거 > 자바의 큰 장점
    // - 객체를 참조하는 곳이 있으면 JVM이 종료할 때까지 계속 생존
    //   단, 참조하는 곳이 모두 사라지면 그 때 JVM은 필요없는 객체로 판단하고 GC를 사용해서 처리 (메모리에서 제거)
    // - 보통은 지역 변수가 사라지는 시점(범위 종료)에 처리하는 케이스가 많음
    // - 사람이 수동으로 하나씩 제거하는 것보다 가비지 컬렉션을 사용하는 것이 효율적인 경우가 많음 (최적화)
}
