package com.example.liquibaseapplication.book.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "books")
public class FullBookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String isbn;
    private String title;

    @Column
    private String authorsName;

    @Column
    private String authorsSurname;

    public FullBookEntity(String isbn, String title, String authorsName, String authorsSurname) {
        this.isbn = isbn;
        this.title = title;
        this.authorsName = authorsName;
        this.authorsSurname = authorsSurname;
    }
}