package com.ezen.book.persistence;

import java.util.List;

import com.ezen.book.domain.Book;

public interface QueryDslCustomRepository {
	
	List<Book> getBestBookList(String type);
	
	List<Book> getNewBookList(String type);
	
}
