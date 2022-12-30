package com.mursey.gpacalculator.repository;

import com.mursey.gpacalculator.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
    List<Department> findDepartmentsByLecturesId(Long lectureId);
}
