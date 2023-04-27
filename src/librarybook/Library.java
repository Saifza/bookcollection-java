package librarybook;

import java.util.ArrayList;

import librarybook.Book;


public class Library {
	private ArrayList<Book> books;
   
    public Library() {
        this.books = new ArrayList<>();
       
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public Book findBook(String title) {
        for (Book book : this.books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
    public ArrayList<Book> getBooks() {
        return this.books;
    }
   

}
