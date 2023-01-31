package com.ezen.book.service;

import java.util.List;

import com.ezen.book.domain.Book;

public interface BookService {
	
	//이용자
	
	//best
	List<Book> getBestBookList();
	//신상
	List<Book> getNewBookList();
	//상세정보
	Book getBook(Book book);
	
	//best,new , 국내,해외 분류 전체 조회
	List<Book> getBookKindTypeList(String bookKind, String bookType);

	
	
	
	
	
	//관리자
	void insertBook(Book book);
	void updateBook(Book book);
	void deleteBook(Book book);
}
