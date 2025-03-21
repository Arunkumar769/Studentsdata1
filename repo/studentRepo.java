package com.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.entity.Students;

@Repository
public interface studentRepo extends JpaRepository<Students, Integer> {

}