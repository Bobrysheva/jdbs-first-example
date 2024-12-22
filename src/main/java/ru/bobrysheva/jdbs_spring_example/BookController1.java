package ru.bobrysheva.jdbs_spring_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController1 {
    @Autowired
    private FindBookById findBookById;

    public BookController1(FindBookById findBookById) {
        this.findBookById = findBookById;
    }

    @GetMapping("/book/{id}")
    public String foundBooks(@RequestParam(value = "id") Long id) {
        return findBookById.foundBooks(id);
    }
}
