package com.ezhil;

public class Main {

	public static void main(String[] args) {
		Book book = new Book();
		book.setTitle("Harry Potter");
		book.setTitle("GOT");
		book.setAuthor("J.K.Rowling");
		InventoryView iv = new InventoryView(book);
		iv.searchBook("GOT");

	}

}
