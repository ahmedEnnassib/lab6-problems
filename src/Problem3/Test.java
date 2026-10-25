package Problem3;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter capacity n of the library : ");
        int capacity = scanner.nextInt();
        Library lib = new Library(capacity);

        Document doc1 = new Book("Introduction to computing","David",200);
        Document doc2 = new Document("Introduction to cpp");
        lib.add(doc1);
        lib.add(doc2);
        System.out.println(lib);
        lib.dispalyDocuments();


    }

}
