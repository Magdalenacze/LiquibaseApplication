package com.example.liquibaseapplication.borrow.controller;

import com.example.liquibaseapplication.book.repository.FullBookRepository;
import com.example.liquibaseapplication.borrow.dto.BorrowInputDto;
import com.example.liquibaseapplication.borrow.entity.BorrowEntity;
import com.example.liquibaseapplication.borrow.repository.BorrowRepository;
import com.example.liquibaseapplication.reader.repository.ReaderRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/borrows")
public class BorrowController {

    private final BorrowRepository borrowRepository;
    private final FullBookRepository fullBookRepository;
    private final ReaderRepository readerRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createBorrow(@RequestBody BorrowInputDto borrowInputDto) {
        borrowRepository.save(new BorrowEntity(
                fullBookRepository.findById(borrowInputDto.getBookId()).get(),
                readerRepository.findById(borrowInputDto.getReaderId()).get()));
    }
}