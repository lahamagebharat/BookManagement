package com.service;

import java.sql.SQLException;

import com.Dao.ServiceImpl;
import com.pojo.Book;

public class BookService implements ServiceInterface {

	@Override
	public void addBook(Book b) throws Exception {
		ServiceImpl.insertBook(b.getId(), b.getName(), b.getAuthor(), b.getPrice());

	}

	@Override
	public void updateBook(Book b) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBook(Book b) {
		// TODO Auto-generated method stub

	}

	public void getBooks() throws SQLException {
		ServiceImpl.fetchallrows();
	}

	public void getBook(int id) throws SQLException {
		ServiceImpl.fetchallrowswithid(id);
	}

}
