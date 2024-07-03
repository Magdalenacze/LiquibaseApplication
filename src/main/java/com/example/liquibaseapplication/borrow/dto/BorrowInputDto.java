package com.example.liquibaseapplication.borrow.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@EqualsAndHashCode
public class BorrowInputDto {

    private Long readerId;
    private Long bookId;
}
