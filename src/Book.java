

import java.util.Date;

public class Book {

String title;

String author;

String status;
//int condition is on a 5 point rating
int condition;

Date dueDate;

public void shout() {
	System.out.println(this.title +", "+ this.author +", "+ this.status + ", Condition: "+ this.condition + "/5" );
}

public Book(String title, String author, String status, int condition, Date dueDate) {
	super();
	this.title = title;
	this.author = author;
	this.status = status;
	this.condition = condition;
	this.dueDate = dueDate;
}


public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public int getCondition() {
	return condition;
}

public void setCondition(int condition) {
	this.condition = condition;
}

public Date getDueDate() {
	return dueDate;
}

public void setDueDate(Date dueDate) {
	this.dueDate = dueDate;
}

}
