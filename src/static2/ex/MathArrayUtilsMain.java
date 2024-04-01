package static2.ex;

public class MathArrayUtilsMain {
    //사용하는 개발자가 히스토리 모르고 별도 객체 생성 시 메모리 불필요하게 낭비
    //- 따라서 제공하는 개발자는 객체 생성하지 않도록 제약 제공 필요

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};

        System.out.println("sum = " + MathArrayUtils.sum(values));
        System.out.println("average = " + MathArrayUtils.average(values));
        System.out.println("min = " + MathArrayUtils.min(values));
        System.out.println("max = " + MathArrayUtils.max(values));
    }
}