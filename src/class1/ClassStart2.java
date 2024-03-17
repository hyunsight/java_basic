package class1;

public class ClassStart2 {

    public static void main(String[] args) {
/*
        int[][] students = {
                {15, 90},
                {16, 80},
                {17, 80}
        };

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름: 학생" + (i + 1) + " 나이: " + students[i][0] + " 성적: " + students[i][1]);
        }
*/

        String[] studentName = {"학생1", "학생2", "학생3"};
        int[] studentAge = {15, 16, 17};
        int[] studentGrade = {90, 80, 70};

        for (int i = 0; i < studentName.length; i++) {
            System.out.println("이름: " + studentName[i] + " 나이: " + studentAge[i] + " 성적: " + studentGrade[i]);
        }

        //배열 사용의 한계
        // - 배열을 사용해서 코드 변경을 최소화하는데는 성공했지만, 한 학생의 데이터가 3개의 배열로 나누어져 있음
        // - 이로 인해 데이터를 변경할 때 매우 조심해야 함(각각의 배열마다 정확하게 맞는 인덱스 데이터 찾아서 제거 필요 및 변경 3번 필요)
        // - 실수할 가능성 매우 많으며, 사람이 관리하기에는 좋은 방식이 아님
        // - 사람이 관리하기 좋은 방식은 학생이라는 개념을 하나로 묶는 것 (그 안(예시. 학생 카드)에 학생 별로 이름, 나이 등 관리)
        //   :정보 분산 시 관리 어려움
        // - 이를 '클래스' 사용하여 해결 ('학생'이란 개념으로 하나로 묶는 것)
    }
}
