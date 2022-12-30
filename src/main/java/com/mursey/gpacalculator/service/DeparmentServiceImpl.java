package com.mursey.gpacalculator.service;

import com.mursey.gpacalculator.entity.Department;
import com.mursey.gpacalculator.model.DepartmentModel;
import com.mursey.gpacalculator.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DeparmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<DepartmentModel> getAllDepartments() {
        List<Department> departmentList = departmentRepository.findAll();
        List<DepartmentModel>  departmentModelList = departmentList.stream().map(dep -> new DepartmentModel(dep.getId(), dep.getName())).collect(Collectors.toList());
        return departmentModelList;
    }
}
