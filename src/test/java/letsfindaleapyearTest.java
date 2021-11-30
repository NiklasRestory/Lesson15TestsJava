import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class letsfindaleapyearTest {
    letsfindaleapyear findaLeapYear;

    @BeforeAll
    static void AllSetUp() {
    }

    @AfterAll
    static void AllTearDown() {
    }

    @BeforeEach
    void setUp() {
        findaLeapYear = new letsfindaleapyear();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void Is2004aLeapYear() {
        assertTrue(findaLeapYear.IsALeapYear(2004));
    }

    @Test
    void Is2003aLeapYear() {
        assertFalse(findaLeapYear.IsALeapYear(2003));
    }

    @Test
    void Is1900aLeapYear() {
        assertFalse(findaLeapYear.IsALeapYear(1900));
    }

    @Test
    void Is2100aLeapYear() {
        assertFalse(findaLeapYear.IsALeapYear(2100));
    }

    @Test
    void Is2000aLeapYear() {
        assertTrue(findaLeapYear.IsALeapYear(2000));
    }

    @Test
    void Is2400aLeapYear() {
        assertTrue(findaLeapYear.IsALeapYear(2400));
    }

    @ParameterizedTest
    @ValueSource(ints = {2004, 2008, 1992, 1600, 2000})
    @Tag("ParemeterizedTest")
    void XIsALeapYear(int year) {
        assertTrue(findaLeapYear.IsALeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {2003, 2009, 1990, 1700, 1900})
    @Tag("ParemeterizedTest")
    void XIsNotALeapYear(int year) {
        assertFalse(findaLeapYear.IsALeapYear(year));
    }

    @ParameterizedTest
    @CsvSource(value = {"10, 2, hello", "15, 3, hello", "22,3, hello", "-19, 2, hello"})
    @DisplayName("Divide by Tests")
    @Tag("ParemeterizedTest")
    void DivideBy(int number, int by, String message)
    {
        System.out.println(message);
        boolean expected = number % by == 0;
        boolean actual = findaLeapYear.IsDivisibleBy(number, by);
        findaLeapYear.function(5);
        assertEquals(expected, actual);
    }



}

