package com.example.liquibaseapplication.borrow.repository;

import com.example.liquibaseapplication.borrow.entity.BorrowEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowRepository extends JpaRepository<BorrowEntity, Long> {
}
