package Problem3;

public class Book extends Document{
    protected String author;
    protected int nbrPages;

    public Book(String title,String author,int nbrPages){
        super(title);
        this.author = author;
        this.nbrPages = nbrPages;
    }
    public String getAuthor() {
        return author;
    }
    public int getNbrPages() {
        return nbrPages;
    }
    @Override
    public String toString(){
        return "[ " + title + "(" + nbrPages + " ) by : " + author + "]";
    }
}
