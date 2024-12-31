package ru.bobrysheva.jdbs_spring_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.findAllBooks();
    }

    @GetMapping("/books/{id}")
    public String foundBooks(@PathVariable Long id) {
        return bookService.foundBooks(id);
    }
}
