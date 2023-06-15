package ru.netology.HW_CYCLES.services;
public class CalcMonthService {
    public int calculate(int income, int expenses, int threshold) {
            int count = 0; // счётчик месяцев отдыха
            int money = 0; // количество денег на счету
            for (int month = 0; month < 12; month++) {
                if (money >= threshold) { // достаточно ли денег для отдыха?
                    money = (money - expenses) / 3; // уменьшение денег на обязательные затраты и расходы
                    count++; // увеличиваем счётчик месяцев отдыха
                } else {
                    money = money + income - expenses;
                }
            }
            return count;
        }
    }