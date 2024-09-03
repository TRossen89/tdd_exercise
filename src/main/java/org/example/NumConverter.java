package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class NumConverter {

    public NumConverter() {
    }

    public String convertArabicToRoman(int number) {


        // Storing number as a String to make the digits into a List
        String numberStr = Integer.toString(number);


        // Creating an ArrayList of the digits
        List<Integer> digitArray = new ArrayList<>();

        // Populating the ArrayList
        for (char ch : numberStr.toCharArray()) {
            digitArray.add(Character.getNumericValue(ch));
        }

        int size = digitArray.size();

        // Initializing the returnValue (the Roman number)
        String returnValue = "";

        // Checking the number of digits in the number
        if (digitArray.size() == 3) {

            if (digitArray.get(0) == 9) {
                returnValue += "CM";

            } else if (digitArray.get(0) > 5) {

                returnValue += "D";

                for (int i = 0; i < digitArray.get(0) - 5; i++) {
                    returnValue += "C";
                }

            } else if (digitArray.get(0) == 5) {
                returnValue += "D";

            } else if (digitArray.get(0) == 4) {
                returnValue += "CD";

            } else if (digitArray.get(0) < 4) {

                for (int i = 0; i < digitArray.get(0); i++) {
                    returnValue += "C";
                }
            }

            digitArray.remove(0);


        }

        if (digitArray.size() == 2) {

            if (digitArray.get(0) == 9) {
                returnValue += "XC";

            } else if (digitArray.get(0) > 5) {

                returnValue += "L";

                for (int i = 0; i < digitArray.get(0) - 5; i++) {
                    returnValue += "X";
                }

            } else if (digitArray.get(0) == 5) {
                returnValue += "L";

            } else if (digitArray.get(0) == 4) {
                returnValue += "XL";

            } else if (digitArray.get(0) < 4) {

                for (int i = 0; i < digitArray.get(0); i++) {
                    returnValue += "X";
                }
            }

            digitArray.remove(0);

        }


        if (digitArray.get(0) == 9) {
            returnValue += "IX";

        } else if (digitArray.get(0) > 5) {

            returnValue += "V";

            for (int i = 0; i < digitArray.get(0) - 5; i++) {
                returnValue += "I";
            }

        } else if (digitArray.get(0) == 5) {
            returnValue += "V";

        } else if (digitArray.get(0) == 4) {
            returnValue += "IV";

        } else if (digitArray.get(0) < 4) {


            for (int i = 0; i < digitArray.get(0); i++) {
                returnValue += "I";
            }
        }

/*
        //#################################

        if (number == 25) {
            returnValue = "XXV";
        } else if (number == 24) {
            returnValue = "XXIV";
        } else if (number > 20) {
            returnValue = "XX";
            for (int i = 0; i < number - 20; i++) {
                returnValue += one;
            }
        } else if (number == 20) {
            returnValue = "XX";
        } else if (number == 19) {
            returnValue = "XIX";
        } else if (number > 15) {
            returnValue = "XV";
            for (int i = 0; i < number - 15; i++) {
                returnValue += one;
            }

        } else if (number == 15) {
            returnValue = "XV";
        } else if (number == 14) {
            returnValue = "XIV";
        } else if (number > 10) {
            returnValue = ten;
            for (int i = 0; i < number - 10; i++) {
                returnValue += one;
            }

        } else if (number == 10) {
            returnValue = ten;
        } else if (number == 9) {
            returnValue = "IX";
        } else if (number > 5) {
            returnValue = five;
            for (int i = 0; i < number - 5; i++) {
                returnValue += one;
            }

        } else if (number == 5) {
            returnValue = "V";
        } else if (number == 4) {
            returnValue = "IV";
        } else {
            for (int i = 0; i < number; i++) {
                returnValue += "I";
            }
        }


 */

        return returnValue;
    }


    public int[] getDigitsArray(int number) {

        String numberStr = Integer.toString(number);
        int length = numberStr.length();

        // Create an array to hold the digits
        int[] digits = new int[length];

        // Populate the array with digits
        for (int i = 0; i < length; i++) {
            digits[i] = Character.getNumericValue(numberStr.charAt(i));
        }

        return digits;
    }
}
