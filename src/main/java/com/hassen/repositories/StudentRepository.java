package com.hassen.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hassen.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
