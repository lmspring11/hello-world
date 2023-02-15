package com.ezen.book.service;

import java.util.List;


import com.ezen.book.domain.Book;

public interface BookService {
	
	//이용자

	//page처리와 queryDSL 사용 전체 조회
	List<Book> getBookList(String bookKind, Integer bookType);
	
	//상세정보
	Book getBook(Book book);
	
	
	
	
	//관리자
}
