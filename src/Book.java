import java.util.Date;

public class Book {

String title;

String author;

String status;

String condition;

Date dueDate;

public Book(String title, String author, String status, String condition, Date dueDate) {
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

public String getCondition() {
	return condition;
}

public void setCondition(String condition) {
	this.condition = condition;
}

public Date getDueDate() {
	return dueDate;
}

public void setDueDate(Date dueDate) {
	this.dueDate = dueDate;
}

}
