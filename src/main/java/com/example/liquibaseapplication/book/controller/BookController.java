package com.example.liquibaseapplication.book.controller;

import com.example.liquibaseapplication.book.entity.BookEntity;
import com.example.liquibaseapplication.book.entity.FullBookEntity;
import com.example.liquibaseapplication.book.repository.BookRepository;
import com.example.liquibaseapplication.book.repository.FullBookRepository;
import com.example.liquibaseapplication.book.service.BookIsbnView;
import com.example.liquibaseapplication.book.service.BookView;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/books")
public class BookController {

    private final BookRepository bookRepository;
    private final FullBookRepository fullBookRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createBook() {
        fullBookRepository.save(new FullBookEntity(
                "1234567890",
                "Java dla zupełnie początkujących",
                "Tony",
                "Gaddis"));
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<BookEntity> getAllBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/full")
    @ResponseStatus(HttpStatus.OK)
    public List<FullBookEntity> getAllFullBooks() {
        return fullBookRepository.findAll();
    }

    @GetMapping("/view")
    @ResponseStatus(HttpStatus.OK)
    public List<BookView> getBookView() {
        return bookRepository.getAllBy();
    }

    @GetMapping("/isbn")
    @ResponseStatus(HttpStatus.OK)
    public BookIsbnView getIsbnByBookTitle(@RequestParam(name = "title") String title) {
        return bookRepository.getIsbnByTitle(title);
    }
}