package com.gettingStartedWithSpring.springBootTutorial.repository;

import com.gettingStartedWithSpring.springBootTutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
