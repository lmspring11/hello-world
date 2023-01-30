package com.ezen;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ezen.book.domain.Book;
import com.ezen.book.persistence.BookRepository;
import com.ezen.book.service.BookService;

@SpringBootTest
public class BookRepositoryTest {

	@Autowired
	private BookRepository bookRepo;
	@Autowired
	private BookService bookService;
	
	 
	/*
	@Test 
	public void testInsert() {
		Book book = new Book();
		 * 
		for(int i=1; i<=5; i++) {
			
			book.setType("국내");
			book.setTitle("책 제목 "+i);
			book.setAuthor("저자 "+i);
			book.setPurchase(i * 2);
			bookRepo.save(book);
		}
		for(int i=1; i<=5; i++) {
			
			book.setType("해외");
			book.setTitle("책 제목 "+(i+5));
			book.setAuthor("저자 "+(i+5));
			book.setPurchase(i * 3);
			bookRepo.save(book);
		}
		book.setType("국내");
		book.setTitle("책 제목 "+11);
		book.setAuthor("저자 "+11);
		book.setPurchase(7);
		bookRepo.save(book);
	}
		 */
	 
	/*
	@Test
	public void testGetBestBookList() {
		
		List<Book> list = bookRepo.getBestBookList();
		
		for(Book book : list) {
			System.out.println(book);
		}
	}
	
	
	@Test
	public void testGetNewBookList() {
		
		List<Book> list = bookRepo.getNewBookList();
		
		for(Book book : list) {
			System.out.println(book);
		}
	}
	
	@Test
	public void testGetBook() {
		
		Book book = bookRepo.findById(6).get();
		
		System.out.println(book.getId());
		System.out.println(book.getType());
		System.out.println(book.getTitle());
		System.out.println(book.getAuthor());
		System.out.println(book.getPurchase());
	}
	
	
	@Test
	public void getTypeList() {
		List<Book> book = bookRepo.getNewBookKindList("국내");
		for(Book bookList : book) {
			System.out.println(bookList);
		}
		
	}
	 */
	@Test
	public void getServiceTypeList() {
		
		List<Book> bookList = bookService.getBookKindTypeList("new",null);
		
		for(Book book : bookList) {
			System.out.println(book);
		}
	}
	
}
