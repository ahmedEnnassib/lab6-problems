package problem5;
import java.util.LinkedList;

public class BookQueue {
    private LinkedList<Book> list;

    public BookQueue() {
        this.list = new LinkedList<>();
    }
    public void enqueue(Book book) {
        list.addLast(book);
    }
    public Book dequeue() {
        return list.removeFirst();
    }
    public Book peek() {
        return list.getFirst();
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
    public void display() {
        System.out.println("Queue contents (front to back):");
        for (Book book : list) {
            System.out.println("- " + book);
        }
    }
}
