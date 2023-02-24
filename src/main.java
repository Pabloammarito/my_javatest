import assignment1.LogicsAndNumbersStuff;
import assignment1.StringHandler;

import static org.junit.Assert.assertEquals;

public class main {

    public static void main(String[]args) {


        int a = 5;
        int b = 3;
        int c = 21;
        LogicsAndNumbersStuff logicsAndNumbersStuff = new LogicsAndNumbersStuff();
        logicsAndNumbersStuff.diffMultipliedByC(5, 3, 21);


        boolean weekday1 = true;
        boolean vacation1 = false;
        boolean expected = false;
        LogicsAndNumbersStuff instance = new LogicsAndNumbersStuff();
        boolean actual = instance.canYouStayInBed(weekday1, vacation1);
        assertEquals("Can't stay in bed on weekdays if you are not on vacation", expected, actual);



        /*int[] numbers = {2,4,4};
        int expected = 10;
        LogicsAndNumbersStuff instance = new LogicsAndNumbersStuff();
        int[] actual = instance.sumOfNumbers(numbers);
        assertEquals(expected, actual);

        int[] numbersTwo = {2,-4,4,8,32};
        expected = 42;
        actual = instance.sumOfNumbers(numbersTwo);
        assertEquals(expected, actual);

         */




        /*int[] numbers = {2,4,4,6};
        double expected = 4.0;
        LogicsAndNumbersStuff instance = new LogicsAndNumbersStuff();
        double actual = instance.averageOfNumber(numbers);
        assertEquals(expected, actual, 0);

        int[] numbersTwo = {2,-4,4,6,2};
        expected = 2.0;
        actual = instance.averageOfNumber(numbersTwo);
        assertEquals(expected, actual, 0);

         */
        StringHandler handler = new StringHandler();





        }


    }






