import java.util.ArrayList;

public class API {
    public static void main(String[] args) {
        //객체 배열
        ArrayList<Book> books=new ArrayList<Book>();
        int count = 0;
        //객체 생성
        books.add(new Book("나루토",3000));
        books.add(new Book("슬램덩크",4000));
        books.add(new Book("원피스",5000));
        //객체 호출
        for (Book b:books) {
            System.out.println(b.tostring());
        }
    }
}
        class Book {
        private String title;
        private int price;
        //생성자
        public Book(String title, int price) {
            this.title = title;
            this.price = price;
        }

        public String tostring() {
            return String.format("%s(%d원)", this.title, this.price);
        }
    }

