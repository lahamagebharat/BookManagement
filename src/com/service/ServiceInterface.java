package com.service;

import com.pojo.Book;

public interface ServiceInterface {

	void addBook(Book b) throws Exception;

	void updateBook(Book b);

	void deleteBook(Book b);

}
