package com.mursey.gpacalculator.service;

import com.mursey.gpacalculator.entity.Lecture;

import java.util.List;

public interface LectureService {
    List<Lecture> getLecturesByDepartmentId(Long departmentId);
}
