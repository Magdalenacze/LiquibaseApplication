package com.example.liquibaseapplication.book.repository;

import com.example.liquibaseapplication.book.entity.FullBookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FullBookRepository extends JpaRepository<FullBookEntity, Long> {
}
