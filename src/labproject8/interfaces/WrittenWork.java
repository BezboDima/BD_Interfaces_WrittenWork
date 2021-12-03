package labproject8.interfaces;

//WrittenWork.java: Superclass

public class WrittenWork {

private String title;
private String author;
private int    year;
private int pageSize;


// constructors:
public WrittenWork(String title, String author, int year, int pageSize) {

   setTitle( title );
   setAuthor( author );
   setYear( year );
   setPageSize (pageSize);
   
}

public WrittenWork() {

}

// accessor methods:

public int getPageSize() {
	return pageSize;
}

public String getTitle() {
   return title;
}

public String getAuthor() {
   return author;
}

public int getyear() {
   return year;
}

public void setPageSize(int pageSize) {
	this.pageSize = pageSize;
}

public void setTitle(String title) {
   this.title = title;
}

public void setAuthor(String author) {
   this.author = author;
}

public void setYear(int year) {
   this.year = year;
}

public boolean equals (Object obj) {
	if (obj instanceof WrittenWork) {
		WrittenWork other = (WrittenWork) obj;
		
		if(this.title == other.title && this.author == other.author && this.year == other.year && this.pageSize == other.pageSize) {
			return true;
		}
		else {
			return false;
		}
	}else {
		
		return false;
	}
}

public String toString() {
	 
	 return "Title: " + this.title + "\nAuthor: " + this.author + "\nYear: " + this.year + "\nPageSize: " + this.pageSize;
}
}
