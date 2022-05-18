package ru.netology.stats;

public class StatusService {
    public int sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSumSale(int[] sales) {
        int averageSumSale = sum(sales) / sales.length;

        return averageSumSale;
    }

    public int maxMonth(int[] sales) {
        int maxMonth = 0;
        for (int month = 0; month < sales.length; month++) {
            if (sales[month] > sales[maxMonth]) {
                maxMonth = month;
            }
        }
        return maxMonth;
    }

    public int minMonth(int[] sales) {
        int minMonth = 0;
        for (int month = 0; month < sales.length; month++) {
            if (sales[month] < sales[minMonth]) {
                minMonth = month;
            }
        }
        return minMonth;
    }

    public int countMonthBelowAverage(int[] sales) {
        int average = averageSumSale(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }
    public int countMonthHigherAverege(int[] sales) {
        int average = averageSumSale(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;

    }

}
