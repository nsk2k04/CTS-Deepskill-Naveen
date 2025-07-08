package com.example.demo.repository;

import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT s FROM Student s WHERE s.name = :name")
    List<Student> findByName(@Param("name") String name);

    @Transactional
    @Modifying
    @Query("UPDATE Student s SET s.email = :email WHERE s.name = :name")
    int updateEmailByName(@Param("email") String email, @Param("name") String name);

    @Transactional
    @Modifying
    @Query("DELETE FROM Student s WHERE s.name = :name")
    int deleteByName(@Param("name") String name);
}
