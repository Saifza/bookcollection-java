package librarybook;

import java.awt.Font;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import librarybook.Book;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Library library = new Library();

        String filePath = "booklist.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                String name = values[0];
                String author = values[1];
                boolean isAvailable = Boolean.parseBoolean(values[2]);

                Book book = new Book(name, author, isAvailable);
                library.addBook(book);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    
        
        for (Book book : library.getBooks()) {
            System.out.println( "\""+book.getTitle().toUpperCase()+"\"" + " by " + book.getAuthor()+":" + " Availibility status: " + book.isAvailable());
        }    	
    	
    	
        }
  
	}


