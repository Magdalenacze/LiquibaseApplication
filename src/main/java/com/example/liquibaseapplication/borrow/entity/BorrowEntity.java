package com.example.liquibaseapplication.borrow.entity;

import com.example.liquibaseapplication.book.entity.FullBookEntity;
import com.example.liquibaseapplication.reader.entity.ReaderEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Getter
@Table(name = "borrows")
public class BorrowEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private UUID borrowTechnicalId;

    @DateTimeFormat
    private LocalDateTime borrowDate;

    @DateTimeFormat
    private LocalDateTime returnDate;

    @ManyToOne
    @JoinColumn(name = "reader_id")
    private final ReaderEntity readerEntity;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private final FullBookEntity fullBookEntity;

    public BorrowEntity(FullBookEntity fullBookEntity, ReaderEntity readerEntity) {
        this.fullBookEntity = fullBookEntity;
        this.readerEntity = readerEntity;
        this.borrowTechnicalId = UUID.randomUUID();
        this.borrowDate = LocalDateTime.now();
        this.returnDate = null;
    }
}