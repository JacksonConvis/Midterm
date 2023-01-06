import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class LibraryTerminal {
    public static void main(String[] args) {
    	
    	Stack bookReturns = new Stack<Book>();
    	
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
        	//sysout "TITLE===== AUTHOR==== ETC."
        	for(int i=0; i < books.size(); i++) {
        		books.get(i).shout();       		
        	}
        	
        	
        }else if(select == 2) {
        	System.out.println("Please enter the first name of the author you're looking for");
        	
        	String author = scan.next();
        	
        	//capitalize first letters of names [CASE SENSITIVE]
        	for (Book book : books) {
				if(book.author.contains(author)) {
					book.shout();
				}
        		
			}
        	//capitalize first letters of names [CASE SENSITIVE]
        }else if(select == 3) {System.out.println("Please enter the title keyword of the book you're looking for");
    	
    	String keyword = scan.next();
    	
    	for (Book book : books) {
			if(book.title.contains(keyword)) {
				book.shout();
			}
    		
		}
        	
        	
        	
        	
        }else if(select == 4) {
        	System.out.println("Please enter the book's information below." + "\n" + "Title:");
        	String title = scan.next();
        	//we like to use one word titles for books
        	System.out.println("Author:");
        	String auth = scan.next();
        	
        	System.out.println("Condition:");
        	int cond = scan.nextInt();
        	
        	cond--;
        	
        	Book bookReturn = new Book(title, auth, "On Shelf", cond, null);
        	
        	if(cond > 0) {
        		bookReturns.add(bookReturn);
        		System.out.println("Book return processed!");
        	}else {
        		System.out.println("This book was recycled.");
        	}
        	
        }
        
        
        
        
        
    }
}
