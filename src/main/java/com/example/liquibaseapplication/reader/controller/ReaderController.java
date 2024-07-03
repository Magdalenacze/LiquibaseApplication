package com.example.liquibaseapplication.reader.controller;

import com.example.liquibaseapplication.book.entity.BookEntity;
import com.example.liquibaseapplication.book.entity.FullBookEntity;
import com.example.liquibaseapplication.book.repository.BookRepository;
import com.example.liquibaseapplication.book.repository.FullBookRepository;
import com.example.liquibaseapplication.book.service.BookIsbnView;
import com.example.liquibaseapplication.reader.dto.ReaderDto;
import com.example.liquibaseapplication.reader.entity.ReaderEntity;
import com.example.liquibaseapplication.reader.repository.ReaderRepository;
import com.example.liquibaseapplication.reader.service.ReaderCloseProjection;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/readers")
public class ReaderController {

    private final ReaderRepository readerRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createReader() {
        readerRepository.saveAll(List.of(
                new ReaderEntity(UUID.randomUUID(), "Jan", "Kowalski"),
                new ReaderEntity(UUID.randomUUID(), "Anna", "Nowak")
        ));
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ReaderEntity> getAllReaders() {
        return readerRepository.findAll();
    }

    @GetMapping("/ids")
    @ResponseStatus(HttpStatus.OK)
    public List<ReaderCloseProjection> getReadersIds() {
        return readerRepository.findAllBy();
    }

    @GetMapping("/basic")
    @ResponseStatus(HttpStatus.OK)
    public List<ReaderDto> getAllBasicInfo() {
        return readerRepository.findAllProjectedBy();
    }
}