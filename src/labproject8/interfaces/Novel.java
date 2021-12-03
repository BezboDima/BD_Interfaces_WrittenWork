package labproject8.interfaces;

//Novel.java: Subclass of WrittenWork

public class Novel extends WrittenWork {

private String genre;
private int chapters;

// constructors:
public Novel(String title, String author, int year, int pageSize, String genre, int chapters) {
	 super(title, author, year,pageSize);
   setGenre( genre );
   setChapters( chapters );
}

// accessor methods:

public String getGenre() {
	return genre;
}


public int getChapters() {
	return chapters;
}


public void setGenre(String genre) {
	this.genre = genre;
}


public void setChapters(int chapters) {
	this.chapters = chapters;
}

public String toString() {
	
	String s = super.toString();
	return s + "\nGenre: " + this.genre + "\nChapters: " + this.chapters;
}
}
