package ru.bobrysheva.jdbs_spring_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController1 {
        @Autowired
        private FindBookById findBookById;

        public BookController1(FindBookById findBookById) {
            this.findBookById = findBookById;
        }

        @GetMapping("/books/{id}")
        public String foundBooks(@PathVariable Long id) {
            return findBookById.foundBooks(id);
        }
}
