package com.capg.lab4.Exercise3;


public class ItemDemo {

	public static void main(String[] args) 
	{
		Book book = new Book(1, "BookStar", 100, "B.Author");
		book.print();
		book.checkIn();
		book.print();
		
		/*JournalPaper journalPaper = new JournalPaper(2, "JournalStar", 50, "J.Author", 1967);
		journalPaper.print();
		journalPaper.checkOut();
		journalPaper.print();

		Video video = new Video(1, "VideoStar", 20, 14, "V.Star", "V.Genere", 1957);
		video.print();
		video.checkIn();
		video.print();
	
		CD cd = new CD(101, "cdStar", 1, 9, "C.Artist", "Action");
		cd.print();
		cd.checkOut();
		cd.print();*/
	}

}
