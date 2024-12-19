package com.tap.bhavi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BookSaleSorting {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int noOfBooks = sc.nextInt();
		sc.nextLine();
		List<Book> books = new ArrayList<>();
		for(int i=0; i<noOfBooks; i++) {
			String input = sc.nextLine();
			String[] parts = input.split(",");
			Book book = new Book(Integer.parseInt(parts[0]), parts[1], Integer.parseInt(parts[2]),Double.parseDouble(parts[3]), parts[4], Integer.parseInt(parts[5]));
			books.add(book);
		}
		
		int SortingCriteria = sc.nextInt();
		switch(SortingCriteria) {
		case 1 : Collections.sort(books, Comparator.comparingInt(Book :: getBookPrice));
		         break;
		case 2 : Collections.sort(books, Comparator.comparingDouble(Book :: getBookRating).reversed());
		         break;
		case 3 : Collections.sort(books, Comparator.comparing(Book :: getBookAuthor));
				 break;
		case 4 : Collections.sort(books, Comparator.comparingInt(Book :: getBookDiscount).reversed());
				 break;
		default : System.out.println("......Invalid sorting option.....");
		return ;
		}
		for(Book book : books) {
			System.out.println(book);
		}
		}
}


class Book{
	private int bookId;
	private String bookName;
	private int bookPrice;
	private double bookRating;
	private String bookAuthor;
	private int bookDiscount;
	
	
	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public int getBookPrice() {
		return bookPrice;
	}


	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}


	public double getBookRating() {
		return bookRating;
	}


	public void setBookRating(double bookRating) {
		this.bookRating = bookRating;
	}


	public String getBookAuthor() {
		return bookAuthor;
	}


	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}


	public int getBookDiscount() {
		return bookDiscount;
	}


	public void setBookDiscount(int bookDiscount) {
		this.bookDiscount = bookDiscount;
	}


	public Book(int bookId, String bookName, int bookPrice, double bookRating, String bookAuthor, int bookDiscount) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookRating = bookRating;
		this.bookAuthor = bookAuthor;
		this.bookDiscount = bookDiscount;
	}


	@Override
	public String toString() {
		
		return bookId + "," + bookName + "," + bookPrice + ","
				+ bookRating + "," + bookAuthor + "," + bookDiscount;
		
//		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", bookRating="
//				+ bookRating + ", bookAuthor=" + bookAuthor + ", bookDiscount=" + bookDiscount + "]";
	}
	
	
	
}
