package final1;

public class ConstantMain1 {

    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수: " + 1000);
        int currentUserCount = 999;

        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수: " + currentUserCount);
        if (currentUserCount > 1000) {
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참여합니다.");
        }
    }

    //이 상태에서 프로그램 최대 참여자 수를 1000 > 2000으로 변경하려고 했을 때의 문제점
    //- 두군데 수정 필요
    //- 히스토리를 모르는 개발자가 투입되어 유지보수할 경우, 1000이라는 숫자가 무슨 의미를 가지는지 정확히 파악 어려움
    //  : 이를 'magic number' (놀라운 숫자, 나를 깜짝 놀라게하는 숫자)라고 부름
}
