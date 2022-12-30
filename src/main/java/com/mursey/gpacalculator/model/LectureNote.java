package com.mursey.gpacalculator.model;

import com.mursey.gpacalculator.entity.Lecture;
import lombok.Data;

@Data
public class LectureNote {
    private Lecture lecture;
    private String note;
    private int credit;
}
