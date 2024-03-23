package construct.ex;

public class Book {
    String title; //제목
    String author; //저자
    int page; //페이지 수

    Book() {
        //String 초기값 null 출력 방지 > 빈문자 적용
        this("", "", 0);
    }

    Book(String title, String author) {
        this(title, author, 0);
    }

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }
}
