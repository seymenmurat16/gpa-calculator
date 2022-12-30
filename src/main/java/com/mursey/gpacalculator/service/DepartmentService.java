package com.mursey.gpacalculator.service;

import com.mursey.gpacalculator.entity.Department;
import com.mursey.gpacalculator.model.DepartmentModel;

import java.util.List;

public interface DepartmentService {
    List<DepartmentModel> getAllDepartments();
}
