package com.jpop4.libraryservice.controller;

import com.jpop4.libraryservice.model.Book;
import com.jpop4.libraryservice.model.User;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RefreshScope
@RequestMapping("/library")
public class LibraryController {

    @GetMapping
    public boolean login(Integer userId) {
        //TODO: calls user service GET /users/{user_id}
        return true;
    }

    @GetMapping("/books")
    public List<Book> listAllBooks() {
        //TODO: Calls book service GET /books URL
        return null;
    }

    @GetMapping("/books/{book_id}")
    public Book getBookById(@PathVariable(name = "book_id") Integer bookId) {
        //TODO: Calls book service GET /books/{book_id} URL
        return null;
    }

    @PostMapping("/books/{book_id}")
    public void addBook(@PathVariable(name = "book_id") Integer bookId) {
        //TODO: Calls book service POST /books/{book_id} URL
    }

    @DeleteMapping("/books/{book_id}")
    public void deleteBook(@PathVariable(name = "book_id") Integer bookId) {
        //TODO: Delete book association with user in library table and calls book service DELETE /books/{book_id} URL
    }

    @GetMapping("/users")
    public List<User> getUserList() {
        //TODO: Calls user service GET /users URL
        return null;
    }

    @GetMapping("/users/{user_id}")
    public User viewUserProfileWithIssuedBooksDetail(@PathVariable(name = "user_id") Integer userId) {
        //TODO: calls user service GET /users/{user_id},
        //fetches book ids on user_id  from library table and
        //calls GET /books/{book_id} for all books. Displays consolidated data
        return null;
    }

    @PostMapping("/users/{user_id}")
    public void addUser(@PathVariable(name = "user_id") Integer userId) {
        //TODO: User Registration, calls user service POST /users/{user_id}
    }

    @DeleteMapping("/users/{user_id}")
    public void deleteUser(@PathVariable(name = "user_id") Integer userId) {
        //TODO: Calls DELETE users/{user_id}
    }

    @PutMapping("/users/{user_id}")
    public void updateUser(@PathVariable(name = "user_id") Integer userId) {
        //TODO: Calls PUT users/{user_id}
    }

    @PostMapping("/users/{user_id}/books/{book_id}")
    public void issueBookToUser(@PathVariable(name = "user_id") Integer userId,
                                @PathVariable(name = "book_id") Integer bookId) {
        //TODO: Updates library table with book-user association
    }

    @DeleteMapping("/users/{user_id}/books/{book_id}")
    public void removeIssuedBookFromUser(@PathVariable(name = "user_id") Integer userId,
                                @PathVariable(name = "book_id") Integer bookId) {
        //TODO: Delete book-user association in library table.
    }
}
