package com.ezen.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ezen.book.domain.Book;
import com.ezen.book.service.BookService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;
	
	@GetMapping("/main")
	public String main() {
		return "/main";
	}
	
	// 베스트 신상품 통합
	@GetMapping("/getBookList")
	public String getBookList(Model model, HttpServletRequest request, Book book) {
		
		String bookKind = request.getParameter("kind");
		String bookType = request.getParameter("type");
		
		List<Book> bookList = bookService.getBookKindTypeList(bookKind, bookType);
		
		model.addAttribute("bookList",bookList);
		
		return "getBookList";
	}
	
	@GetMapping("/getBook")
	public String getBook(Book book, Model model) {
		
		model.addAttribute("book", bookService.getBook(book));
		
		return "getBook";
	}
}
