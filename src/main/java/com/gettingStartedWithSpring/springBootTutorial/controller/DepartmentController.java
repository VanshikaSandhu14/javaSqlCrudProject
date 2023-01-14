package com.gettingStartedWithSpring.springBootTutorial.controller;

import com.gettingStartedWithSpring.springBootTutorial.entity.Department;
import com.gettingStartedWithSpring.springBootTutorial.service.DepartmentService;
import com.gettingStartedWithSpring.springBootTutorial.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

//    dependency injection and dependency control for object of department service
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
//        DepartmentService service = new DepartmentServiceImpl();

        return departmentService.saveDepartment(department);

    }

}
