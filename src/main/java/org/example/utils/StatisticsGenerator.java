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
        Statistics statistics;
        for (University university: inputUniversityList) {
            studyProfileStats.add(university.getMainProfile());
        }

        for (StudyProfile studyProfile: studyProfileStats) {
            for (University university: inputUniversityList) {
                for (Student student: inputStudentList) {
                    if (university.getId().equals(student.getUniversityId())); {
                        statistics.setQuantityProfileStudents(+1);
                        statistics.setAvgExamScore(+student.getAvgExamScore());
                        statistics.setStudyProfile(studyProfile);
                        statistics.setQuantityProfileUniversity(+1);
                        statistics.setUniversityListStat(university.getShortName());

                    }

                }

            }
        }

        System.out.println(studyProfileStats);

        return null;
    }

}
