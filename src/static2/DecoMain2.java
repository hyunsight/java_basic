package static2;

public class DecoMain2 {

    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s); //인스턴스 없이 클래스로 바로 호출

        System.out.println("before: " + s);
        System.out.println("after: " + deco);

    }
}
