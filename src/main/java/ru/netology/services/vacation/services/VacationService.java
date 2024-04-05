package ru.netology.services.vacation.services;


public class VacationService {
        public int calculateVacation(int income, int expenses, int threshold) {
            int months = 0;
            int money = 0;
            for (int i = 0; i < 12; i++) {
                if (money >= threshold) {
                    months++;
                    money -= expenses;
                    money /= 3;
                } else {
                    money += income;
                    money-= expenses;
                }
            }
            return months;
        }
    }

