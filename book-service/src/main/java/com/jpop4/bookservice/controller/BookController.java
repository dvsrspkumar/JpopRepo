package com.jpop4.bookservice.controller;

import com.jpop4.bookservice.model.Book;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@RefreshScope
public class BookController {

    @GetMapping
    public List<Book> getBooks() {
        return null;
    }

    @GetMapping("/{bookId}")
    public Book getBookbyId(@PathVariable ("bookId") Integer bookId) {
        return null;
    }

    @PostMapping
    public boolean addBook(Book book) {
        return false;
    }

    @DeleteMapping("/{bookId}")
    public boolean deleteBook(@PathVariable ("bookId") Integer bookId) {
        return false;
    }

    @PutMapping("/{bookId}")
    public void updateBook(@PathVariable ("bookId") Integer bookId) {
    }

    @PostMapping("/upload")
    public void uploadCSVWithBooks() {

    }
}
