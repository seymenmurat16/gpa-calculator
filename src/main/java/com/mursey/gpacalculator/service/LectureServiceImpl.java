package com.mursey.gpacalculator.service;

import com.mursey.gpacalculator.entity.Lecture;
import com.mursey.gpacalculator.repository.LectureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LectureServiceImpl implements LectureService{
    @Autowired
    private LectureRepository lectureRepository;


    @Override
    public List<Lecture> getLecturesByDepartmentId(Long departmentId) {
        return lectureRepository.findLecturesByDepartmentsId(departmentId);
    }
}
