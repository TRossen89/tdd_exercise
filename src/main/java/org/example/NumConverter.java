package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class NumConverter {

    public NumConverter() {
    }

    public String convertArabicToRomanOriginal(int number) {


        // Storing number as a String to make the digits into a List
        String numberStr = Integer.toString(number);


        // Creating an ArrayList of the digits
        List<Integer> digitArray = new ArrayList<>();

        // Populating the ArrayList
        for (char ch : numberStr.toCharArray()) {
            digitArray.add(Character.getNumericValue(ch));
        }


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



    public String convertArabicToRomanRefactor1(int number) {

        // Storing number as a String to make the digits into a List
        String numberStr = Integer.toString(number);

        // Creating an ArrayList of the digits
        List<Integer> digitArray = new ArrayList<>();

        // Populating the ArrayList
        for (char ch : numberStr.toCharArray()) {
            digitArray.add(Character.getNumericValue(ch));
        }

        String returnValue = "";

        int digitNumber = digitArray.size();

        while (digitNumber > 0) {


            if (digitArray.get(0) >= 5) {

                String tempValue = "";


                if (digitNumber == 1) {
                    tempValue += "IX";
                }
                if (digitNumber == 2) {
                    tempValue += "XC";
                }
                if (digitNumber == 3) {
                    tempValue += "CM";
                }

                if (digitArray.get(0) == 9) {
                    returnValue += tempValue;

                } else {
                    String loopValue = tempValue.substring(0, tempValue.length() - 1);

                    if (digitArray.get(0) < 9) {
                        if (digitNumber == 1) {
                            returnValue += "V";
                        }
                        if (digitNumber == 2) {
                            returnValue += "L";
                        }
                        if (digitNumber == 3) {
                            returnValue += "D";
                        }

                        if (digitArray.get(0) != 5) {
                            for (int i = 0; i < digitArray.get(0) - 5; i++) {
                                returnValue += loopValue;
                            }
                        }
                    }
                }

            } else if (digitArray.get(0) <= 4) {

                String tempReturn = "";

                if (digitNumber == 1) {
                    tempReturn += "IV";
                }
                if (digitNumber == 2) {
                    tempReturn += "XL";
                }
                if (digitNumber == 3) {
                    tempReturn += "CD";
                }

                if (digitArray.get(0) == 4) {
                    returnValue += tempReturn;

                } else {
                    tempReturn = tempReturn.substring(0, tempReturn.length() - 1);

                    for (int i = 0; i < digitArray.get(0); i++) {
                        returnValue += tempReturn;
                    }
                }
            }

            digitArray.remove(0);
            digitNumber -= 1;
        }

        return returnValue;
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

        String returnValue = "";

        int digitNumber = digitArray.size();

        while (digitNumber > 0) {

            String tempValNine = "";
            String tempValFour = "";

            if (digitNumber == 1) {
                tempValFour += "IV";
                tempValNine += "IX";

            }
            if (digitNumber == 2) {
                tempValFour += "XL";
                tempValNine += "XC";

            }
            if (digitNumber == 3) {
                tempValFour += "CD";
                tempValNine += "CM";
            }

            //TODO: NOT THE CORRECT ROMAN LETTERS/NUMBERS - MAYBE EDIT THIS

            if (digitNumber == 4) {
                tempValFour += "MF";
                tempValNine += "MT";
            }

            if (digitArray.get(0) >= 5) {

                if (digitArray.get(0) == 9) {
                    returnValue += tempValNine;

                } else {
                    String loopValue = tempValNine.substring(0, tempValNine.length() - 1);
                    String addToFiveValue = tempValFour.substring(1);

                    if (digitArray.get(0) < 9) {

                        returnValue += addToFiveValue;

                        if (digitArray.get(0) != 5) {
                            for (int i = 0; i < digitArray.get(0) - 5; i++) {
                                returnValue += loopValue;
                            }
                        }
                    }
                }
            } else if (digitArray.get(0) <= 4) {

                if (digitArray.get(0) == 4) {
                    returnValue += tempValFour;

                } else {
                    tempValFour = tempValFour.substring(0, tempValFour.length() - 1);

                    for (int i = 0; i < digitArray.get(0); i++) {
                        returnValue += tempValFour;
                    }
                }
            }
            digitArray.remove(0);
            digitNumber -= 1;
        }

        return returnValue;
    }

    /*
            if (digitArray.get(0) == 9) {

                //A switch would maybe be better
                if (digitNumber == 1) {
                    returnValue += "IX";
                }
                if (digitNumber == 2) {
                    returnValue += "XC";
                }
                if (digitNumber == 3) {
                    returnValue += "CM";
                }


            } else*/


        /*
            } else if (digitArray.get(0) == 5) {

                //A switch would maybe be better
                if (digitNumber == 1) {
                    returnValue += "V";
                }
                if (digitNumber == 2) {
                    returnValue += "L";
                }
                if (digitNumber == 3) {
                    returnValue += "D";
                }
                */

/*
            } else if (digitArray.get(0) == 4) {
                if (digitNumber == 1) {
                    returnValue += "IV";
                }
                if (digitNumber == 2) {
                    returnValue += "XL";
                }
                if (digitNumber == 3) {
                    returnValue += "CD";
                }

 */



            /*

                    //A switch would maybe be better
                    if (digitNumber == 1) {
                        returnValue += "I";
                    }
                    if (digitNumber == 2) {
                        returnValue += "X";
                    }
                    if (digitNumber == 3) {
                        returnValue += "C";
                    }

             */



}
