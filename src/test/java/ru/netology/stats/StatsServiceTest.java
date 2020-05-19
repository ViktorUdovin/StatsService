package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @ParameterizedTest
    @CsvSource(value = {
            "8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18"
    })
    void totalAmount() {
        StatsService statsService = new StatsService();
        long[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = statsService.totalAmount(numbers);
        assertEquals(expected, actual);
    }
    @Test
    void averageAmount(){
        StatsService service = new StatsService();
        long[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.averageAmount(numbers);

        assertEquals(expected,actual);

    }
    @Test
    void findMaxValue(){
        StatsService service = new StatsService();

        long[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.findMaxValue(numbers);

        assertEquals(expected,actual);
    }
    @Test
    void findMinValue(){
        StatsService service = new StatsService();

        long[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 9;

        long actual = service.findMinValue(numbers);

        assertEquals(expected,actual);
    }
    @Test
    void amountAboveAverage(){
        StatsService service = new StatsService();

        long[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;

        long actual = service.amountAboveAverage(numbers);

        assertEquals(expected,actual);
    }
    @Test
    void AmountBelowAverage(){
        StatsService service = new StatsService();

        long[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;

        long actual = service.amountBelowAverage(numbers);

        assertEquals(expected,actual);
    }
}