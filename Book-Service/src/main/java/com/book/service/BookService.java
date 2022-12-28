package com.book.service;

import java.util.List;

import com.book.entity.Book;

public interface BookService {

public List<Book> getAllBooks();
	
	public Book searchBookById(int id); 
	
	public boolean updateQuantity(int bookId, int changeInCopies);
	
	List<Book> searchBookByInput(String input);
}