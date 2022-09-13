package com.example.javatest.repository;

import java.util.List;

import com.example.javatest.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByPublished(boolean published);
    List<Book> findByTitleContaining(String title);
}
