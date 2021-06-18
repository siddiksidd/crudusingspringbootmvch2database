package com.vm.sb.mvc.crud.hibernate.thyme.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vm.sb.mvc.crud.hibernate.thyme.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository <Student, Long> { 
    List<Student> findByName(String name); 
}