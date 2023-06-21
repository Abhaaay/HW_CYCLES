package ru.netology.HW_CYCLES.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalcMonthServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Data.csv")
    public void testCalculateMonthsOfRest(int income, int expenses, int threshold, int expectedMonthsOfRest) {
        CalcMonthService service = new CalcMonthService();
        //int income = 10000; // доход от работы
        //int expenses = 3000; // обязательные месячные траты
        //int threshold = 20000; // пороговое значение денег на счету
        //int expectedMonthsOfRest = 3; // ожидаемое количество месяцев отдыха
        int actualMonthsOfRest = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expectedMonthsOfRest, actualMonthsOfRest);
    }
}
