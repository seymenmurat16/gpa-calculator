package com.mursey.gpacalculator.service;


import com.mursey.gpacalculator.enums.Note;
import com.mursey.gpacalculator.model.LectureListForm;
import com.mursey.gpacalculator.model.LectureNote;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;


@Service
public class CalculationServiceImpl implements CalculationService {

    @Override
    public double calculateGPA(LectureListForm lectureListForm) {
        double currentSemesterPoints = 0;
        int currentSemesterCredit = 0;
        for (LectureNote lecturerNote : lectureListForm.getLectureNoteList()) {
            currentSemesterPoints = currentSemesterPoints + (Note.valueOf(lecturerNote.getNote()).getCoefficient() * lecturerNote.getCredit());
            currentSemesterCredit = currentSemesterCredit + lecturerNote.getCredit();
        }
        double currentTotalPoints = lectureListForm.getTotalCredit() * lectureListForm.getCurrentGPA();
        double totalPoins = currentTotalPoints + currentSemesterPoints;
        double gpa = totalPoins / (lectureListForm.getTotalCredit() + currentSemesterCredit);
        return Double.parseDouble(new DecimalFormat("##.##").format(gpa));
    }
}
