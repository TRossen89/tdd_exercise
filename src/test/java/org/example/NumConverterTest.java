package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumConverterTest {

    @Test
    void convertArabic1ToRoman(){

        int input = 1;

        String expected = "I";

        NumConverter converter = new NumConverter();

        String output = converter.convertArabicToRoman(input);

        assertEquals(expected, output);
    }


    @Test
    void convertArabic2ToRoman(){

        int input = 2;

        String expected = "II";

        NumConverter converter = new NumConverter();

        String output = converter.convertArabicToRoman(input);

        assertEquals(expected, output);
    }

    @Test
    void convertArabic3ToRoman(){

        int input = 3;

        String expected = "III";

        NumConverter converter = new NumConverter();

        String output = converter.convertArabicToRoman(input);

        assertEquals(expected, output);
    }

    @Test
    void convertArabic4ToRoman(){

        int input = 4;

        String expected = "IV";

        NumConverter converter = new NumConverter();

        String output = converter.convertArabicToRoman(input);

        assertEquals(expected, output);
    }

    @Test
    void convertArabic5ToRoman(){

        int input = 5;

        String expected = "V";

        NumConverter converter = new NumConverter();

        String output = converter.convertArabicToRoman(input);

        assertEquals(expected, output);
    }

    @Test
    void convertArabic6ToRoman(){

        int input = 6;

        String expected = "VI";

        NumConverter converter = new NumConverter();

        String output = converter.convertArabicToRoman(input);

        assertEquals(expected, output);
    }


    @Test
    void convertArabic9ToRoman(){

        int input = 9;

        String expected = "IX";

        NumConverter converter = new NumConverter();

        String output = converter.convertArabicToRoman(input);

        assertEquals(expected, output);
    }

    @Test
    void convertArabic10ToRoman(){

        int input = 10;

        String expected = "X";

        NumConverter converter = new NumConverter();

        String output = converter.convertArabicToRoman(input);

        assertEquals(expected, output);
    }

    @Test
    void convertArabic11ToRoman(){

        int input = 11;

        String expected = "XI";

        NumConverter converter = new NumConverter();

        String output = converter.convertArabicToRoman(input);

        assertEquals(expected, output);
    }

    @Test
    void convertArabic14ToRoman(){

        int input = 14;

        String expected = "XIV";

        NumConverter converter = new NumConverter();

        String output = converter.convertArabicToRoman(input);

        assertEquals(expected, output);
    }

    @Test
    void convertArabic15ToRoman(){

        int input = 15;

        String expected = "XV";

        NumConverter converter = new NumConverter();

        String output = converter.convertArabicToRoman(input);

        assertEquals(expected, output);
    }

    @Test
    void convertArabic18ToRoman(){

        int input = 18;

        String expected = "XVIII";

        NumConverter converter = new NumConverter();

        String output = converter.convertArabicToRoman(input);

        assertEquals(expected, output);
    }

    @Test
    void convertArabic19ToRoman(){

        int input = 19;

        String expected = "XIX";

        NumConverter converter = new NumConverter();

        String output = converter.convertArabicToRoman(input);

        assertEquals(expected, output);
    }

    @Test
    void convertArabic20ToRoman(){

        int input = 20;

        String expected = "XX";

        NumConverter converter = new NumConverter();

        String output = converter.convertArabicToRoman(input);

        assertEquals(expected, output);
    }

    @Test
    void convertArabic23ToRoman(){

        int input = 23;

        String expected = "XXIII";

        NumConverter converter = new NumConverter();

        String output = converter.convertArabicToRoman(input);

        assertEquals(expected, output);
    }

    @Test
    void convertArabic24ToRoman(){

        int input = 24;

        String expected = "XXIV";

        NumConverter converter = new NumConverter();

        String output = converter.convertArabicToRoman(input);

        assertEquals(expected, output);
    }

    @Test
    void convertArabic25ToRoman(){

        int input = 25;

        String expected = "XXV";

        NumConverter converter = new NumConverter();

        String output = converter.convertArabicToRoman(input);

        assertEquals(expected, output);
    }

    @Test
    void convertArabic28ToRoman(){

        int input = 28;

        String expected = "XXVIII";

        NumConverter converter = new NumConverter();

        String output = converter.convertArabicToRoman(input);

        assertEquals(expected, output);
    }


    @Test
    void convertArabic36ToRoman(){

        int input = 36;

        String expected = "XXXVI";

        NumConverter converter = new NumConverter();

        String output = converter.convertArabicToRoman(input);

        assertEquals(expected, output);
    }


    @Test
    void convertArabic46ToRoman(){

        int input = 46;

        String expected = "XLVI";

        NumConverter converter = new NumConverter();

        String output = converter.convertArabicToRoman(input);

        assertEquals(expected, output);
    }

    @Test
    void convertArabic99ToRoman(){

        int input = 99;

        String expected = "XCIX";

        NumConverter converter = new NumConverter();

        String output = converter.convertArabicToRoman(input);

        assertEquals(expected, output);
    }






}
