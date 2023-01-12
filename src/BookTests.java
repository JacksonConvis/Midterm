import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class BookTests {
	
	@Test
	void bookTest() {
		Book book7 = new Book(null, null, null, 0, LocalDate.now());
		
		LocalDate actual = LocalDate.of(2025, 12, 22);
		
		assertNotEquals(actual,book7.getDueDate());
	}

	@Test
	void bookTest1() {
		Book book1 = new Book(null, null, null, 0, null);
		
		book1.setAuthor("Billy");
		String actual = book1.getAuthor();
		String expected = "Billy";
		
		assertEquals(expected,actual);
	}
	
	@Test
	void bookTest2() {
		Book book2 = new Book(null, null, null, 0, null);
		
		book2.setTitle("Green Eggs and Ham");
		
		assertNotNull(book2.getTitle());
	}
	@Test
	void bookTest3() {
		Book book3 = new Book(null, null, null, 0, null);
		Book book4 = new Book("Gone with the Wind", null, null, 0, null);
		
		assertNotEquals(book3,book4);
	}
	@Test
	void bookTest4() {
		Book book5 = new Book(null, null, null, 5, null);
		
		book5.condition--;
		
		assertEquals(4,book5.getCondition());
	}
	@Test
	void bookTest5() {
		Book book6 = new Book(null, null, "Checked Out", 0, null);
		
		book6.setStatus("On shelf");
		
		assertNotEquals("Checked Out", book6.getStatus());
	}


}
