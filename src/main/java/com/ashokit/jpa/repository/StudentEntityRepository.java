package com.ashokit.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.jpa.entities.StudentEntity;

public interface StudentEntityRepository extends JpaRepository<StudentEntity, Integer> {

}
