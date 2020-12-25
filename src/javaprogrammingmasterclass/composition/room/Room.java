package javaprogrammingmasterclass.composition.room;

public class Room {

    private Whiteboard whiteboard;
    private Blackboard blackboard;
    private Laptop laptop;
    private BookShelf bookShelf;

    public Room(Whiteboard whiteboard, Blackboard blackboard, Laptop laptop, BookShelf bookShelf) {
        this.whiteboard = whiteboard;
        this.blackboard = blackboard;
        this.laptop = laptop;
        this.bookShelf = bookShelf;
    }

    public Whiteboard getWhiteboard() {
        return whiteboard;
    }

    public Blackboard getBlackboard() {
        return blackboard;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public BookShelf getBookShelf() {
        return bookShelf;
    }
}
