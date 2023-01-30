package com.ezen.book.domain;

import java.util.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	private String content;
	private String image;
	@Column(updatable = false)
	private Date register_date = new Date();
	private int purchase;
	private int quantity;
	private int per_point;
	
}
