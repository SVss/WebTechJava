package com.svss.webtech.lw_1.part12.Book;

public class ProgrammerBook extends Book {
	private String language;
	private int level;
	
	public ProgrammerBook(String title, String author, int price, String isbn,
			String language, int level) {
		super(title, author, price, isbn);
		
		this.language = language;
		this.level = level;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (this == obj) return true;
		if (!super.equals(obj)) return false;
		if (this.getClass() != obj.getClass()) return false;
		
		ProgrammerBook progbook = (ProgrammerBook)obj;
		return language.equals(progbook.language)
				&& (level == progbook.level);
	}
	
	@Override
	public int hashCode() {
		return 13*super.hashCode()
				+ 17* language.hashCode()
				+ 19*level
				+ 36;
	}
	
	@Override
	public String toString() {
		return "ProgrammerBook: title=\""+ title
				+ "\" author=\"" + author
				+ "\"" + String.format(" price=\"%d\" edition=\"%d\"", price, edition)
				+ " isbn=\"" + isbn + "\""
				+ " language=\"" + language
				+"\"" + String.format(" level=\"%d\"", level); 
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		ProgrammerBook result = (ProgrammerBook)super.clone();
		
		result.language = language;
		result.level = level;
		
		return result;
	}
}
