package com.svss.webtech.lw_1.Book;

public class ProgrammerBook extends Book {
	private String language;
	private int level;
	
	public ProgrammerBook(String title, String author, int price, String language, int level) {
		super(title, author, price);
		
		this.language = language;
		this.level = level;
	}

	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (this == obj) return true;
		if (!super.equals(obj)) return false;
		if (this.getClass() != obj.getClass()) return false;
		
		ProgrammerBook progbook = (ProgrammerBook)obj;
		return language.equals(progbook.language)
				&& (level == progbook.level);
	}
	
	public int hashCode() {
		return 13*super.hashCode()
				+ 17* language.hashCode()
				+ 19*level
				+ 36;
	}
	
	public String toString() {
		return "ProgrammerBook: title=\""+ title
				+ "\" author=\"" + author
				+ "\"" + String.format(" price=\"%d\" edition=\"%d\"", price, edition)
				+ " language=\"" + language
				+"\"" + String.format(" level=\"%d\"", level); 
	}
	
	public Object clone() throws CloneNotSupportedException {
		ProgrammerBook result = (ProgrammerBook)super.clone();
		
		result.language = language;
		result.level = level;
		
		return result;
	}
}
