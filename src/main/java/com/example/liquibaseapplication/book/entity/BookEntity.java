package com.example.liquibaseapplication.book.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
//@Table(name = "books")
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String isbn;
    private String title;

    public BookEntity(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }
}