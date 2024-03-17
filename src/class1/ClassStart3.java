package class1;

public class ClassStart3 {

    public static void main(String[] args) {
        //클래스 생성
        // 변수 선언
        // - 학생을 담아둘 수 있는 변수 선언 (메모리 할당)
        Student student1; //x001
        // 학생을 실제 메모리에 생성
        // - 학생은 총 3가지 데이터를 가지고 있음
        // - 학생 관련된 데이터를 'student1'이란 변수에 담아둠
        // - 해당 변수 통해 학생 사용
        student1 = new Student();

        //'.'을 이용해 클래스 접근 (package 생성 연상)
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); //변수 선언 및 메모리 생성, x002
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println(student1); //참조값 또는 주소 (16진수로 표현)
        System.out.println(student2);

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade);
    }
}
