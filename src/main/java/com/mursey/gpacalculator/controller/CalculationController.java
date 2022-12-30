package com.mursey.gpacalculator.controller;

import com.mursey.gpacalculator.entity.Lecture;
import com.mursey.gpacalculator.model.DepartmentModel;
import com.mursey.gpacalculator.model.LectureListForm;
import com.mursey.gpacalculator.service.CalculationService;
import com.mursey.gpacalculator.service.DepartmentService;
import com.mursey.gpacalculator.service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CalculationController {

    @Autowired
    private CalculationService calculationService;
    @Autowired
    private LectureService lectureService;

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/getGPA")
    public ResponseEntity<Double> getGPA(@RequestBody LectureListForm lectureListForm) {
        return ResponseEntity.ok(calculationService.calculateGPA(lectureListForm));
    }

    @GetMapping("/departments/{departmentId}/lectures")
    public ResponseEntity<List<Lecture>> getLecturesByDepartmentId(@PathVariable Long departmentId) {
        return ResponseEntity.ok(lectureService.getLecturesByDepartmentId(departmentId));
    }

    @GetMapping("/departments")
    public ResponseEntity<List<DepartmentModel>> getDepartments() {
        return ResponseEntity.ok(departmentService.getAllDepartments());
    }
}