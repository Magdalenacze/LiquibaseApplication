package com.example.liquibaseapplication.book.repository;

import com.example.liquibaseapplication.book.entity.BookEntity;
import com.example.liquibaseapplication.book.service.BookIsbnView;
import com.example.liquibaseapplication.book.service.BookView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {

    BookIsbnView getIsbnByTitle(String title);

    List<BookView> getAllBy();
}
