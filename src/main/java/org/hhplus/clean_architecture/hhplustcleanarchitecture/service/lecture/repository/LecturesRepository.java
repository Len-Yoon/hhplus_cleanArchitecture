package org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.repository;

import org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.dto.Lectures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LecturesRepository extends JpaRepository<Lectures, Integer> {

    List<Lectures> findAll();
}
