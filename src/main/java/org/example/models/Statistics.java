// Module 27.8 intermediate project (Statistics: Student/University)
package org.example.models;

import org.example.enums.StudyProfile;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;

public class Statistics {

    private StudyProfile studyProfile;
    private OptionalDouble avgExamScore;
    private OptionalInt quantityProfileStudents;
    private OptionalInt quantityProfileUniversity;
    private String universityListStat;
    private OptionalDouble tmpSumAvgExamScore;


    public Statistics () {}
    public Statistics (StudyProfile studyProfile, float avgExamScore,
                       int quantityProfileStudents,
                       int quantityProfileUniversity, String universityListStat) {
        this.studyProfile = studyProfile;
        this.avgExamScore = OptionalDouble.of(avgExamScore);
        this.quantityProfileStudents = OptionalInt.of(quantityProfileStudents);
        this.quantityProfileUniversity = OptionalInt.of(quantityProfileUniversity);
        this.universityListStat = universityListStat;
    }


    public StudyProfile getStudyProfile() {
        return studyProfile;
    }

    public void setStudyProfile(StudyProfile studyProfile) {
        this.studyProfile = studyProfile;
    }

    public OptionalDouble getAvgExamScore() {
        return avgExamScore;
    }

    public void setAvgExamScore(OptionalDouble avgExamScore) {
        this.avgExamScore = avgExamScore;
    }
    public void updateAvgExamScore(OptionalDouble addAvgExamScore) {
        tmpSumAvgExamScore = tmpSumAvgExamScore.add(addAvgExamScore);
        OptionalDouble tmpAvgExamScore = tmpSumAvgExamScore / getQuantityProfileStudents();
        setAvgExamScore(tmpAvgExamScore);
    }

    public OptionalInt getQuantityProfileStudents() {
        return quantityProfileStudents;
    }

    public void setQuantityProfileStudents(int quantityProfileStudents) {
        this.quantityProfileStudents = OptionalInt.of(quantityProfileStudents);
    }
    public void addQuantityProfileStudents(int addQuantityProfileStudents) {
        this.quantityProfileStudents += addQuantityProfileStudents;
    }

    public OptionalInt getQuantityProfileUniversity() {
        return quantityProfileUniversity;
    }

    public void setQuantityProfileUniversity(int quantityProfileUniversity) {
        this.quantityProfileUniversity = OptionalInt.of(quantityProfileUniversity);
    }
    public void addQuantityProfileUniversity(OptionalInt addQuantityProfileUniversity) {
        this.quantityProfileUniversity += addQuantityProfileUniversity;
    }
    public void updateQuantityProfileUniversity() {
        this.quantityProfileUniversity = this.universityListStat.size();
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
