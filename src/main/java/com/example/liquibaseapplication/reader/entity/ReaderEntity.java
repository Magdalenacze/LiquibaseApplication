package com.example.liquibaseapplication.reader.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "readers")
public class ReaderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private UUID readerTechnicalId;
    private String name;
    private String surname;

    public ReaderEntity(UUID readerTechnicalId, String name, String surname) {
        this.readerTechnicalId = readerTechnicalId;
        this.name = name;
        this.surname = surname;
    }
}