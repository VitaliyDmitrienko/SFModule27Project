package org.example.utils;

import org.example.enums.StudyProfile;
import org.example.models.Statistics;
import org.example.models.Student;
import org.example.models.University;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StatisticsGenerator {
    private StatisticsGenerator () {
        System.out.println("Private constructor.");
        System.out.println("Forbidden to create this class instance.");
    }

    public static List<Statistics> statisticsCreator (List<Student> inputStudentList,
//    public static void statisticsCreator (List<Student> inputStudentList,
                                              List<University> inputUniversityList) {
        Set<StudyProfile> studyProfileStats = new HashSet<>();
        for (University university: inputUniversityList) {
            studyProfileStats.add(university.getMainProfile());
        }

        System.out.println(studyProfileStats);

        return null;
    }

}
