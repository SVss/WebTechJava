package com.svss.webtech.lw_1.part12.Book;

import java.util.Comparator;

public class Book implements Cloneable, Comparable<Book> {
	protected String title;
	protected String author;
	protected int price;
	protected static int edition;
	protected String isbn;	// no validation
	
	public Book(String title, String author, int price, String isbn) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.isbn = isbn;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (this == obj) return true;
		if (this.getClass() != obj.getClass()) return false;
		
		Book book = (Book)obj;
		return title.equals(book.title)
				&& author.equals(book.author)
				&& (price == book.price);
	}
	
	@Override
	public int hashCode() {
		return 13*title.hashCode()
				+ 17*author.hashCode()
				+ 19*price
				+ 23*edition
				+ 29*isbn.hashCode()
				+ 78;
	}
	
	@Override
	public String toString() {
		return "Book: title=\""+ title
				+ "\" author=\"" + author
				+ "\"" + String.format(" price=\"%d\" edition=\"%d\"", price, edition)
				+ " isbn=\"" + isbn + "\""; 
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Book result = (Book) super.clone();
		
		result.title = title;
		result.author = author;
		result.price = price;
		result.isbn = isbn;
		
		return result;
	}

	@Override
	public int compareTo(Book arg0) {
		return isbn.compareTo(arg0.isbn);
	}
	
	// Comparators
	
	public static class NameComparator implements Comparator<Book>{

		@Override
		public int compare(Book arg0, Book arg1) {
			return arg0.title.compareTo(arg1.title);
		}
		
	}
	
	public static class NameAuthorComparator implements Comparator<Book>{

		@Override
		public int compare(Book arg0, Book arg1) {
			int result = arg0.title.compareTo(arg1.title);
			if (result == 0) {
				result = arg0.author.compareTo(arg1.author);
			}
			return result;
		}
		
	}
	
	public static class AuthorNameComparator implements Comparator<Book>{

		@Override
		public int compare(Book arg0, Book arg1) {
			int result = arg0.author.compareTo(arg1.author);
			if (result == 0) {
				result = arg0.title.compareTo(arg1.title);
			}
			return result;
		}
		
	}
	
	public static class AuthorNamePriceComparator implements Comparator<Book>{

		@Override
		public int compare(Book arg0, Book arg1) {
			int result = arg0.author.compareTo(arg1.author);
			if (result == 0) {
				result = arg0.title.compareTo(arg1.title);
				if (result == 0) {
					result = (arg0.price - arg1.price);
				}
			}
			return result;
		}
		
	}
}
