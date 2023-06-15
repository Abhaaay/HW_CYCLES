package ru.netology.HW_CYCLES.services;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CalcMonthServiceTest {
    @Test
    public void testCalculateMonthsOfRest() {
        CalcMonthService service = new CalcMonthService();
        int income = 10000; // доход от работы
        int expenses = 3000; // обязательные месячные траты
        int threshold = 20000; // пороговое значение денег на счету
        int expectedMonthsOfRest = 3; // ожидаемое количество месяцев отдыха
        int actualMonthsOfRest = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expectedMonthsOfRest, actualMonthsOfRest);
    }
}
