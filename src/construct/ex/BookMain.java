package construct.ex;

public class BookMain
{
    public static void main(String[] args) {
        Book book = new Book();
        book.displayInfo();

        Book book2 = new Book("Book Title", "Author");//모든 필드를 받는 생성자
        book2.displayInfo();

        Book book3 = new Book("졸려", "apfhd",700);
        book3.displayInfo();
    }
}
