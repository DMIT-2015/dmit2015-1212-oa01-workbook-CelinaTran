package ca.nait.dmit.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AlbertaCovid19SummaryData
{
    //Create data fields for each column in the CSV fie
    private int id;
    private LocalDate dateReported;
    private int numberOfLabTests;
    private int cumulativeNumberOfLabTests;
    private int numberOfCases;
    private int cumulativeNumberOfCases;
    private int activeCases;
    private int currentlyHospitalized;
    private int currentlyInICU;
    private int cumulativeNumberOfDeaths;
    private int numberOfDeaths;
    private int numberOfVariantsOfConcern;
    private double percentPositivity;
}
