package com.example.liquibaseapplication.statistics;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StatisticsRepository extends ViewRepository<Statistics, StatisticsCompositeId> {

    List<Statistics> findByIdNameAndSurname(String authorsName, String authorsSurname);
}
