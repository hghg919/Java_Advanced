import java.util.ArrayList;

class Book {
    String title, author;
    int price;

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void printInfo() {
        System.out.println("제목: " + title);
        System.out.println("저자: " + author);
        System.out.println("가격: " + price);
    }
}

class EBook extends Book {
    int fileSize;
    EBook(String title, String author, int price, int fileSize) {
        super(title, author, price);
        this.fileSize = fileSize;
    }
    @Override
    void printInfo() {
        System.out.println("[전자책]");
        super.printInfo();
        System.out.println("파일크기: " + fileSize + "MB");
    }
}

class PaperBook extends Book {
    int weight;
    PaperBook(String title, String author, int price, int weight) {
        super(title, author, price);
        this.weight = weight;
    }
    @Override
    void printInfo() {
        System.out.println("[종이책]");
        super.printInfo();
        System.out.println("무게: " + weight + "g");
    }
}

class AudioBook extends Book {
    int playTime;

    AudioBook(String title, String author, int price, int playTime) {
        super(title, author, price);
        this.playTime = playTime;
    }

    @Override
    void printInfo() {
        System.out.println("[오디오북]");
        super.printInfo();
        System.out.println("재생시간: " + playTime + "분");
    }
}

public class Main1 {
    public static void main(String[] args) {
    	ArrayList<Book> books = new ArrayList<>();
        
    	books.add(new EBook("자바기초", "홍길동", 15000, 5));
        books.add(new PaperBook("객체지향", "김철수", 20000, 500));
        books.add(new AudioBook("소설듣기", "이영희", 12000, 180));
        books.add(new PaperBook("채플", "호날두", 25000, 700));
        books.add(new EBook("IBook", "구평", 10000, 2));

        for (Book b : books) {
            b.printInfo();
            System.out.println("--------------------");
        }
    }
}