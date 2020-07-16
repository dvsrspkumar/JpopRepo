package com.jpop4.bookservice.repository;

import com.jpop4.bookservice.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {
}
