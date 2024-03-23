package construct;

public class ConstructMain1 {

    public static void main(String[] args) {
        //(): 생성자를 부르는 역할
        //- 객체 생성과 동시에(메모리에 생성 후) 생성자 호출 > 따라서 생성자명의 경우, 클래스명과 동일
        //- 생성자의 장점으로 '제약' > 직접 정의한 생성자를 넣지 않을 시 컴파일 오류 (즉, 강제적으로/필수로 호출)
        //  : 아무 정보가 없는 유령 회원이 시스템 내부에 등장할 가능성을 원천 차단 > 따라서 필수값을 생성자에서 많이 받음 (보조적인 값은 따로)
        //  : 생성자를 사용하면 필수값 입력을 보장할 수 있음
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}
