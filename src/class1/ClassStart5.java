package class1;

public class ClassStart5 {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

//        Student[] students = new Student[]{student1, student2};
        Student[] students = {student1, student2}; //추가 최적화

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름: " + students[i].name + " 나이: " + students[i].age + " 성적: " + students[i].grade);
        }

        //추가 최적화 #1
        for (int i = 0; i < students.length; i++) {
            Student s = students[i]; //변수 생성 통해 축약
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }

        //추가 최적화 #2
        // - 단축키: iter > 향상된 for문 자동 생성
        for (Student s : students) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}
