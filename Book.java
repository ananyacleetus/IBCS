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
     * Constructor for objects of class Book
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }

    /**
     * 
     * Accessor method for book author
     *
     * @param  none
     * @return the book's author 
     */
    public String getAuthor(){
        return author;
    }

   /**
     * 
     * Accessor method for book title
     *
     * @param  none
     * @return the book's title 
     */
    public String getTitle(){
        return title;
    }

    /**
     * 
     * Accessor method for book pages
     *
     * @param  none
     * @return the book's number of pages 
     */
     public int getPages(){
        return pages;
    }


    /**
     * 
     * Accessor method for book reference number
     *
     * @param  none
     * @return the book's reference number 
     */

    public String getRefNumber(){
        return refNumber;
    }

    /**
     * 
     * Mutator method to set book reference number to input value
     *
     * @param  ref: the reference number to be set for the book
     * @return none
     * @precondition must be 3 characters or longer
     */
    public void setRefNumber(String ref){
        if (ref.length() <3){

           System.out.println("ERROR: Reference Number is too short."); 
        }

        else {
            refNumber = ref;
        }
    }

    /**
     * 
     * Prints book details
     *
     * @param  none
     * @return none 
     */
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



