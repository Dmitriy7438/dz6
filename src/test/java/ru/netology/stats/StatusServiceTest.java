package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatusServiceTest {

    @Test
    public void saleSum() {
        StatusService service = new StatusService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void saleMaxMonth() {
        StatusService service = new StatusService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.maxMonth(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void saleMinMonth() {
        StatusService service = new StatusService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.minMonth(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void averegeSumSele() {
        StatusService service = new StatusService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.averageSumSale(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void countMonthBelowAverage() {
        StatusService service = new StatusService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.countMonthBelowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void countMonthHigherAverege() {
        StatusService service = new StatusService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.countMonthHigherAverege(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

}
