package Problem3;
import java.util.ArrayList;

public class Library {
    private int capacity;
    private  ArrayList<Document> documents ;

    public Library(int capacity){
        this.capacity = capacity;
        documents = new ArrayList<>();
    }
    public void dispalyDocuments(){
        System.out.println("=== Documents in the Library  ====");
        for(Document doc : documents){
            System.out.println(doc.toString());
        }
    }
    public boolean add(Document doc){
        if(doc == null || documents.size() >= capacity){
            return false;
        }
        return documents.add(doc);
    }
    public boolean delete(Document doc){
        if (doc == null) {
            return false;
        }
        return documents.remove(doc);
    }
    public Document document(int numEnrg){
        for(Document doc : documents){
            if(doc.getNumRec() == numEnrg){
                return doc;
            }
        }
        return null;
    }
    public void  displayAuthors(){
        for(Document doc : documents){
            if(doc instanceof Book){
                Book book = (Book) doc;
                System.out.println("Author : " + book.getAuthor() + "(Book : " + book.getTitle() + ")");
            }
        }
    }

    @Override
    public String toString(){
        return "=== Library ( " + documents.size() +" docs) , Capacity : " + capacity + " ===";
    }
}
