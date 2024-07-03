package com.example.liquibaseapplication.reader.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@EqualsAndHashCode
public class ReaderDto {

    private String name;
    private String surname;
}
