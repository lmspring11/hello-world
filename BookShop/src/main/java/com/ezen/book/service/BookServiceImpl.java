package com.ezen.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.book.domain.Book;
import com.ezen.book.persistence.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepo;
	
	
	//베스트 신상품 통합
	
	
	@Override
	public List<Book> getBookKindTypeList(String bookKind, String bookType) {
		
		List<Book> bookList = null;
		
		if(bookKind.equals("best")) {
			
			if(bookType.equals("1")) {
				bookList = bookRepo.getBestBookKindList("국내");
			} else if(bookType.equals("2")) {
				bookList = bookRepo.getBestBookKindList("해외");
			} else {
				bookList = bookRepo.getBestBookList();
			}
		}
		if(bookKind.equals("new")) {
			if(bookType.equals("1")) {
				bookList = bookRepo.getNewBookKindList("국내");
			} else if(bookType.equals("2")) {
				bookList = bookRepo.getNewBookKindList("해외");
			} else {
				bookList = bookRepo.getNewBookList();
			}
		}
		
		return bookList;
	}
	
	
	/////////////////////////////////////
	@Override
	public List<Book> getBestBookList() {

		return bookRepo.getBestBookList();
	}

	@Override
	public List<Book> getNewBookList() {

		return bookRepo.getNewBookList();
	}
	//
	@Override
	public Book getBook(Book book) {

		return bookRepo.findById(book.getId()).get();
	}
	
	//관리자
	@Override
	public void insertBook(Book book) {
		bookRepo.save(book);
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBook(Book book) {
		// TODO Auto-generated method stub

	}

}
