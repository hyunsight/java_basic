package final1;

public class ConstantMain2 {

    //상수 사용 시
    //- 값을 중앙에서 하나로, 일관되게 관리
    //- 애플리케이션이 실행되는 동안에는 고정 보장
    //- 한군데만 수정하면 됨
    //- magic number 이슈 해결 (변수명 통해 문맥 제공 및 추론 가능, 사람 인지 가능)
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수: " + Constant.MAX_USERS);
        int currentUserCount = 999;

        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수: " + currentUserCount);
        if (currentUserCount > Constant.MAX_USERS) {
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참여합니다.");
        }
    }
}
