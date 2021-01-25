package com.yrgo.isbntools;

	//Testa jenkins
	//Testa jenkins igen
	//testing again
	//another one
	//jenkins test github
	//testing 5 star 
	//testing mail

	//damn you google
	//last try jenkins. you better work now
	//testtest
	//last testing

public class Book {
	private String isbn;
	private String title;
	private String author;
	
	public Book(String isbn, String title, String author) {
		this.isbn= isbn;
		this.title= title;
		this.author= author;
	}
	
	public String isbn() {
		return isbn;
	}
	
	public String title() {
		return title;
	}
	
	public String author() {
		return author;
	}
	
	public String toString() {
		return title + " " + isbn;
	}
	
}
