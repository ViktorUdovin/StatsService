package ru.netology.stats;

public class StatsService {

    public long totalAmount(long[] numbers) {
        long amount = 0;
        for (long number : numbers) {
            amount += number;
        }
        return amount;
    }

    public long averageAmount(long[] numbers) {
        long amount = totalAmount(numbers);
        long average = amount / numbers.length;

        return average;
    }

    public long findMaxValue(long[] numbers) {
        long indexOfmax = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] >= numbers[(int) indexOfmax]) {
                indexOfmax = i;
            }
        }
        return indexOfmax + 1;
    }


    public long findMinValue(long[] numbers) {
        long indexOfmin = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] <= numbers[(int) indexOfmin]) {
                indexOfmin = i;
            }
        }
        return indexOfmin + 1;
    }
    public long amountAboveAverage(long[] numbers) {
        long average = averageAmount(numbers);
        long amountAbove = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > average) {
                amountAbove += 1;
            }
        }
        return amountAbove;
    }
    public long amountBelowAverage(long[] numbers) {
        long average = averageAmount(numbers);
        long amounbelow = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < average) {
                amounbelow += 1;
            }
        }
        return amounbelow;
    }
}

