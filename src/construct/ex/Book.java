package construct.ex;

public class Book   {
    String title;
    String author;
    int page;

    Book(String title, String author, int page) {//모든 필드를 받는 생성자
        this.title = title;
        this.author = author;
        this.page = page;
    }
    Book(String title, String author) {
        this(title, author, 0);
        //this.title=title;
        //this.author=author;
        //this.page=0;
    }

    Book(){//생성자 하나라도 정의했으면 기본 생성자를 만들어주지 않는다.
        this("","",0);//빈문자 안하면 null나옴.
    }

    void displayInfo(){
        System.out.println("Book Title: " + title+" Author: " + author+" Page: " + page);
    }
}
