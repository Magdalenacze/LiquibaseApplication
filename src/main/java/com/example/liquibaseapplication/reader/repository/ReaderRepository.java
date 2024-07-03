package com.example.liquibaseapplication.reader.repository;

import com.example.liquibaseapplication.reader.dto.ReaderDto;
import com.example.liquibaseapplication.reader.entity.ReaderEntity;
import com.example.liquibaseapplication.reader.service.ReaderCloseProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReaderRepository extends JpaRepository<ReaderEntity, Long> {

    List<ReaderCloseProjection> findAllBy();

    List<ReaderDto> findAllProjectedBy();
}
