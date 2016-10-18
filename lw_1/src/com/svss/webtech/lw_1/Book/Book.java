package com.svss.webtech.lw_1.Book;

public class Book implements Cloneable{
	protected String title;
	protected String author;
	protected int price;
	protected static int edition;
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (this == obj) return true;
		if (this.getClass() != obj.getClass()) return false;
		
		Book book = (Book)obj;
		return title.equals(book.title)
				&& author.equals(book.author)
				&& (price == book.price);
	}
	
	public int hashCode() {
		return 13*title.hashCode()
				+ 17*author.hashCode()
				+ 19*price
				+ 23*edition
				+ 78;
	}
	
	public String toString() {
		return "Book: title=\""+ title
				+ "\" author=\"" + author
				+ "\"" + String.format(" price=\"%d\" edition=\"%d\"", price, edition); 
	}
	
	public Object clone() throws CloneNotSupportedException {
		Book result = (Book) super.clone();
		
		result.title = title;
		result.author = author;
		result.price = price;
		
		return result;
	}
}
