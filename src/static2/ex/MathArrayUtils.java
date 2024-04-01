package static2.ex;

public class MathArrayUtils {
    //사용하는 개발자가 히스토리 모르고 별도 객체 생성 시 메모리 불필요하게 낭비
    //- 따라서 제공하는 개발자는 객체 생성하지 않도록 제약 제공 필요
    private MathArrayUtils() {
        // private 인스턴스 생성을 막는다. (따라서 객체 생성하지 못하도록 함)
        // 이를 통해 사용하는 개발자는 생성하고 쓰지 말라는 것을 알 수 있음
    }

    public static int sum(int[] values) {
        int sum = 0;

        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    public static double average(int[] values) {
        double average = sum(values) / (double)values.length;

        return average;
    }

    public static int min(int[] values) {
        int min = values[0];

        for (int value : values) {
           if(min > value) {
               min = value;
           }
        }
        return min;

    }

    public static int max(int[] values) {
        int max = values[0];

        for (int value : values) {
            if(max < value) {
                max = value;
            }
        }

        return max;
    }
}
