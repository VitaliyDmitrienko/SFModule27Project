package org.example.utils;

import org.example.enums.StudyProfile;
import org.example.models.Statistics;
import org.example.models.Student;
import org.example.models.University;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StatisticsGenerator {
    private StatisticsGenerator () {
        System.out.println("Private constructor.");
        System.out.println("Forbidden to create this class instance.");
    }

    public static Set<Statistics> statisticsCreator (List<Student> inputStudentList,
                                              List<University> inputUniversityList) {

        Set<StudyProfile> studyProfileStats = new HashSet<>();
        Set<Statistics> outputStatistics = new HashSet<>();

        for (University university: inputUniversityList) {
            studyProfileStats.add(university.getMainProfile());
        }

        for (StudyProfile studyProfile: studyProfileStats) {
            Statistics currentStatistics = new Statistics(studyProfile,
                    0, 0, 0, "");
            for (University university : inputUniversityList) {
                for (Student student : inputStudentList) {
                    if (university.getMainProfile().equals(studyProfile)) {
                        if (university.getId().equals(student.getUniversityId())) {
                            currentStatistics.addQuantityProfileStudents(1);
                            currentStatistics.updateAvgExamScore(student.getAvgExamScore());
                            currentStatistics.updateQuantityProfileUniversity();
                            currentStatistics.updateUniversityListStat(university.getShortName());
                            outputStatistics.add(currentStatistics);
                        }
                    }
                }
            }
            outputStatistics.add(currentStatistics);

        }

        System.out.println(studyProfileStats);

        return outputStatistics;
    }

}
