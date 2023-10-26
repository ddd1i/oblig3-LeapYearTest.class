package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.testng.annotations.Test;

public class LeapYearTest {

    @Test
    public void testLeapYear() {
        assertTrue(LeapYear.isLeapYear(2000));
        assertTrue(LeapYear.isLeapYear(2016));
        assertTrue(LeapYear.isLeapYear(2400));
    }

    @Test
    public void testNonLeapYear() {
        assertFalse(LeapYear.isLeapYear(1700));
        assertFalse(LeapYear.isLeapYear(1800));
        assertFalse(LeapYear.isLeapYear(1900));
    }


    @Test
    public void testLeapYearWithDivisibleBy4NotBy100() {
        assertTrue(LeapYear.isLeapYear(2008));
        assertTrue(LeapYear.isLeapYear(2012));
    }

    @Test
    public void testLeapYearWithDivisibleBy4AndBy100AndBy400() {
        assertTrue(LeapYear.isLeapYear(1600));
        assertTrue(LeapYear.isLeapYear(2400));
        assertTrue(LeapYear.isLeapYear(2000));
        assertTrue(LeapYear.isLeapYear(2440));
    }
//When it is not divisible by 4
    @Test
    public void testNonLeapYearNotDivisibleBy4() {
        assertFalse(LeapYear.isLeapYear(2017));
        assertFalse(LeapYear.isLeapYear(2019));
        assertFalse(LeapYear.isLeapYear(2021));
        assertFalse(LeapYear.isLeapYear(2023));
    }
//When it is divisible by 100 but not 400
    @Test
    public void testNonLeapYearDivisibleBy100NotBy400() {
        assertFalse(LeapYear.isLeapYear(1700));
        assertFalse(LeapYear.isLeapYear(1800));
        assertFalse(LeapYear.isLeapYear(1900));
        assertFalse(LeapYear.isLeapYear(2100));
    }



}
