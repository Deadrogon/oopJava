package hu.iit.uni.miskolc.oop.enumbook;

import hu.iit.uni.miskolc.oop.Book;
import hu.iit.uni.miskolc.oop.enumbook.BookWithEnum.Style;

public class Main {

	public static void main(String[] args) {
		BookWithEnum[] booksWithEnum = new BookWithEnum[4];
		booksWithEnum[0] = new BookWithEnum("asd", "vik", 2000, 2000, Style.SCIFI);
		booksWithEnum[1] = new BookWithEnum("asd1", "vik4", 5000, 4000, Style.COOK);
		booksWithEnum[2] = new BookWithEnum("asd2", "vik5", 6000, 6000, Style.ROMANCE);
		booksWithEnum[3] = new BookWithEnum("asd3", "vik6", 7000, 3000, Style.OTHER);
		
		printBook(getBooksWithStyle(booksWithEnum, Style.SCIFI));
	}
		
		private static void printBook(Book[] books){
			for (Book book : books) {
				System.out.println(book);
			}
		}

	private static BookWithEnum[] getBooksWithStyle(BookWithEnum[] bookWithEnum, Style style){
		BookWithEnum[] booksWithStyle = new BookWithEnum[bookWithEnum.length];
		int j = 0;
		for (int i = 0; i < booksWithStyle.length; i++) {
			if (bookWithEnum[i].getStyle().equals(style)) {
				booksWithStyle[j] = booksWithStyle[i];
				j++;
			}
		}
		return booksWithStyle;
	}
		
		
	

}
