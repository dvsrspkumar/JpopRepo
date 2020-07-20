package com.jpop4.bookservice.controller;

import com.jpop4.bookservice.model.Book;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/books")
@RefreshScope
public class BookController {

    @HystrixCommand(fallbackMethod = "getBooksFallback")
    @GetMapping
    public List<Book> getBooks() {
        Book book = new Book(101,"Java","Technology","Gosling","Java Publishers");
        return Collections.singletonList(book);
    }

    private List<Book> getBooksFallback() {
        Book book = new Book(101,"Java","Technology","Gosling","Java Publishers");
        return Collections.singletonList(book);
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
