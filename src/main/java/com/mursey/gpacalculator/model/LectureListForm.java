package com.mursey.gpacalculator.model;

import lombok.Data;

import java.util.List;

@Data
public class LectureListForm {
    private List<LectureNote> lectureNoteList;

    private float currentGPA;

    private int totalCredit;
}
