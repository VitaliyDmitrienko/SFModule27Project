// Module 27.8 intermediate project (Statistics: Student/University)
package org.example.models;

import org.example.enums.StudyProfile;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;

public class Statistics {

    private StudyProfile studyProfile;
    private float avgExamScore;
    private int quantityProfileStudents;
    private int quantityProfileUniversity;
    private Set<String> universityListStat;
    private float tmpSumAvgExamScore;


    public Statistics (StudyProfile studyProfile, float avgExamScore,
                       int quantityProfileStudents,
                       int quantityProfileUniversity, Set<String> universityListStat) {
        this.studyProfile = studyProfile;
        this.avgExamScore = (avgExamScore);
        this.quantityProfileStudents = (quantityProfileStudents);
        this.quantityProfileUniversity = (quantityProfileUniversity);
//        this.avgExamScore = OptionalDouble.of(avgExamScore);
//        this.quantityProfileStudents = OptionalInt.of(quantityProfileStudents);
//        this.quantityProfileUniversity = OptionalInt.of(quantityProfileUniversity);
        this.universityListStat = universityListStat;
    }


    public StudyProfile getStudyProfile() {
        return studyProfile;
    }

    public void setStudyProfile(StudyProfile studyProfile) {
        this.studyProfile = studyProfile;
    }

    public float getAvgExamScore() {
        return avgExamScore;
    }

    public void setAvgExamScore(float setAvgExamScore) {
        this.avgExamScore = setAvgExamScore;
    }
    public void updateAvgExamScore(float addAvgExamScore) {
        tmpSumAvgExamScore += addAvgExamScore;
        float tmpAvgExamScore = tmpSumAvgExamScore / getQuantityProfileStudents();
        setAvgExamScore(tmpAvgExamScore);
    }

    public int getQuantityProfileStudents() {
        return quantityProfileStudents;
    }

    public void setQuantityProfileStudents(int quantityProfileStudents) {
        this.quantityProfileStudents = (quantityProfileStudents);
//        this.quantityProfileStudents = OptionalInt.of(quantityProfileStudents);
    }
    public void addQuantityProfileStudents(int addQuantityProfileStudents) {
        this.quantityProfileStudents += addQuantityProfileStudents;
    }

    public int getQuantityProfileUniversity() {
        return quantityProfileUniversity;
    }

    public void setQuantityProfileUniversity(int quantityProfileUniversity) {
        this.quantityProfileUniversity = (quantityProfileUniversity);
//        this.quantityProfileUniversity = OptionalInt.of(quantityProfileUniversity);
    }
    public void addQuantityProfileUniversity(int addQuantityProfileUniversity) {
        this.quantityProfileUniversity += addQuantityProfileUniversity;
    }
    public void updateQuantityProfileUniversity() {
        this.quantityProfileUniversity = (this.universityListStat.size());
//        this.quantityProfileUniversity = OptionalInt.of(this.universityListStat.size());
    }

    public Set<String> getUniversityListStat() {
        return universityListStat;
    }

    public void setUniversityListStat(Set<String> universityListStat) {
        this.universityListStat = universityListStat;
    }
    public void updateUniversityListStat(String updateUniversityListStat) {
        this.universityListStat.add(updateUniversityListStat);
    }

    @Override
    public String toString() {
        return "Statistics: {" +
                "studyProfile = " + studyProfile +
                ", avgExamScore = " + avgExamScore +
                ", quantityProfileStudents = " + quantityProfileStudents +
                ", quantityProfileUniversity = " + quantityProfileUniversity +
                ", universityListStat = " + universityListStat + '\'' +
                '}' + "\n";
    }
}
