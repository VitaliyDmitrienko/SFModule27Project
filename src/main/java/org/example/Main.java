// Module 27.8 intermediate project (Statistics: Student/University)
package org.example;


import org.example.models.Statistics;
import org.example.models.Student;
import org.example.models.University;
import org.example.utils.JsonUtils;
import org.example.utils.StatisticsGenerator;
import org.example.utils.XLSXFileReader;
import org.example.utils.XLSXFileWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) throws IOException {

//        Utility  Class XLSXFileReader() has private constructor & forbidden to create instance
//        System.out.println(new XLSXFileReader());

//        Utility Class UnitedComparator() has private constructor & forbidden to create instance
//        System.out.println(new UnitedComparator());

//        Utility Class JsonUtils() has private constructor & forbidden to create instance
//        System.out.println(new JsonUtils());

//        Utility Class XLSXFileWriter() has private constructor & forbidden to create instance
//        System.out.println(new XLSXFileWriter());

        String outputFilePath = "src\\main\\resources\\StatisticsOutput.xlsx";


        List<Student> studentDataStorage = new ArrayList<>(XLSXFileReader.getStudentData());
        List<University> universityDataStorage = new ArrayList<>(XLSXFileReader.getUniversityData());

//        System.out.println("Main Class & other classes templates Test.");

        List<Statistics> finalStatistics = StatisticsGenerator.statisticsCreator(studentDataStorage, universityDataStorage);
//        System.out.println(finalStatistics);

        XLSXFileWriter.generateStatistics(finalStatistics, outputFilePath);



    }
}