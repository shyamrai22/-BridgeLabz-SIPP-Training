package accsessmodifier_package;

public class EBook extends Book {
    private String downloadLink;

    public EBook(String ISBN, String title, String author, String downloadLink) {
        super(ISBN, title, author);
        this.downloadLink = downloadLink;
    }

    public void displayEBookInfo() {
        System.out.println("EBook Details:");
        System.out.println("ISBN         : " + ISBN);       
        System.out.println("Title        : " + title);      
        System.out.println("Download Link: " + downloadLink);
        System.out.println("Author       : " + getAuthor()); 
    }
}

