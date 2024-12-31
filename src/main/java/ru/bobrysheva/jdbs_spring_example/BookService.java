package ru.bobrysheva.jdbs_spring_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepositoryImpl bookRepositoryImpl;

    @Autowired
    public BookService(BookRepositoryImpl bookRepositoryImpl) {
        this.bookRepositoryImpl = bookRepositoryImpl;
    }

    public List<Book> findAllBooks() {
        return bookRepositoryImpl.findAllBooks();
    }

    public String foundBooks(Long id) {
        return bookRepositoryImpl.foundBooks(id);
    }
}
