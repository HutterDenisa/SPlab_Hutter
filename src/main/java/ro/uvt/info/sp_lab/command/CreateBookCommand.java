package ro.uvt.info.sp_lab.command;

import ro.uvt.info.sp_lab.models.Book;
import ro.uvt.info.sp_lab.persistence.BooksRepository;

public class CreateBookCommand {

    private final BooksRepository booksRepository;

    public CreateBookCommand(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public Book execute() {
        Book book = new Book();
        // Set properties on book

        // Save the book using the repository
        return booksRepository.save(book);
    }
}