package Problem3;

public class Document {
    public static int counter = 1;
    protected int numRec;
    protected String title;
    Document(String title){
        this.title = title;
        this.numRec = counter++ ;
    }
    public String getTitle() {
        return title;
    }
    public int getNumRec() {
        return numRec;
    }

    public void setNumRec(int numRec) {
        this.numRec = numRec;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString(){
        return numRec + " - " + title;
    }
}
