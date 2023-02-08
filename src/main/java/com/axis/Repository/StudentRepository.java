package com.axis.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.axis.models.Student;

public interface StudentRepository extends MongoRepository<Student, Integer>{

}
