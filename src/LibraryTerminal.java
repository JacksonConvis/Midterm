import java.util.ArrayList;
import java.util.Scanner;

public class LibraryTerminal {
    public static void main(String[] args) {
    	
    	Book book1 = new Book("Holes", "Louis Sachar", "On Shelf", 5, null);
    	Book book2 = new Book("The Hobbit", "JRR Tolkien", "Checked Out", 4, null);
    	Book book3 = new Book("Howls Moving Castle", "Diana Jones", "On Shelf", 5, null);
    	Book book4 = new Book("Pride and Prejudice", "Jane Austen", "Checked Out", 5, null);
    	Book book5 = new Book("Frankenstein", "Mary Shelley", "On Shelf", 5, null);
    	Book book6 = new Book("Farenheit 451", "Ray Bradbury", "On Shelf", 5, null);
    	Book book7 = new Book("Fingersmith", "Sarah Waters", "On Shelf", 5, null);
    	Book book8 = new Book("Kindred", "Octavia E. Butler", "On Shelf", 5, null);
    	Book book9 = new Book("Euphoria", "Lily King", "Checked Out", 5, null);
    	Book book10 = new Book("Passing", "Nella Larson", "On Shelf", 5, null);
    	Book book11 = new Book("Room", "Emma Donoghue", "On Shelf", 5, null);
    	Book book12 = new Book("Columbine", "Dave Cullen", "On Shelf", 5, null);

    	 ArrayList<Book> books = new ArrayList<Book>();
    	books.add(book1);
    	books.add(book2);
    	books.add(book3);
    	books.add(book4);
    	books.add(book5);
    	books.add(book6);
    	books.add(book7);
    	books.add(book8);
    	books.add(book9);
    	books.add(book10);
    	books.add(book11);
    	books.add(book12);
 
    	Scanner scan = new Scanner (System.in);
        System.out.println("Welcome to the Library!" + "\n"  + "Please select an option:");
        System.out.println("1. Display entire list of books" + "\n" + "2. Search by author"
                + "\n" + "3. Search by title keyword" +"\n"+ "4. Return a book" );
        int select = scan.nextInt();
        
        if(select == 1) {
        	for(int i=0; i < books.size(); i++) {
        		books.get(i).shout(i);       		
        	}
        	
        	
        }else if(select == 2) {
        	System.out.println("Please enter the author you're looking for");
        	String Author = scan.next();
        	
        	for(int i = 0; i < books.size(); i++) {
        		
        		if(books.get(i).getAuthor().equalsIgnoreCase(Author)) {
        			System.out.println("hello!");
        		}
        		System.out.println("LLL");
        	}
        	
        	
        }
        
        
        
        
        
    }
}
//hello