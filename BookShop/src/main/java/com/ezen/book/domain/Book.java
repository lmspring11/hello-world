package com.ezen.book.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String type;
	private String title;
	private int price;
	private String author;
	private String publisher;
	@Column(length = 1000)
	private String content;
	private String image;
	@Temporal(TemporalType.TIMESTAMP)
	private Date publishing_date;
	private int purchase;
	private int quantity;
	private int per_point;
	
}
