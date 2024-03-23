package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //추가
    void initMember(String name, int age, int grade) {
        //scope의 우선순위는 본인한테 가까운 순서 (메소드의 매개변수에 제일 가까움)
        //멤버 변수에 넣어주기 위해 및 매개변수명과 구분하기 위해 this.(인스턴스 가르킴) 붙임
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
