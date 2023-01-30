package com.ezen.book.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ezen.book.domain.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

	
	
	 
	//best 전체 목록
	@Query("SELECT b FROM Book b ORDER BY b.purchase DESC")
	List<Book> getBestBookList();
	
	//best 카테고리 별 목록
	@Query("SELECT b FROM Book b WHERE b.type =:type ORDER BY b.purchase DESC")
	List<Book> getBestBookKindList(@Param("type") String type);
	 
	
	//new 전체 목록
	@Query("SELECT b FROM Book b ORDER BY b.register_date DESC")
	List<Book> getNewBookList();
	
	//new 카테고리 별 목록
	@Query("SELECT b FROM Book b WHERE b.type =:type ORDER BY b.register_date DESC")
	List<Book> getNewBookKindList(@Param("type") String type);
	
	
	   
	 
	 
}
