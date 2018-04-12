package hu.iit.uni.miskolc.oop.enumbook;

import hu.iit.uni.miskolc.oop.Book;

public class BookWithEnum extends Book {
	
	public enum Style {
		SCIFI, COOK, ROMANCE, OTHER
	}
	
	private Style style;

	public BookWithEnum(String title, String author, int releaseYear, double price,  Style style) {
		super(title, author, releaseYear, price);
		this.style = style;
	}

	@Override
	public String toString() {
		return "BookWithEnum [style=" + style + "]";
	}
	
	public Style getStyle() {
		return style;
	}
	

}
