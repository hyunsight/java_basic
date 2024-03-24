package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        //검증 로직
        // - 검증/실행 개념을 나누어 여러가지 검증 로직이 있는 경우에는 실행 로직 위에 검증 로직 작성 (코드 명확히 분리되는 장점 존재)
        // - 검증 로직 통과하지 못하면 return으로 빠져나가게 하고, 검증 로직 통과하면 실행 로직 실행하도록 함
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        //실행 로직
        count++;

        /*
        위와 동일 (Return 제거하는 대신)
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
        } else {
            count++;
        }
        */

    }

    public int getCount() {
        return count;
    }
}
