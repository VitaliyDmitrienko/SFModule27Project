// Module 27.8 intermediate project (Statistics: Student/University)
package org.example.models;

import org.example.enums.StudyProfile;

import java.util.List;

public class Statistics {

    private StudyProfile studyProfile;
    private float avgExamScore;
    private int quantityProfileStudents;
    private int quantityProfileUniversity;
    private String universityListStat;

    public Statistics () {}

    public StudyProfile getStudyProfile() {
        return studyProfile;
    }

    public void setStudyProfile(StudyProfile studyProfile) {
        this.studyProfile = studyProfile;
    }

    public float getAvgExamScore() {
        return avgExamScore;
    }

    public void setAvgExamScore(float avgExamScore) {
        this.avgExamScore = avgExamScore;
    }

    public int getQuantityProfileStudents() {
        return quantityProfileStudents;
    }

    public void setQuantityProfileStudents(int quantityProfileStudents) {
        this.quantityProfileStudents = quantityProfileStudents;
    }

    public int getQuantityProfileUniversity() {
        return quantityProfileUniversity;
    }

    public void setQuantityProfileUniversity(int quantityProfileUniversity) {
        this.quantityProfileUniversity = quantityProfileUniversity;
    }

    public String getUniversityListStat() {
        return universityListStat;
    }

    public void setUniversityListStat(String universityListStat) {
        this.universityListStat = universityListStat;
    }

    public Statistics (StudyProfile studyProfile, float avgExamScore, int quantityProfileStudents,
                       int quantityProfileUniversity, String universityListStat) {}

}
