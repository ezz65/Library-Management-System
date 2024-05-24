
public class Lab2 {
	public static void main (String args[]) {
	    Book book1= new Book("book1",10);
	    Book book2= new Book("book2",20);
	    Book book3= new Book("book3",30);
	    book1.print();  
	    System.out.println("Number of books: " + Book.countBooks());
	}
}

class Book {
    private String title;
    private int ID;
    
    private Book next = null;
    private Book previous = null;
    
    static private int NumberOfBooks = 0;
    public Book(String aTitle, int id) {
        this.title = aTitle;
        this.ID = id;
        NumberOfBooks++;
    }
    public String getTitle(){
        return title;
    }
    public int getID(){
        return ID;
    }
    public void print(){
        System.out.println("Title: "+ title);
        System.out.println("ID: " + ID);

    }
    public static int countBooks(){
        return NumberOfBooks;
    }
    
    public void setNextBook(Book next){
        this.next = next;
    }
    public void setPreviousBook(Book previous){
        this.previous = previous;
    }
    public Book getNextBook(Book next){
        return this.next;
    }
    public Book getPreviousBook(Book previous){
        return this.previous;
    }
    
}

class Library {
    public Book head = null;
    public Book tail = null;
    public void add(Book aBook){
        
    }
    public void print(){
        
    }
    public Book find(int ID){
        return null;
    }
}
