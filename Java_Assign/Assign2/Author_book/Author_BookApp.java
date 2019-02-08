package com.cg.app;

import com.cg.ass.dto.Author;
import com.cg.ass.dto.Book;

public class Author_BookApp {

		public static void main(String[] args)
		{
			Author a=new Author("vidya","Vidya@gmail.com",'F');
			Book b=new Book("Java");
			b.setPrice(800.00);
			b.setQty(20);
			System.out.println(b);
		}
	}


