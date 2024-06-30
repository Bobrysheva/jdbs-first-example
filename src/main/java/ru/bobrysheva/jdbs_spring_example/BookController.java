package ru.bobrysheva.jdbs_spring_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
@Controller
//@RequestMapping("/book/{id}")
public class BookController {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private  FindBookById findBookById;
    public BookController (BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/book/all")
    public List<Book> getAllBooks() {
        return  bookRepository.findAllBooks();
    }
    @GetMapping("/book/{id}")
    public String foundBooks(@RequestParam (value = "id", defaultValue = "1") Long id) {
        return findBookById.foundBooks(id);
    }
}
