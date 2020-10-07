package com.ezhil;
public class InventoryView {

  Book book;

	InventoryView(Book book) {
		this.book = book;
	}

	void searchBook(String name) {
		if(book.title == name) {
			System.out.println("The Book "+name+" is available");
		}
		else if(book.author == name) {
			System.out.println("Book is available");
		}
		else {
			System.out.println("Book Not Available");
		}
	}

}