package com.example.liquibaseapplication.statistics;

import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Embeddable
public class StatisticsCompositeId implements Serializable {

    private String authorsName;
    private String authorsSurname;
}