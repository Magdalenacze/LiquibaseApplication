package com.example.liquibaseapplication.statistics;

import jakarta.persistence.*;

@Entity
@Table(name = "statisticsView")
public class Statistics {

    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "authorsName", column = @Column(name = "authorsName")),
            @AttributeOverride(name = "authorsSurname", column = @Column(name = "authorsSurname"))
    })
    private StatisticsCompositeId id;

    @Column(name = "percentageOfBorrows")
    private Double percentageOfBorrows;
}
