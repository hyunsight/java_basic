package construct;

public class ConstructMain2 {

    public static void main(String[] args) {
        //생성자 오버로딩
        // - 직접 정의한 생성자가 있을 경우, 생성자는 하나만 호출하면 됨
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}
