package ru.bobrysheva.jdbs_spring_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/books/all")
    public List<Book> getAllBooks() {
        return bookRepository.findAllBooks();
    }

//    @Autowired
//    private FindBookById findBookById;
//
//    public BookController(FindBookById findBookById) {
//        this.findBookById = findBookById;
//    }
//
//    @GetMapping("/books/{id}")
//    public String foundBooks(@PathVariable Long id) {
//        return findBookById.foundBooks(id);
//    }
}
