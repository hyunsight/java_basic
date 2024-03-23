package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //추가
    // - 생성자 오버로딩
    MemberConstruct(String name, int age) {
        //this()
        //- 자기 자신의 생성자를 호출 / '생성자 안에서만' 사용 가능 (생성자 내부에서 자신의 생성자를 호출)
        //- 생성자간 중복 로직이 있는 부분을 효율적으로 처리하기 위해 사용 (중복 제거 가능)
        //- 사용 규칙으로 this()는 '생성자 코드의 첫줄에만' 작성 가능 (첫줄 이후에 작성 시 컴파일 오류)
        this(name, age, 50); //변경
//        this.name = name;
//        this.age = age;
//        this.grade = 50; //이름과 나이가 있으면 성적은 50점부터 시작한다는 의미로 추가
    }


    //생성자
    //- 메서드와 비슷하지만 클래스명과 동일하게 이름 사용
    //- 반환 타입 없음 (비워두어야 함)
    //- 사실상 편의기능에 해당
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}