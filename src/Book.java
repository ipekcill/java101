import java.util.Date;

public class Book {
    String name;
    int pageNumber;
    Date issueDate;
    Writer writer;

    Book(String name, int pageNumber, Date issueDate) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.issueDate = issueDate;
    }

    Book(String name, int pageNumber, Date issueDate, Writer writer) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.issueDate = issueDate;
        this.writer = writer;
    }

    void addWriter(Writer writer) {
        this.writer = writer;
    }

    void printDate() {
        System.out.println(this.issueDate);
    }

    void printBookAndWriter() {
        System.out.println("Book Name:" + this.name + " " + "Writer:" + this.writer.name + " " + "Page Number:" + this.pageNumber);
    }

}
