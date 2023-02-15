package com.ezen.book.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ezen.book.domain.Book;
import com.ezen.book.domain.QBook;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class QueryDslCustomRepositoryImpl implements QueryDslCustomRepository {

	private final JPAQueryFactory queryFactory;
	
	@Override
	public List<Book> getBestBookList(String type) {
		
		QBook book = QBook.book;
		BooleanBuilder builder = new BooleanBuilder();
		
		if(type != null) {
			
		builder.and(book.type.eq(type));
		}
		
		return queryFactory
				.selectFrom(book)
				.where(builder)
				.orderBy(book.purchase.desc())
				.fetch(); 
	}
	
	@Override
	public List<Book> getNewBookList(String type) {

		QBook book = QBook.book;
		BooleanBuilder builder = new BooleanBuilder();
		
		if(type != null) {
			
			builder.and(book.type.eq(type));
			}
		
		return queryFactory
				.selectFrom(book)
				.where(builder)
				.orderBy(book.publishing_date.desc())
				.fetch(); 
		
	}

}
