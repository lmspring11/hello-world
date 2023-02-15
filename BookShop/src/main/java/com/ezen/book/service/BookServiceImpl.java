package com.ezen.book.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ezen.book.domain.Book;
import com.ezen.book.persistence.BookRepository;
import com.ezen.book.persistence.QueryDslCustomRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService {
	
	private final BookRepository bookRepo;
	private final QueryDslCustomRepository queryDslRepo;
	
	//이용자
	// 전체 조회
	@Override
	public List<Book> getBookList(String bookKind, Integer bookType) {
		
		String type = null;
		List<Book> bookList = null;
		
		if(bookType != null) {
			if(bookType == 1) {
				type = "국내";
			} else if(bookType == 2) {
				type = "해외";
			}
		}
		
		if(bookKind.equals("best")) {
			bookList = queryDslRepo.getBestBookList(type);
		} else if(bookKind.equals("new")) {
			bookList = queryDslRepo.getNewBookList(type);
		}
		
		return bookList;
	}
	
	// 책 상세정보
	@Override
	public Book getBook(Book book) {

		return bookRepo.findById(book.getId()).get();
	}
	
}
