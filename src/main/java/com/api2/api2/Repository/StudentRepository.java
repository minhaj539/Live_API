package com.api2.api2.Repository;

import com.api2.api2.Models.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Transactional
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
