package com.percentage.percentage.service;

import org.springframework.stereotype.Service;

@Service
public class PercentageService {

    public double calculatePercentage (double totalMarks, double percentage){

        return (totalMarks * percentage) / 100;
    }


    public double calculateMarksObtained(double obtainedMarks, double completeMarks) {
        return (obtainedMarks / completeMarks) * 100;
    }



}
