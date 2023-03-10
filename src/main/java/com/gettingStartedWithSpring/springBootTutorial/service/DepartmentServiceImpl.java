package com.gettingStartedWithSpring.springBootTutorial.service;

import com.gettingStartedWithSpring.springBootTutorial.entity.Department;
import com.gettingStartedWithSpring.springBootTutorial.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
}
