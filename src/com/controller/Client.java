package com.controller;

import com.pojo.Book;
import com.service.BookService;

public class Client {

	public static void main(String[] args) throws Exception {
		BookService bs = new BookService();
//		Book b = new Book(1, "English Grammer", "Ronaldo", 231);
//		bs.addBook(b);
//		System.out.println("Book inserted into db successfully");
		
//		bs.getBooks();
		bs.getBook(1);
		
		
	}

}
