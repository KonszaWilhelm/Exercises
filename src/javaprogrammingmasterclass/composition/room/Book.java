package javaprogrammingmasterclass.composition.room;

public class Book {
    private String title;
    private String author;


    public void read(){
        System.out.println("Reading book: " + title + " from: " + author);
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


}
