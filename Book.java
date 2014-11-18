/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Ananya
 * @version 11-17-14
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages; 
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }

    public String getAuthor(){
        return author;
    }

    public String getTitle(){
        return title;
    }

     public int getPages(){
        return pages;
    }

    public String getRefNumber(){
        return refNumber;
    }

    public void setRefNumber(String ref){
        if (ref.length() <3){

           System.out.println("ERROR: Reference Number is too short."); 
        }

        else {
            refNumber = ref;
        }
    }

    public void printDetails(){

        if (refNumber.length() == 0)
        {
            System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Reference Number: ZZZ");
        }

        else {
            System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Reference Number: " + refNumber);
        }

    }

    public static void main (String[] args) {

        Book book1 = new Book("Ananya", "Hello", 67);
        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getPages());
        book1.printDetails();
        book1.setRefNumber("12");
        book1.setRefNumber("1244");
        System.out.println(book1.getRefNumber());
        book1.printDetails();

    }
}



