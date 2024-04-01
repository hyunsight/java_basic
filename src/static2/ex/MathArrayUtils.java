package static2.ex;

public class MathArrayUtils {
    //사용하는 개발자가 히스토리 모르고 별도 객체 생성 시 메모리 불필요하게 낭비
    //- 따라서 제공하는 개발자는 객체 생성하지 않도록 제약 제공 필요
    private MathArrayUtils() {
        // private 인스턴스 생성을 막는다. (따라서 객체 생성하지 못하도록 함)
        // 이를 통해 사용하는 개발자는 생성하고 쓰지 말라는 것을 알 수 있음
    }

    public static int sum(int[] values) {
        int total = 0;

        for (int value : values) {
            total += value;
        }
        return total;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int minValue = values[0];

        for (int value : values) {
           if(minValue > value) {
               minValue = value;
           }
        }
        return minValue;

    }

    public static int max(int[] values) {
        int maxValue = values[0];

        for (int value : values) { //다소 비효율적일 수 있음 (index 0부터 비교하므로) > 따라서 for문 통해 i = 1부터 비교할 수 있도록 처리하는 것도 좋음
            if(maxValue < value) {
                maxValue = value;
            }
        }

        return maxValue;
    }
}
